package Classes;

/**
 * Represents Saturn, a specific implementation of the {@link Planet} class.
 * Saturn is initialized with its unique properties and provides an image path for rendering.
 * 
 */

public class Saturn extends Planet /*TODO*/ {

    private static final String SATURN_IMAGE = "./src/resources/Saturn.png";

    /**
     * Constructs a new Saturn object with the specified properties.
     * 
     * @param mass      the mass of Saturn in kilograms. Must be positive.
     * @param radius    the radius of Saturn in kilometers. Must be positive.
     * @param position  the initial position of Saturn as a double array [x, y]. 
     *                  Must not be null and must have exactly two elements.
     * @param velocity  the initial velocity of Saturn as a double array [vx, vy]. 
     *                  Must not be null and must have exactly two elements.
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public Saturn(double mass, double radius, double[] position, double[] velocity) {
        /**
         * TODO Add your solution here
         * Hint: Lookup the keyword Super
         * */
        super(SATURN_IMAGE, mass, radius, position, velocity);
    }

    /**
     * Retrieves the file path to the image of Saturn.
     * 
     * @return the file path to Saturn's image as a String.
     */
    @Override
    public String getImage() {
        return SATURN_IMAGE;
    }
}
