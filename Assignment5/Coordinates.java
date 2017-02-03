/** PPA Assignment 3 
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models Coordinate system 
 */
public class Coordinates{
	
	private int x;	
	private int y;	//x and y are whole numbers
	
	/**
     * method Coordinates constructs object with x, y when initialised
     */
	public Coordinates(int x, int y){
		this.x = x;
		this.y = y;	
	}

	/**
     * method getX returns x
     */
	public int getX(){
		return x;
	}

	/**
     * method getY returns y
     */
	public int getY(){
		return y;
	}

	/**
     * method setX sets x coordinates
     */
	public void setX(int x){
		this.x = x;
	}

	/**
     * method setY sets y coordinates
     */
	public void setY(int y){
		this.y = y;
	}
}
