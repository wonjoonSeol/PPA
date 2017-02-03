/** PPA Assignment 10 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents CombineHarvester, type Harvester.
 */

public class CombineHarvester extends Harvester{
	private int length;
	
	public CombineHarvester(int fuelTankSize, int topSpeed, int length){
		super(fuelTankSize, topSpeed);				//call superclass constructor
		this.length	= length;						
	}
	
	public int calculateHarvestingCapacity(){		//override calculateHarvestingCapacity
		return (super.getTopSpeed() + super.getFuelTankSize()) * length; 	
	}	
}
