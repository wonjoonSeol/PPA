/** PPA Assignment 10 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program.
 */
public class Harvest{
	public static void main(String[] args){
		
		Farm farm = new Farm();
		farm.addHarvester(new Harvester(1, 1));
		farm.addHarvester(new CombineHarvester(2, 2, 3));
		
		for (int i = 0; i < 5; i++){
			farm.addField("Corn", 20);
			farm.addField("Barley", 20);
			farm.addField("Wheat", 20);
			farm.addField("Oat", 20);
		}
		
		farm.harvest();	
		System.out.println("Farmer's profit: " + farm.getProfit());
	}
}
