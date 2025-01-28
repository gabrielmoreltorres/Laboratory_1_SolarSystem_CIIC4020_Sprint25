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
	double getMass();
	double getRadius();
	String getName();
	int[] getCoordinates();

	//SETTERS
	void setMass(double mass);
	void setRadius(double radius);
	void setName(String name);
	void setCoordinates(int[] coordinates);

}
