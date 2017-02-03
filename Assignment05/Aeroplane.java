/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class has a characteristics of a plane
 */
public class Aeroplane{
	private String name;
	private Coordinates coordinates;
	private int speed;
	private int totalDistance;
	private int repairDistance;

	/**
     * method Aeroplane constructs object with name, coordinates, speed, totalDistance, repairDistance when initialised
     */
	public Aeroplane(String name, Coordinates coordinates, int speed, int totalDistance, int repairDistance){
		this.name = name;
		this.coordinates = coordinates;
		this.speed = speed;
		this.totalDistance = totalDistance;
		this.repairDistance = repairDistance;
	}

	/**
     * method Aeroplane constructs object with name, coordinates, speed, totalDistance, repairDistance when initialised
     */
	public int singleFlight(Destination destination){
		int distance = 0;
		while ((coordinates.getX() != destination.getCoordinates().getX()) 			
			|| (coordinates.getY() != destination.getCoordinates().getY())) { 			//current coordinates are not equal to destination
			
			//coordinates x
			if (coordinates.getX() >= destination.getCoordinates().getX()				
			 && coordinates.getX() - destination.getCoordinates().getX() <= speed) {	//coordinate x is greater than destination x but its difference is less than speed
				distance += coordinates.getX() - destination.getCoordinates().getX();	//add its positive difference to distance	
				coordinates.setX(destination.getCoordinates().getX());
								
			}else if (destination.getCoordinates().getX() >= coordinates.getX()
					&& destination.getCoordinates().getX() - coordinates.getX() <= speed) { //coordinate x is less than destination x but its difference is less than speed
				distance += destination.getCoordinates().getX() - coordinates.getX();		//add its positive difference to distance			
				coordinates.setX(destination.getCoordinates().getX());
				
			}else if (coordinates.getX() - destination.getCoordinates().getX() > 0){		//coordinate x is greater than destination x but its difference is greater than speed
				distance += speed;		
				coordinates.setX(coordinates.getX() - getSpeed());
								
			}else{																			//coordinate x is less than destination x but its difference is greater than speed
				distance += speed;										
				coordinates.setX(coordinates.getX() + getSpeed());
			}
			
			//coordinate y
			if (coordinates.getY() >= destination.getCoordinates().getY()
			 && coordinates.getY() - destination.getCoordinates().getY() <= speed){			//coordinate y is greater than destination y but its difference is less than speed
				distance += coordinates.getY() - destination.getCoordinates().getY();
				coordinates.setY(destination.getCoordinates().getY());
				
			}else if (destination.getCoordinates().getY() >= coordinates.getY()
			 	   && destination.getCoordinates().getY() - coordinates.getY() <= speed){	//coordinate y is less than destination y but its difference is less than speed
				distance += destination.getCoordinates().getY() - coordinates.getY();	
				coordinates.setY(destination.getCoordinates().getY());
				
			}else if (coordinates.getY() - destination.getCoordinates().getY() > 0){		//coordinate y is greater than destination y but its difference is greater than speed
				distance += speed;		
				coordinates.setY(coordinates.getY() - getSpeed());							
				
					}else{																	//coordinate y is less than destination y but its difference is greater than speed
						distance += speed;									
				coordinates.setY(coordinates.getY() + getSpeed());
			}
		}
		totalDistance += distance;
		return distance;			
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
	
	/**
     * method getSpeed returns speed
     */
	public int getSpeed(){
		return speed;
	}

	/**
     * method getTotalDistance returns totalDistance
     */
	public int getTotalDistance(){
		return totalDistance;
	}

	/**
     * method setTotalDistance sets totalDistance
     */
	public void setTotalDistance(int distance){
		totalDistance = distance;
	}
		
	/**
     * method getRepairDistance returns repairDistance
     */
	public int getRepairDistance(){
		return repairDistance;
	}
}
