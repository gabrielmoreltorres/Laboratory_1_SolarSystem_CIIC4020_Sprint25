package Classes;

/**
 * Represents the Sun, a specific implementation of the {@link CelestialBody} interface.
 * The Sun has properties such as mass, radius, coordinates, and name. 
 * Additionally, this class provides a static reference to an image of the Sun.
 */

 //Pull request test

public class Sun implements CelestialBody /*TODO*/ {

	/**
	 * Static path to the image of the Sun.
	 */
	private static final String SUN_IMAGE = "./src/resources/Sun.jpg";


	//TODO ADD THE FOLLOWING:
	//PRIVATE FIELDS
	private String name = "Sun";
	private double mass;
	private double radius;
	private int[] coordinates;

	//CONSTRUCTOR,
	public Sun(double sunMass, double sunRadius, int[] sunCoordinates){
		if(sunMass <= 0 || sunRadius <= 0){
			throw new IllegalArgumentException("Mass or Radius cannot be negative");
		}
		if(sunCoordinates.length < 2 || sunCoordinates.length > 2){
			throw new IllegalArgumentException("Only provide X and Y coordinates");
		}
		mass = sunMass;
		radius = sunRadius;
		coordinates = sunCoordinates;
	}

	//GETTERS,
	public double getMass(){
		return this.mass;
	}

	public double getRadius(){
		return this.radius;
	}

	public String getName(){
		return this.name;
	}

	public int[] getCoordinates(){
		return this.coordinates;
	}

	//SETTERS
	public void setMass(double mass){
		if(mass > 0){
			this.mass = mass;
		}
		else{
			throw new IllegalArgumentException("Mass cannot be negative");
		}
	}

	public void setRadius(double radius){
		if(radius > 0){
			this.radius = radius;
		}
		else{
			throw new IllegalArgumentException("Radius cannot be negative")
		}
	}

	public void setName(String name){
		this.name = name;
	}

	public void setCoordinates(int[] sunCoordinates){
		if(sunCoordinates.length != 2){
			throw new IllegalArgumentException("Only provide X and Y coordinates");
		}
		else{
			this.coordinates = sunCoordinates;
		}
	}
	


	/**
	 * Retrieves the file path to the image of the Sun.
	 * 
	 * @return the file path to the Sun's image as a String.
	 */
	public String getImage() {
		return SUN_IMAGE;
	}
}
