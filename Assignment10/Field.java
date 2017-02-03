import java.util.ArrayList;

/** PPA Assignment 10 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents Field where crops will be planted.
 */
public class Field{
	
	public static final int MAX_NUM_CROPS = 10;
	private ArrayList<Crop> crops;
	
	public Field(String type, int value){
		crops = new ArrayList<Crop>();
		plant(type, value);		
	}
	
	public boolean plant(String type, int value){
		boolean flag = false;
		if(crops.isEmpty()){				//crops are not already planted 
			for (int i = 0; i < MAX_NUM_CROPS; i++){
				crops.add(new Crop(type, value));	
				flag = true;
			}
		}
		return flag;
	}
	
	public int harvest(){
		int profit = 0;
		if (!crops.isEmpty()){				//crops are not harvested
			for (Crop crop : crops){
				profit += crop.getValue();			
			}
		}
		crops.clear();					//harvested crops are cleared
		return profit;
	}
}
