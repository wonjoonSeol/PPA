/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models destination
 */
public class Destination{
	private String name;	
	private Coordinates coordinates;

	/**
     * method Destination constructs object with name, coordinates when initialised
     */
	public Destination(String name, Coordinates coordinates){
		this.name = name;
		this.coordinates = coordinates;
	}

	/**
     * method getName returns name
     */
	public String getName(){
		return name;
	}

	/**
     * method getCoordinates returns coordinates
     */
	public Coordinates getCoordinates(){
		return coordinates;
	}
}
