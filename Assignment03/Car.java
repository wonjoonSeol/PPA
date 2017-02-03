/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models properties of a car
 */

public class Car{

	private int id;
	private int fuel;
	private int lowFuelBoost;
	private int highFuelSlowdown;
	private int fuelConsumptionPerLap;
	private int pitStopTime;
	private int rainSlowDown;
	private int totalTime;
	private RaceTrack raceTrack;


	/**
	 * Constructor Car assigns id, fuel, lowFuelBoost, highFuelSlowdown, fuelConsumptionPerLap, pitStopTime, 
	 * rainSlowdown, and TotalTime when initialised
	 */
	public Car(int id, int fuel, int lowFuelBoost, int highFuelSlowdown, int fuelConsumptionPerLap, int pitStopTime, int rainSlowdown, int TotalTime){
		this.id = id;
		this.fuel = fuel;
		this.lowFuelBoost = lowFuelBoost;
		this.highFuelSlowdown = highFuelSlowdown;
		this.fuelConsumptionPerLap = fuelConsumptionPerLap;
		this.pitStopTime = pitStopTime;
		this.rainSlowDown = rainSlowDown;
		this.totalTime = totalTime;
	}

	/**
	 * method completeLap calculates the total time for each lap and subtract fuels consumption
	 */
	public void completeLap(RaceTrack raceTrack){
		totalTime += raceTrack.getLapTime();

		if (fuel > 50){
			totalTime += highFuelSlowdown;
		}else{
			totalTime -= lowFuelBoost;
		}
		if (raceTrack.isRaining() == true)	totalTime += rainSlowDown;	
		
		fuel -= fuelConsumptionPerLap;
		
		if (fuel < fuelConsumptionPerLap) {
			totalTime += pitStopTime;			
			fuel = 100;
		}
	}

	/**
	 * method getTotalTime returns totalTime
	 */
	public int getTotalTime(){
		return totalTime;
	}

	/**
	 * method getId returns id
	 */	
	public int getId(){
		return id;
	}
}
