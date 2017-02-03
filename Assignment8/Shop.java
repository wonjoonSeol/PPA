import java.util.ArrayList;
import java.util.TreeMap;

/** PPA Assignment 8 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models a shop where customers can buy products
 */
public class Shop{

	private String name;
	private ArrayList<Product> products;
	private ArrayList<GoldCoin> coinBox;
	private TreeMap<String, Integer> customerTotalSpend;

	/**
    	 * method Product Shop with name and initialises coinBox, products ArrayLists and customerTotalSpend TreeMap
     	 */	
	public Shop(String name){ 
		this.name = name;
		coinBox = new ArrayList<GoldCoin>();
		products = new ArrayList<Product>();
		customerTotalSpend = new TreeMap<String, Integer>();
	}

	/**
    	 * method toString overrides default toString() and returns name and price
     	 */	
	public String toString(){
		return "Shop name: " + name + ", products = " + products;	//name + products.toString() will be returned
	}

	/**
    	 * method addProduct adds given item to the products ArrayList
     	 */	
	public void addProduct(Product item){
		products.add(item);
	}

	/**
    	 * method getName returns name
     	 */	
	public String getName(){
		return name;
	}

	/**
    	 * method getCoinNumber returns number of coins left in the coinbox
     	 */	
	public int getCoinNumber(){
		return coinBox.size();
	}

	/**
    	 * method removeProduct removes a supplied product from ArrayList products
     	 */	
	public boolean removeProduct(Product item){
		for (int i = 0; i < products.size(); i++){
			if (products.get(i).getName().equals(item.getName())){
				products.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
    	 * method searchProduct searches for a product that matches given name in the ArrayList products
     	 */	
	public Product searchProduct(String name){
		for (int i = 0; i < products.size(); i++)
			if (products.get(i).getName().equals(name)){
				return products.get(i); 
		}
		return null;
	}

	/**
    	 * method addGoldCoin adds a given gold coin to the ArrayList coinBox
     	 */	
	public void addGoldCoin(GoldCoin goldCoin){
		coinBox.add(goldCoin);
	}

	/**
    	 * method updateTotalSpend updates total amount of the gold coins customer spent in the treemap customerTotalSpend
     	 */	
	public void updateTotalSpend(Customer customer, int noOfCoins){
		if (customerTotalSpend.containsKey(customer.getName())){		//if customer name is already in the TreeMap, add the price 
			customerTotalSpend.put(customer.getName(), customerTotalSpend.get(customer.getName()) +noOfCoins);
		}else{
			customerTotalSpend.put(customer.getName(), noOfCoins);		//otherwise set the key customer name with its value	
		}
	}
	
}
