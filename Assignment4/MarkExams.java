/** PPA Assignment 4
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class is going to drive our program
 */
public class MarkExams{
	
	public static void main(String[] args){
	//mark scheme 
	NumericalQuestion nqMarkScheme = new NumericalQuestion(120369, 11);
	BooleanQuestion bqMarkScheme = new BooleanQuestion(true, 1);
	MultipleChoiceQuestion mcpMarkScheme = new MultipleChoiceQuestion(true, true, false, 3);	
	Exam markScheme = new Exam(nqMarkScheme, bqMarkScheme, mcpMarkScheme, 15);
	
	//exam attempt
	NumericalQuestion nqAttempt = new NumericalQuestion(120368, 0);
	BooleanQuestion bqAttempt = new BooleanQuestion(false, 0);
	MultipleChoiceQuestion mcpAttempt = new MultipleChoiceQuestion(false, true, false, 0);	
	Exam examAttempt = new Exam(nqAttempt, bqAttempt, mcpAttempt, 0);	

	Marker marker = new Marker();
	marker.markAttempt(examAttempt, markScheme);
	
	System.out.println("Total mark for this attempt: " + examAttempt.getTotalMark());	
	
	System.out.println("Classification: " + marker.convertMarksToClassification(examAttempt.getTotalMark(), 13, 11, 8));
	}
}
