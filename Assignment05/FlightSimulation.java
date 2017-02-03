/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */
public class FlightSimulation{
	public static void main(String[] args){
		Coordinates beijing = new Coordinates(100, 45);
		Destination destination1 = new Destination("Beijing", beijing);

		Coordinates istanbul = new Coordinates(145, 120);
		Destination destination2 = new Destination("Istanbul", istanbul); 

		Coordinates dhaka = new Coordinates(30, 90);
		Destination destination3 = new Destination("Dhaka", dhaka);

		Coordinates airbusCoordinates = new Coordinates(100, 45);		//equals to beijing but must initialise new one as object is passed to a method, any interactions with that object will alter the original object.
		Aeroplane airbus = new Aeroplane("Airbus", airbusCoordinates, 9, 0, 1600);
	
		System.out.println(airbus.getName() + ", " + destination1.getName() + " to " + destination2.getName());
		System.out.println("Distance: " + airbus.singleFlight(destination2) + ", Total distance: "+ airbus.getTotalDistance());		
		System.out.println("(" + airbus.getCoordinates().getX() + ", " + airbus.getCoordinates().getY() + ")");		
		
		System.out.println(airbus.getName() + ", " + destination2.getName() + " to " + destination3.getName());
		System.out.println("Distance: " + airbus.singleFlight(destination3) + ", Total distance: "+ airbus.getTotalDistance());		
		System.out.println("(" + airbus.getCoordinates().getX() + ", " + airbus.getCoordinates().getY() + ")");	
		
		System.out.println(airbus.getName() + ", " + destination3.getName() + " to " + destination2.getName());
		System.out.println("Distance: " + airbus.singleFlight(destination2) + ", Total distance: "+ airbus.getTotalDistance());		
		System.out.println("(" + airbus.getCoordinates().getX() + ", " + airbus.getCoordinates().getY() + ")");
		
		System.out.println(airbus.getName() + ", " + destination2.getName() + " to " + destination1.getName());
		System.out.println("Distance: " + airbus.singleFlight(destination1) + ", Total distance: "+ airbus.getTotalDistance());		
		System.out.println("(" + airbus.getCoordinates().getX() + ", " + airbus.getCoordinates().getY() + ")");
		System.out.println();
	
		int repairNum = 0;
		for (int day = 1; day<=120; day++){
			System.out.println("Current Day number: " + day);
			System.out.println("Total Distance: " + airbus.getTotalDistance());			
			if (airbus.getTotalDistance() > airbus.getRepairDistance()){	
				day += 6;								//undergoes repair for 7 days, repair includes the current day in the loop so it must be +6.
				airbus.setTotalDistance(0);
				repairNum++;	
			} else { 
				airbus.singleFlight(destination2);	
				airbus.singleFlight(destination3);			
				airbus.singleFlight(destination2);
				airbus.singleFlight(destination1);
			}
		}		
		System.out.print(repairNum);		//print out number of times plane has undergone repair
	}
}
