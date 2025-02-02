package Classes;

/**
 * Represents the Sun, a specific implementation of the {@link CelestialBody} interface.
 * The Sun has properties such as mass, radius, coordinates, and name. 
 * Additionally, this class provides a static reference to an image of the Sun.
 */

 //Pull request test

public class Sun /*TODO*/ {

	/**
	 * Static path to the image of the Sun.
	 */
	private static final String SUN_IMAGE = "./src/resources/Sun.jpg";



	/*TODO ADD THE FOLLOWING:
	 * PRIVATE FIELDS, 
	 * CONSTRUCTOR, 
	 * GETTERS, 
	 * SETTERS, 
	 */


	/**
	 * Retrieves the file path to the image of the Sun.
	 * 
	 * @return the file path to the Sun's image as a String.
	 */
	public String getImage() {
		return SUN_IMAGE;
	}
}
