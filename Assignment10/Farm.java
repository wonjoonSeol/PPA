import java.util.ArrayList;

/** PPA Assignment 10 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents a farm with multiple fields and harvesters.
 */
public class Farm{
	
	private ArrayList<Field> fields;
	private ArrayList<Harvester> harvesters;
	private int profit;
	
	public Farm(){
		fields = new ArrayList<Field>();
		harvesters = new ArrayList<Harvester>();
	}
	
	public void addField(String type, int value){
		fields.add(new Field(type, value));	
	}
	
	public void addHarvester(Harvester harvester){
		harvesters.add(harvester);
	}
	
	public int getProfit(){
		return profit;
	}
	
	public void harvest(){
		int totalCapacity = 0;
		//count total number of fields harvesters can harvest
		for (int i = 0; i < harvesters.size(); i++){
			totalCapacity += harvesters.get(i).calculateHarvestingCapacity();
		}
		
		if (totalCapacity <= fields.size()){			//if totalCapacity of harvesters are less than or equal to fields size
			for (int i = 0; i < totalCapacity; i++){	//set for loop condition between i = 0 and totalCapacity
				profit += fields.get(i).harvest();	
			}
		} else {
			for (int i = 0; i < fields.size(); i++){	//harvesters can harvest every fields.
				profit += fields.get(i).harvest();			
			}
		}
	}
}
