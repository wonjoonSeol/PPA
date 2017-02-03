/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models player characteristics
 */
public class Player{
	private String name;
	private int lives;
	private Room currentRoom;

    /**
     * method Player constructs object with name, lives, currentRoom when initialised
     */
	public Player(String name, int lives, Room currentRoom){
		this.name = name;
		this.lives = lives;
		this.currentRoom = currentRoom;
	}

	/**
     * method setPlayerRoom sets currentRoom
     */
	public void move(Room nextRoom){
		currentRoom = nextRoom;
	}

	/**
     * method getCurrentRoom returns currentRoom
     */
	public Room getCurrentRoom(){
		return currentRoom;
	}

	/**
     * method getLives returns lives
     */
	public int getLives(){
		return lives;
	}	
	
	/**
     * method decreasePlayerLives decrease 1 life from remaining lives
     */
	public void decreasePlayerLives(){
		lives -= 1;
	}

	/**
     * method printStatus prints the current status of a player
     */
	public void printStatus(){
		System.out.println();
		System.out.println("Your Current Status: ");
		System.out.println(name);
		System.out.println("Your lives left: " + lives);
		System.out.println(currentRoom.getName());
		System.out.println();
	}
}

