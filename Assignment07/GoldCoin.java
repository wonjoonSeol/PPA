/** PPA Assignment 7 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models a gold coin
 */
public class GoldCoin{
	private int coinNumber;
	private static int totalCoin;
	
	/**
	 * method GoldCoin constructs GoldCoin with totalCoin incremented as a prefix each time it is initialised
     	 */
	public GoldCoin(){
		coinNumber = ++totalCoin; //prefix so that coinNumber would start with 1
	}
	
	/**
         * method getCoinNumber returns coin number
         */
	public int getCoinNumber(){
		return coinNumber;
	}
}
