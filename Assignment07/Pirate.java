import java.util.Random;

/** PPA Assignment 7 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models characteristics of pirate
 */
public class Pirate {
	
	private String name;
	private GoldCoin[] purse;
	private Island[] map;
	private int coinIndex;
	
	public Pirate(String name, Island[] map){
		this.name = name;
		this.map = map;
		purse = new GoldCoin[100];
	}
	
	/**
         * method totalCoins returns total number of coins in pirate's purse
         */	
	public int totalCoins(){		
		return coinIndex;
	}

	/**
         * method addToPurse add gold coin to pirate's purse
         */
	public void addToPurse(GoldCoin goldCoin){
		purse[coinIndex++] = goldCoin;
	}

	/**
         * method search find given string name inside map and returns that island
         */	
	public Island search(String name){
		Island island = null;
		for(int i=0; i < map.length; i++) {
			if (name.equals(map[i].getName())) {
				island = map[i];
			}
		}
		return island;
	}

	/**
         * method getTreasure digs the supplied island and find takes all coins from the treasure chest
         */
	public boolean getTreasure(Island island){
		boolean isCoinTaken = false;
		for (int i = 0; i < island.getLocation().length; i++){
			TreasureChest chest = island.dig(i);
			if (chest != null){
				int maxChestCoinNumber = chest.getNoOfGoldCoins();	// NoOfCoins field in chest decrease for each takeOneGoldCoin method calls
				for(int j = 0; j < maxChestCoinNumber; j++){
					GoldCoin coin = chest.takeOneGoldCoin();					
					if (coin != null){					
						addToPurse(coin);
						isCoinTaken = true;
					}
				}
				return isCoinTaken;
			} 
		}
		return isCoinTaken;
	}

	/**
         * method speak prints a given statement with pirate themed suffix
         */		
	public static void speak(String statement){
		Random rnd = new Random();		
		switch(rnd.nextInt(5)){
			case 0: System.out.println(statement + ", arrr!");
				break;
			case 1: System.out.println(statement + ", shiver me timbers!");
				break;
			case 2: System.out.println(statement + ", avast!");
				break;
			case 3: System.out.println(statement + ", ahoy, matey!");
				break;
			case 4: System.out.println(statement + ", yo, ho ho!");
				break;
			default: System.out.println(statement);
				 break;
		}
	}
}
