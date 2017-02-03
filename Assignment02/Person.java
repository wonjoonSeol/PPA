/** PPA Assignment 2 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models human calories intake and its usage
 */

public class Person {

	private int calories;

	/**
	 * method eat add amount to current calories
	 */
	public void eat(int amount){
		this.calories = this.calories + amount;
	}

	/**
	 * method walk subtract min from current calories
	 */		
	public void walk(int min){
		this.calories = this.calories - min;
		System.out.println(min);
	}

	/**
	 * method printCalories print calories value
	 */
	public void printCalories(){
		System.out.println(calories);
	}
	
}