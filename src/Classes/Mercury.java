package Classes;

/**
 * Represents Mercury, a specific implementation of the {@link Planet} class.
 * Mercury is initialized with its unique properties and provides an image path for rendering.
 * 
 */

public class Mercury extends Planet /*TODO*/ {

    private static final String MERCURY_IMAGE = "./src/resources/Mercury.png";

    /**
     * Constructs a new Mercury object with the specified properties.
     * 
     * @param mass      the mass of Mercury in kilograms. Must be positive.
     * @param radius    the radius of Mercury in kilometers. Must be positive.
     * @param position  the initial position of Mercury as a double array [x, y]. 
     *                  Must not be null and must have exactly two elements.
     * @param velocity  the initial velocity of Mercury as a double array [vx, vy]. 
     *                  Must not be null and must have exactly two elements.
     * @throws IllegalArgumentException if any parameter is invalid.
     */
    public Mercury(double mass, double radius, double[] position, double[] velocity) {
    	/**
         * TODO Add your solution here
         * Hint: Lookup the keyword Super
         * */
        super(MERCURY_IMAGE, mass, radius, position, velocity);
    }

    /**
     * Retrieves the file path to the image of Mercury.
     * 
     * @return the file path to Mercury's image as a String.
     */
    @Override
    public String getImage() {
        return MERCURY_IMAGE;
    }
}
