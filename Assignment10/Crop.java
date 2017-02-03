/** PPA Assignment 10 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents type and value of crops.
 */
public class Crop{
	private String type;
	private int value;
	
	public Crop(String type, int value){
		this.type = type;
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
}
