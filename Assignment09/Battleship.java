import java.util.ArrayList;

/** PPA Assignment 9 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents the characteristics of a Battleship
 */
public class Battleship{
	private ArrayList<Part> parts;
	private int numOfParts;
	private boolean isSunk;
	
	public Battleship(int row, int numOfParts){		
		this.numOfParts = numOfParts;
		parts = new ArrayList<Part>();
		for (int i = 0; i < numOfParts; i++){
			parts.add(new Part(row, i));
		}
	}
	
	public Battleship(int row){
		numOfParts = 5;
		parts = new ArrayList<Part>();
		for (int i = 0; i < numOfParts; i++){
			parts.add(new Part(row, i));
		}
	}

	public boolean equals(Object ship){
		boolean flag = false;
		if (ship instanceof Battleship && !((Battleship)ship).isSunk && ((Battleship)ship).numOfParts == numOfParts){
		//similar to the Class Part's equals method. Check objects are Battleship if so check ship is not sunk and number of the parts are the same.
			flag = true;
		}
		return flag;
	}
	
	public String toString(){
		String partStatus = "";
		for (int i = 0; i < parts.size(); i++){
			if (i == parts.size()-1){			
				partStatus += parts.get(i);
			}else{
				partStatus += parts.get(i) + ", "; //if the item is not the last element add comma ", "
			} 
		}
		return partStatus;
	}
	
	public boolean hit(int x, int y){
		boolean flag = false;
		int destroyedParts = 0;
		for (int i = 0; i < parts.size(); i++){
			if (parts.get(i).equals(new Part(x, y))){ //generate new Part on the given co-ordinate and find the existing part within the ship
				parts.get(i).setDestroyed();				
				flag = true;
			}

			//check whether the ship is sunk
			if (parts.get(i).getIsDestroyed()){
				destroyedParts += 1;
			}

		}

		if (destroyedParts == numOfParts){
			isSunk = true;
		}

		return flag;	
	}
}
