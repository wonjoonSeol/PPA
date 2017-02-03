/** PPA Assignment 9 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents the characteristics of a part of a ship 
 */
public class Part{
	private int row;
	private int column;
	private boolean isDestroyed;

	public Part(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	public String toString(){
		String status;
		if (isDestroyed){
			status = "[X]";
		}else{
			status = "[]";
		}
		return status;
	}
	
	public void setDestroyed(){
		isDestroyed = true;
	}
	
	public boolean getIsDestroyed(){
		return isDestroyed;
	}

	public boolean equals(Object part){ //override equals method in java.lang.Object
		boolean flag = false;
		if (part instanceof Part && this.row == ((Part)part).row && this.column == ((Part)part).column) { 
		//Since equals take every object as a parameter we only choose the objects that are type Part and then cast Type so that we can use Class Part's methods
			flag = true;
		}
		return flag;
	}	
}
