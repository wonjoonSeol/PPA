/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models race track
 */

public class RaceTrack{
	private	int averageLapTime;
	private Boolean isRaining;

	/**
	 * Constructor RaceTrack assigns averageTime, Boolean value isRaining when initialised
	 */
	public RaceTrack(int averageLapTime, Boolean isRaining){
		this.averageLapTime = averageLapTime;
		this.isRaining = isRaining;
	}

	/**
	 * method getLaptime returns averageLapTime
	 */
	public int getLapTime(){
		return this.averageLapTime;
	}

	/**
	 * method isRaining returns boolean value of isRaining
	 */
	public Boolean isRaining(){
		return this.isRaining;
	}

	/**
	 * method setRainingStatus set raining status of race track
	 */
	public void setRainingStatus(Boolean bool){
		isRaining = bool;
    }
	/**
	 * method determineRaceLeader determines the leader of each lap.
	 */
	public Car determineRaceLeader(Car car1, Car car2, Car car3){
		Car car;
		if (car1.getTotalTime() <= car2.getTotalTime() && car1.getTotalTime() <= car3.getTotalTime()){
			car = car1;
		}else if (car2.getTotalTime() <= car1.getTotalTime() && car2.getTotalTime() <= car3.getTotalTime()){
			car = car2;
		}else{
			car = car3;
		}
		return car;
	}
}