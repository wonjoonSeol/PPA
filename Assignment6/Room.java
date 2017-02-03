/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class has a characteristics of a Room
 */
public class Room{

	private String name;
	private Room blueDoorRoom;
	private Room redDoorRoom;
	private boolean isFinalRoom;
	private boolean containsMonster; 

	/**
     * method Room constructs object with name, containsMonster, isFinalRoom when initialised
     */
	public Room(String name, boolean containsMonster, boolean isFinalRoom){
		this.name = name;
		this.containsMonster = containsMonster;
		this.isFinalRoom = isFinalRoom;
	}

	/**
     * method Room constructs object with name, blueDoorRoom, redDoorRoom when initialised
     */
	public Room(String name, Room blueDoorRoom, Room redDoorRoom){
		this.name = name;
		this.blueDoorRoom = blueDoorRoom;
		this.redDoorRoom = redDoorRoom;
	}

	/**
     * method getName returns name
     */
	public String getName(){
		return name;
	}
	
	/**
     * method isFinalRoom returns boolean value isFinalRoom
     */
	public boolean isFinalRoom(){
		return isFinalRoom;
	}
	
	/**
     * method doesContainMonster returns boolean value containsMonster
     */	
	public boolean doesContainMonster(){
		return containsMonster;
	}
	
	/**
     * method getBlueDoorRoom returns blueDoorRoom
     */
	public Room getBlueDoorRoom(){
		return blueDoorRoom;
	}
	
	/**
     * method getRedDoorRoom returns redDoorRoom
     */
	public Room getRedDoorRoom(){
		return redDoorRoom;
	}	
}
