/** PPA Assignment 9 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents the characteristics of a Minesweeper type Battleship
 */
public class Minesweeper extends Battleship{
	public Minesweeper(int row){
		super(row, 2); // 2 parts are created
	}
	
	public boolean hit(int x, int y){
		boolean flag = false;		
		if (Math.random() <= 0.5){  	// Math.random() generates [0, 1).
			flag = super.hit(x, y);
		}	
		return flag;
	}
}
