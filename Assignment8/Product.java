/** PPA Assignment 8 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class represents characteristics of a product
 */
public class Product{
	private String name;
	private int price;

	/**
    	 * method Product constructs with name and price when initialised
     	 */	
	public Product(String name, int price){
		this.name = name;
		this.price = price;
	}

	/**
    	 * method toString overrides default toString() and returns name and price
     	 */	
	public String toString(){
		return "Product" + "[name=" + name + ", price="+ price + "]";
	}

	/**
    	 * method getName returns name
     	 */
	public String getName(){
		return name;
	}	

	/**
    	 * method getName returns price
     	 */
	public int getPrice(){
		return price;
	}
}
