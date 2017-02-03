import java.util.Scanner;

/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */
public class DoorMazeGame{


	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		Room monsterRoom = new Room("The Monster Room", true, false);
		Room room6 = new Room("The Great Hall", false, true);
		Room room5 = new Room("The Fifth Hall", room6, monsterRoom);
		Room room4 = new Room("The Fourth Hall", monsterRoom, room5);
		Room room3 = new Room("The Third Hall", room4, monsterRoom);
		Room room2 = new Room("The Second Hall", room3, monsterRoom);
		Room room1 = new Room("The First Hall", monsterRoom, room2);

		System.out.println("Welcome to DoorMazeGame!");
		System.out.println("If you can reach the Great Hall before you die, you win!");
		System.out.println("What is your name, hero?");

		Player player = new Player(in.nextLine(), 2, room1);		

		// while remaining player lives are greater than 0 OR not reached the final room
		while ((player.getLives() > 0) && !(player.getCurrentRoom().isFinalRoom())){ 
			player.printStatus();
			System.out.println("Where do you want to go next?");
			String nextRoom = in.nextLine();
				
			if (nextRoom.equals("blue") && player.getCurrentRoom().getBlueDoorRoom().doesContainMonster()){		//if the input value is "blue" AND the boolean containsMonster is true 
				player.decreasePlayerLives();
				System.out.println("You went into a monster room");
				System.out.println("Monster attacked you!");
				System.out.println("You lost one life");
		
			} else if (nextRoom.equals("blue")){	//if the input value is "blue"
				player.move(player.getCurrentRoom().getBlueDoorRoom());	
				System.out.println("You proceeded to blue door room");	
			
			} else if (nextRoom.equals("red") && player.getCurrentRoom().getRedDoorRoom().doesContainMonster()){ //if the input value is red AND the boolean containsMonster is true 
				player.decreasePlayerLives();
				System.out.println("You went into a monster room");
				System.out.println("Monster attacked you!");
				System.out.println("You lost one life");

			} else if (nextRoom.equals("red")){		//if the input value is "red"
				player.move(player.getCurrentRoom().getRedDoorRoom());
				System.out.println("You proceeded to red door room");				

			} else {	//if player didn't type correct command list available commands to them
				System.out.println();
				System.out.println("Acceptable location: blue or red");
				System.out.println("Each room leads to either next room or monster room");
				System.out.println("Command you typed: " + nextRoom);
				System.out.println("please type your command again");
			}
		}

		if (player.getCurrentRoom().isFinalRoom()) { 	//if the current room is final room then the player wins
			System.out.println("You entered the great hall..");
			System.out.println("Congratulation, you have won the game!");		
		
		} else {	//if the remaining lives are 0 then the game is over. (Player died)
			System.out.println("You have died");				
		}		
		in.close();		//close scanner
	}
}
