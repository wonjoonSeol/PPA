/** PPA Assignment 4
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models multiple choice question
 */

public class MultipleChoiceQuestion{
	private Boolean option1;
	private Boolean option2;
	private Boolean option3;
	private int mark;
	
	/**
     * method MultipleChoiceQuestion constructs object with Boolean option1, option2, option3 and integer mark when initialised
     */
	public MultipleChoiceQuestion(Boolean option1, Boolean option2, Boolean option3, int mark){
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.mark = mark;
	}
	
	/**
     * method getOption1 returns Boolean option1
     */
	public Boolean getOption1(){
		return option1;
	}
	
	/**
     * method getOption2 returns Boolean option2
     */
	public Boolean getOption2(){
		return option2;
	}
	
	/**
     * method getOption3 returns Boolean option3
     */
	public Boolean getOption3(){
		return option3;
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
	