import java.util.Scanner;

/** PPA Assignment 7 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */
public class TreasureHunt{

	public static void main(String[] args){
		TreasureChest[] location1 = new TreasureChest[13];   
		TreasureChest[] location2 = new TreasureChest[13];
		TreasureChest[] location3 = new TreasureChest[13];
		Island portRoyal = new Island("Port Royal", location1);
		Island tortuga = new Island("Tortuga", location2);
		Island dominica = new Island("Dominica", location3);
		
		Island[] map = new Island[3];
		map[0] = portRoyal;			//add three islands to maps
		map[1] = tortuga;
		map[2] = dominica;
		
		Pirate captainChapman = new Pirate("Chapbeard", map);
		
		Scanner in = new Scanner(System.in);
		String nextIsland;
		do { 
			Pirate.speak("Suggest a name of an island?");
			nextIsland = in.nextLine();
			
			if (!nextIsland.equals("stop")) {
				Pirate.speak("Searching for " + nextIsland);
				Island island = captainChapman.search(nextIsland);
			
				if (island == null){		
					Pirate.speak("Your suggested island " + nextIsland + " could not be found");	
				
				}else{
					if (captainChapman.getTreasure(island)){
						Pirate.speak("Treasure found on " + nextIsland);
						Pirate.speak("The pirate has now " + Integer.toString(captainChapman.totalCoins()) + " Coins");
					} else {
						Pirate.speak("Island " + nextIsland + " did not contain any treasure");
					}
				}
			}
		} while (!nextIsland.equals("stop"));
		in.close();
	}
}
