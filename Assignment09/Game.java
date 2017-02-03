import java.util.Scanner;

/** PPA Assignment 9 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */
public class Game{
	public static void main(String[] args){
		Board board = new Board();
		Scanner in = new Scanner(System.in);
		String nextUserInput;		
		do {
			board.countShips();
			
			System.out.println(board);
			System.out.println("Please enter a single row and column number on a single line,  separated by a space: ");
			nextUserInput = in.nextLine();
		
			if (!nextUserInput.equals("quit")){
				String[] string = nextUserInput.split(" "); 	//split the string by " " and store them into array string
				if (string.length == 2){			//If there are two elements inside the array string
					int x = Integer.parseInt(string[0]);	
					int y = Integer.parseInt(string[1]);	//convert them into integers
					
					if (board.hit(x, y)){			//if supplied coordinates return true, the part is destroyed or already destroyed
						System.out.println("Hit!");
					}else{
						System.out.println("Miss!");
					}
			
				} else {
					System.out.println("Unable to interpret input value");
				}
			}

		} while (!nextUserInput.equals("quit"));
	in.close();
	}
}
