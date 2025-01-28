package Classes;

/**
 * Represents a celestial body with basic properties such as mass, radius, name, 
 * and coordinates. This interface defines a blueprint for celestial body objects, 
 * providing getter and setter methods for each property.
 *
 */
public interface CelestialBody {
	//TODO ADD THE FOLLOWING:
	//GETTERS
	public double getMass();
	public double getRadius();
	public String getName();
	public int[] getCordinates();

	//SETTERS
	public double setMass(double mass);
	public double setRadius(double radius);
	public String setName(String name);
	public int[] setCordinates(int[] coordinates);

}
