import java.util.Scanner;

/** PPA Assignment 8 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */
public class ShoppingTrip{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Product product1 = new Product("Diamond", 40);
		System.out.println(product1.toString());
		Product product2 = new Product("Crown Jewels", 100);
		System.out.println(product2.toString());
		Product product3 = new Product("Silver Locket", 60);
		System.out.println(product3.toString());

		Shop shop = new Shop("Hidden Hideaway");				

		for (int i = 0; i < 125; i++){
			shop.addGoldCoin(new GoldCoin());
		}

		shop.addProduct(product1);
		shop.addProduct(product2);
		shop.addProduct(product3);

		System.out.println(shop.toString() + " Coin Box contains " + shop.getCoinNumber());
	
		Customer customer = new Customer("Blackbeard");

		for (int i = 0; i< 100; i++){
			customer.addCoin(new GoldCoin());
		}

		System.out.println("Hello, " + customer.toString());
		
		System.out.println("Welcome to our shop, " + shop.getName());
		
		String userInput;
		do {
			System.out.println(shop.toString() +"\n" + customer.toString());
			System.out.println("What would you like to do?");			
			userInput = in.nextLine();
			if(!userInput.equals("exit")){

				if(userInput.equals("add product")){
					System.out.println("Please specify the product you wish to buy");
					userInput = in.nextLine();
					Product item = shop.searchProduct(userInput);
					if (null != item && shop.removeProduct(item)){	//If searched product exists
						customer.addToShoppingBasket(item);			//add to the ArrayList shopping basket		
						System.out.println("Product successfully added");
					}else{
						System.out.println("Could not find the product");
					}												//If no product name matches return to begining of the loop
				
				}else if (userInput.equals("remove product")){
					System.out.println("Please specify the item you wish to remove");
					userInput = in.nextLine();
					Product item = customer.searchShoppingBasket(userInput);	
					if (null != item && customer.removeFromShoppingBasket(item)){	//removes searched product
							System.out.println("Product successfully removed");
							shop.addProduct(item);
					}else{
							System.out.println("Could not find the product");
					}									//If no product name matches return to begining of the loop

				}else if (userInput.equals("purchase")){
					if(customer.purchaseProducts(shop)){					//purchase products in the shopping lists, if successful returns true
						System.out.println("You have purchased your shopping lists!");
					}else{
						System.out.println("You did not have enough coins!");
					}									//If no product name matches return to begining of the loop

				}else{
					System.out.println("please specify correct command, \nAvailable commands are \"add product\", \"remove product\", and \"purchase\" ");
				}
			}
		} while (!userInput.equals("exit"));		//exits when the user types exit		
		in.close();
	}
}
