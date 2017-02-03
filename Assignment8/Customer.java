import java.util.ArrayList;

/** PPA Assignment 8 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents the characteristics of a customer
 */
public class Customer{

	private String name;
	private ArrayList<Product> shoppingBasket;
	private ArrayList<Product> ownedProducts;
	private ArrayList<GoldCoin> purse;
	
	/**
    	 * method Customer constructs with name and initialises shoppingBasket, ownedProducts and purse ArrayLists
     	 */		
	public Customer(String name){
		this.name = name;
		shoppingBasket = new ArrayList<Product>();
		ownedProducts = new ArrayList<Product>();
		purse = new ArrayList<GoldCoin>();
	}

	/**
    	 * method toString overrides default toString() and returns name, and amount of gold left in the purse
     	 */		
	public String toString(){
		return name + ", " + "Your remaining amount of coin is " + purse.size() + ". \n" + "Your current shopping basket: " + shoppingBasket;
	}

	/**
    	 * method addToShoppingBasket add item to ArrayList shoppingBasket
     	 */	
	public void addToShoppingBasket(Product item){
		shoppingBasket.add(item);
	}

	/**
    	 * method removeFromShoppingBasket removes a supplied product from shopping basket
    	 */	
	public boolean removeFromShoppingBasket(Product item){
		for (int i = 0; i < shoppingBasket.size(); i++){
			if (shoppingBasket.get(i).getName().equals(item.getName())){	//finds item with the same name
				shoppingBasket.remove(i);
				return true;
			}
		}
		return false;
	}


	/**
    	 * method searchShoppingBasket searches for a product that matches given name in shopping basket ArrayList
    	 */		
	public Product searchShoppingBasket(String name){
		for (int i = 0; i < shoppingBasket.size(); i++)
			if (shoppingBasket.get(i).getName().equals(name)){
				return shoppingBasket.get(i); 
		}
		return null;		
	}

	/**
    	 * method addOwnedProduct adds item to ownedProducts
    	 */	
	public void addOwnedProduct(Product item){
		ownedProducts.add(item);
	}

	/**
    	 * method addCoin adds gold coin to purse
   	 */		
	public void addCoin(GoldCoin goldcoin){
		purse.add(goldcoin);
	}

	/**
     	 * method PurchaseProducts buys every items in the shopping list 
    	 */	
	public boolean purchaseProducts(Shop shop){
		int totalCost = 0;	
		for (int i = 0; i < shoppingBasket.size(); i++){		
			totalCost += shoppingBasket.get(i).getPrice();	//loop through every items in the shopping basket and sum prices
		}	

		if (purse.size() < totalCost){
			return false;					//if the total price of the shoppinglist is greater than the gold coins the customer have return false 
		}

		for (int i = 0; i < totalCost; i++){
			shop.addGoldCoin(purse.get(0));
			purse.remove(0);				//move first gold coin in the ArrayList purse to shop's coinbox every loop
		}
		
		int basketSize = shoppingBasket.size();
		for (int i = 0; i < basketSize; i++){
			addOwnedProduct(shoppingBasket.get(0));			
			shoppingBasket.remove(0);			//move first item in the ArrayList shoppingBasket to addOwnedProduct every loop 
		}

		shop.updateTotalSpend(this, totalCost);	

		return true;
	}

	public String getName(){
		return name;
	}
}	
