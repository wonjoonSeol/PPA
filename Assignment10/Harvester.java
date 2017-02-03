/** PPA Assignment 10 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents characteristics of a harvester.
 */
public class Harvester{
	
	private int fuelTankSize;
	private int topSpeed;
	
	public Harvester(int fuelTankSize, int topSpeed){
		this.fuelTankSize = fuelTankSize;
		this.topSpeed = topSpeed;
	}
	
	public int calculateHarvestingCapacity(){
		return topSpeed + fuelTankSize; 		//default harvestingCapacity for harvester
	}
	
	public int getTopSpeed(){
		return topSpeed;
	}
	
	public int getFuelTankSize(){
		return fuelTankSize;
	}
	
}
