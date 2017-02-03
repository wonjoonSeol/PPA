import java.util.ArrayList;
import java.util.Collections;

/** PPA Assignment 9 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents the characteristics of a game board
 */
public class Board{
	private ArrayList<Battleship> ships;
	private int boardSize;
	public Board(){
		ships = new ArrayList<Battleship>();
		ships.add(new Battleship(0));
		ships.add(new Cruiser(1));
		ships.add(new Cruiser(2));
		ships.add(new Frigate(3));
		ships.add(new Minesweeper(4));
		boardSize = 5;
	}
	
	public ArrayList<Battleship> getShips(){
		return ships;
	}
	
	public String toString(){
		String string = "";

		for (int i = 0; i < boardSize; i++){
			if (ships.get(i) instanceof Cruiser){
					string += ships.get(i) + ", []\n";	//Cruiser has 4 parts so add one empty bracket
			}else if (ships.get(i) instanceof Frigate){
					string += ships.get(i) + ", [], []\n";	// Frigate has 3 parts so add 2 empty brackets
			}else if (ships.get(i) instanceof Minesweeper){
					string += ships.get(i) + ", [], [], []\n";	// Minesweeper has 2 parts so add 3 empty brackets
			}else{
					string += ships.get(i) + "\n";			// Battleship has 5 parts so add no empty brackets
			}	
		}	
		return string;
	}
	
	public boolean hit(int x, int y){
		boolean flag = false;

		if (!(x >= boardSize || y >= boardSize)){	// check whether the value supplied is over the arraylist range
			for (int i = 0; i < ships.size(); i++){
				if (ships.get(i).hit(x,y)){		
					flag = true;
				}
			}
		}
		return flag;
	}
	
	public void countShips(){
		//Collections.frequency counts number of elements within the collection that are equal to the supplied object using overridden equals method 
		System.out.println("Battleships: " + Collections.frequency(ships, new Battleship(0)));	
		System.out.println("Cruisers: " + Collections.frequency(ships, new Cruiser(0)));
		System.out.println("Frigates: " + Collections.frequency(ships, new Frigate(0)));
		System.out.println("Minesweepers: " + Collections.frequency(ships, new Minesweeper(0)));
	}	
}
