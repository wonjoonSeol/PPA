/** PPA Assignment 2 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class describes characteristics of a meal
 */

public class Meal{

	private int mealCalories;
	private Dish starter;
	private Dish main;
	private Dish dessert;
	
	/**
	 * method setMeal set a meal using 3 Dish objects
	 */
	public void setMeal(Dish starter, Dish main, Dish dessert){
		this.starter = starter;
		this.main = main;
		this.dessert = dessert;
	}
	
	/**
	 * method calculateCalories return sum of starter, main and dessert
	 */
	public int calculateCalories(){
		mealCalories = starter.getDish() + main.getDish() + dessert.getDish();		
		return mealCalories;
	}
	
	/**
	 * method printMealCalories print mealCalories
	 */
	public void printMealCalories(){
		System.out.println(mealCalories);
	}
}