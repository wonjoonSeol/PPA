/** PPA Assignment 4
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models numerical question 
 */
public class NumericalQuestion{
	private int answer;
	private int mark;
	
	/**
     * method NumericalQuestion constructs object with answer and mark when initialised
     */
	public NumericalQuestion(int answer, int mark){
		this.answer = answer;
		this.mark = mark;
	}
	
	/**
     * method getAnswer returns answer
     */	
	public int getAnswer(){
		return answer;
	}
	
	/**
     * method getMark returns mark
     */	
	public int getMark(){
		return mark;
	}
	
	/**
     * method setMark sets mark
     */	
	public void setMark(int mark){
		this.mark = mark;
	}
	
}