/** PPA Assignment 4
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class holds questions and mark, serve as a question paper or mark scheme
 */
public class Exam{
	private NumericalQuestion question1;
	private BooleanQuestion question2;
	private MultipleChoiceQuestion question3;
	private int totalMark;
	
	/**
     * method Exam constructs object with Numerical question, boolean question, multiple choice question and totalmark
     */
	public Exam(NumericalQuestion question1, BooleanQuestion question2, MultipleChoiceQuestion question3, int totalMark) {
			this.question1 = question1;
			this.question2 = question2;
			this.question3 = question3;
			this.totalMark = totalMark;
	}
	
	/**
     * method getTotalMark returns totalMark
     */
	public int getTotalMark(){
		return totalMark;
	}
	
	/**
     * method setTotalMark sets totalmark
     */
	public void setTotalMark(int totalMark){
		this.totalMark = totalMark;
	}	
	
	/**
     * method getQuestion1 returns question1
     */
	public NumericalQuestion getQuestion1(){
		return question1;
	}
	
	/**
     * method getQuestion2 returns question2
     */
	public BooleanQuestion getQuestion2(){
		return question2;
	}
	
	/**
     * method getQuestion3 returns question3
     */
	public MultipleChoiceQuestion getQuestion3(){
		return question3;
	}
}