package Classes;

/**
 * Represents an abstract implementation of a planet, which is a celestial body
 * with properties such as mass, radius, position, velocity, and acceleration.
 * This class provides methods to simulate the gravitational interaction between
 * the planet and the Sun, as well as rendering-related functionality.
 *
 */
public abstract class Planet implements CelestialBody {

    private static final double GRAVITATIONAL_CONSTANT = 6.674e7;

    private double mass;               // Mass of the planet in kilograms
    private double radius;             // Radius of the planet in kilometers
    private double[] position;         // Position of the planet in continuous space [x, y]
    private double[] velocity;         // Velocity of the planet [vx, vy]
    private double[] acceleration;     // Acceleration of the planet [ax, ay]
    private String name;               // Name of the planet
    private int[] coordinates;         // Screen-rendered coordinates [x, y]
    
    /**
     * Updates the planet's position based on the gravitational force from the Sun.
     * 
     * @param sunPosition the position of the Sun as a double array [x, y].
     * @param sunMass     the mass of the Sun in kilograms.
     * @param timeStep    the time step for the simulation in seconds.
     * @throws IllegalArgumentException if the sunPosition is null or invalid.
     */
    public void updatePosition(double[] sunPosition, double sunMass, double timeStep) {
        
        /*TODO add your solution here*/
        
        if (sunMass <= 0) {
            throw new IllegalArgumentException("Sun Mass must be positive.");
        }
        if (this.getPosition()==null || sunPosition == null || position.length != 2 || sunPosition.length !=2) {
            throw new IllegalArgumentException("Position must be a non-null array of two elements.");
        }

        double dx = sunPosition[0]-this.position[0];
        double dy = sunPosition[1]-this.position[1];

        /*TODO Calculate the distance between the Sun and the Planet*/
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

        /*TODO Calculate the gravitational force*/
        double gravForce = (GRAVITATIONAL_CONSTANT*this.getMass()*sunMass)/Math.pow(distance, 2);

        /*TODO Calculate the acceleration*/
        double ax = gravForce*(dx/distance)/this.getMass();
        double ay = gravForce*(dy/distance)/this.getMass();

        acceleration[0] = ax;
        acceleration[1] = ay;

        // Update velocity
        velocity[0] += ax * timeStep;
        velocity[1] += ay * timeStep;

        // Update position
        position[0] += velocity[0] * timeStep;
        position[1] += velocity[1] * timeStep;


        // Update screen coordinates (for rendering)
        coordinates[0] = (int) position[0];
        coordinates[1] = (int) position[1];
    }

    /**
     * Constructs a new Planet object with the specified properties.
     * 
     * @param name      the name of the planet.
     * @param mass      the mass of the planet in kilograms. Must be positive.
     * @param radius    the radius of the planet in kilometers. Must be positive.
     * @param position  the initial position of the planet as a double array [x, y]. 
     *                  Must not be null and must have exactly two elements.
     * @param velocity  the initial velocity of the planet as a double array [vx, vy]. 
     *                  Must not be null and must have exactly two elements.
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public Planet(String name, double mass, double radius, double[] position, double[] velocity) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (mass <= 0) {
            throw new IllegalArgumentException("Mass must be positive.");
        }
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        if (position == null || position.length != 2) {
            throw new IllegalArgumentException("Position must be a non-null array of two elements.");
        }
        if (velocity == null || velocity.length != 2) {
            throw new IllegalArgumentException("Velocity must be a non-null array of two elements.");
        }

        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.position = position.clone();
        this.velocity = velocity.clone();
        this.acceleration = new double[]{0, 0};
        this.coordinates = new int[]{(int) position[0], (int) position[1]};
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void setMass(double mass) {
        if (mass <= 0) {
            throw new IllegalArgumentException("Mass must be positive.");
        }
        this.mass = mass;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getMass() {
        return mass;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getRadius() {
        return radius;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] getCoordinates() {
        return coordinates.clone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCoordinates(int[] coordinates) {
        if (coordinates == null || coordinates.length != 2) {
            throw new IllegalArgumentException("Coordinates must be a non-null array of two elements.");
        }
        this.coordinates = coordinates.clone();
    }

    /**
     * Retrieves the position of the planet in continuous space.
     * 
     * @return the position of the planet as a double array [x, y].
     */
    public double[] getPosition() {
        return position.clone();
    }

    /**
     * Retrieves the velocity of the planet.
     * 
     * @return the velocity of the planet as a double array [vx, vy].
     */
    public double[] getVelocity() {
        return velocity.clone();
    }


    /**
     * Retrieves the file path to the image of the planet.
     * 
     * @return the file path to the planet's image as a String.
     */
    public abstract String getImage();
}
