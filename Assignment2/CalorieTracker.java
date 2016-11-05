/** PPA Assignment 2 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */

public class CalorieTracker{

	public static void main(String[] args){
		
		//create a person henry
		Person henry = new Person();
		
		//print initial calories 
		henry.printCalories();		//Output 0

		//Omelette Breakfast
		Dish toast = new Dish();
		toast.setDish(110);
		Dish omelette = new Dish();
		omelette.setDish(425);	
		Dish banana = new Dish();
		banana.setDish(140);	
		Meal omeletteBreakfast = new Meal();
		omeletteBreakfast.setMeal(toast, omelette, banana);
	
		//Pizza Dinner
		Dish wedge = new Dish();
		wedge.setDish(210);
		Dish pizza = new Dish();
		pizza.setDish(455);
		Dish cheesecake = new Dish();
		cheesecake.setDish(335);
		Meal pizzaDinner = new Meal();
		pizzaDinner.setMeal(wedge, pizza, cheesecake);
		
		//Pie Lunch
		Dish gratin = new Dish();
		gratin.setDish(250);
		Dish pie = new Dish();
		pie.setDish(600);
		Dish gelato = new Dish();
		gelato.setDish(305);		
		Meal pieLunch = new Meal();
		pieLunch.setMeal(gratin, pie, gelato);	
		
		//henry eats the meal with the least calories
		henry.eat(omeletteBreakfast.calculateCalories());
		omeletteBreakfast.printMealCalories();				//Output 675
		henry.printCalories(); 								//Output 675

		//henry eats the meal with 1000 calories
		henry.eat(pizzaDinner.calculateCalories());
		pizzaDinner.printMealCalories(); 					//Output 1000
		henry.printCalories(); 								//output 1675

		//henry eats the meal with the highest calories
		henry.eat(pieLunch.calculateCalories());	
		pieLunch.printMealCalories();						//output 1155
		henry.printCalories();								//output 2830

		//henry walk 830 mins
		henry.walk(830);									//output 830					
	}
}