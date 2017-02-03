/** PPA Assignment 7 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models a treasure chest with gold coins inside
 */

public class TreasureChest{
	private int noOfGoldCoins = 17;
	private GoldCoin[] goldCoin; 
	
	/**
         * method TreasureChest is constructed with 17 new gold coins when it is initilised
         */
	public TreasureChest(){
		goldCoin = new GoldCoin[17];
		for (int i = 0 ; i < 17; i++){
			goldCoin[i] = new GoldCoin();
		}
	}
	
	/**
         * method getNoOfGoldCoins returns noOfGoldCoins
         */
	public int getNoOfGoldCoins(){
		return noOfGoldCoins;
	}
	
	/**
         * method takeOneGoldCoin remove a coin from chest if exists and return this coin, otherwise return null
         */
	public GoldCoin takeOneGoldCoin(){
		if (noOfGoldCoins>0){
			noOfGoldCoins -= 1;
			GoldCoin coin = goldCoin[noOfGoldCoins];	
			goldCoin[noOfGoldCoins] = null; 
			return coin; 
		} else {
			return null;
		}
	}
}
