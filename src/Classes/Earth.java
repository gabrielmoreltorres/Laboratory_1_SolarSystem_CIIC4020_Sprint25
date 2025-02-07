package Classes;

/**
 * Represents the Earth, a specific implementation of the {@link Planet} class.
 * The Earth is initialized with its unique properties and provides an image path for rendering.
 * 
 */
public class Earth extends Planet /*TODO*/ {

    private static final String EARTH_IMAGE = "./src/resources/Earth.png";

    /**
     * Constructs a new Earth object with the specified properties.
     * 
     * @param mass      the mass of the Earth in kilograms. Must be positive.
     * @param radius    the radius of the Earth in kilometers. Must be positive.
     * @param position  the initial position of the Earth as a double array [x, y]. 
     *                  Must not be null and must have exactly two elements.
     * @param velocity  the initial velocity of the Earth as a double array [vx, vy]. 
     *                  Must not be null and must have exactly two elements.
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public Earth(double mass, double radius, double[] position, double[] velocity) {
    	/**
         * TODO Add your solution here
         * Hint: Lookup the keyword Super
         * */
        super(EARTH_IMAGE, mass, radius, position, velocity);
    }

    /**
     * Retrieves the file path to the image of the Earth.
     * 
     * @return the file path to the Earth's image as a String.
     */
    @Override
    public String getImage() {
        return EARTH_IMAGE;
    }
}
