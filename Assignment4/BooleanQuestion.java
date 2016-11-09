/** PPA Assignment 4
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models Yes or No type question
 */
public class BooleanQuestion{
	private Boolean answer;
	private int mark;
	
	/**
     * method BooleanQuestion constructs objects with boolean answer and integer mark when initialised
     */	
	public BooleanQuestion(Boolean answer, int mark){
		this.answer = answer;
		this.mark = mark;
	}
	
	/**
     * method getAnswer returns answer
     */
	public Boolean getAnswer(){
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