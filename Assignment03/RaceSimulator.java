/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */

public class RaceSimulator{
	public static void main(String[] args){
		RaceTrack silverstone = new RaceTrack(112, false);

		Car car1 = new Car(1, 79, 6, 5, 19, 25, 15, 0);
		Car car2 = new Car(2, 67, 8, 4, 29, 16, 11, 0);
		Car car3 = new Car(3, 41, 7, 6, 31, 18, 13, 0);
		
		//lap 1
		runLap(car1, car2, car3, silverstone);
		System.out.println("ID of the leader of the race: " + silverstone.determineRaceLeader(car1, car2, car3).getId());

		//lap 2
		runLap(car1, car2, car3, silverstone);
		System.out.println("ID of the leader of the race: " + silverstone.determineRaceLeader(car1, car2, car3).getId());

		//lap 3
		silverstone.setRainingStatus(true);
		runLap(car1, car2, car3, silverstone);
		System.out.println("ID of the winner of the race: " + silverstone.determineRaceLeader(car1, car2, car3).getId());		
	}

	/**
	 * method runLap completes lap for each car
	 */
	public static void runLap(Car car1, Car car2, Car car3, RaceTrack raceTrack){
		car1.completeLap(raceTrack);						
		car2.completeLap(raceTrack);							
		car3.completeLap(raceTrack);
	}		
}
