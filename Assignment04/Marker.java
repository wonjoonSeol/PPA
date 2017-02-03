/** PPA Assignment 4
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * This class models test marker process
 */
public class Marker{

	/**
     * method markAttempt compares each answer from Exam examAttempt with markscheme and award points
     */
	public int markAttempt(Exam examAttempt, Exam markscheme){

		//question 1 NumericalQuestion
		if (examAttempt.getQuestion1().getAnswer() == markscheme.getQuestion1().getAnswer()){
			//if answer from question 1 is the same as answer from the markscheme award full marks
			examAttempt.getQuestion1().setMark(markscheme.getQuestion1().getMark());
		}else if (examAttempt.getQuestion1().getAnswer() - markscheme.getQuestion1().getAnswer() == 1 || examAttempt.getQuestion1().getAnswer() - markscheme.getQuestion1().getAnswer() == -1){
			//if answer from question 1 is +-1 of the markscheme answer deduct one mark off from full mark
			examAttempt.getQuestion1().setMark(markscheme.getQuestion1().getMark()-1);
		}else if (examAttempt.getQuestion1().getAnswer() - markscheme.getQuestion1().getAnswer() <=5 || markscheme.getQuestion1().getAnswer() - examAttempt.getQuestion1().getAnswer() <=5){
			//if answer from question 1 is in between +5 -5 award 1 mark. Avoided using '>= -5' otherwise this would accept answer greater than +5 of the answer in the markscheme.
			examAttempt.getQuestion1().setMark(1);
		}else{
			examAttempt.getQuestion1().setMark(0);
		}
		System.out.println("Question 1: " + examAttempt.getQuestion1().getMark() + " out of " + markscheme.getQuestion1().getMark());

		//question 2 BooleanQuestion. If question 2 has same answer award full mark otherwise 0
		if (examAttempt.getQuestion2().getAnswer() == markscheme.getQuestion2().getAnswer()){ 
			examAttempt.getQuestion2().setMark(markscheme.getQuestion2().getMark());
		} else {
			examAttempt.getQuestion2().setMark(0);	
		}
		System.out.println("Question 2: " + examAttempt.getQuestion2().getMark() + " out of " + markscheme.getQuestion2().getMark());		

		//question 3 MultipleChoiceQuestion. Award 1 mark per correct option.
		if(examAttempt.getQuestion3().getOption1() == markscheme.getQuestion3().getOption1()){
			examAttempt.getQuestion3().setMark(1);
		}
		if (examAttempt.getQuestion3().getOption2() == markscheme.getQuestion3().getOption2()){
			examAttempt.getQuestion3().setMark(examAttempt.getQuestion3().getMark() + 1);
		}
		if (examAttempt.getQuestion3().getOption3() == markscheme.getQuestion3().getOption3()){
			examAttempt.getQuestion3().setMark(examAttempt.getQuestion3().getMark() + 1);
		}
	System.out.println("Question 3: " + examAttempt.getQuestion3().getMark() + " out of " + markscheme.getQuestion3().getMark());	
	examAttempt.setTotalMark(examAttempt.getQuestion1().getMark() + examAttempt.getQuestion2().getMark() + examAttempt.getQuestion3().getMark());			
	return examAttempt.getTotalMark();
	}

	/**
     * method convertMarksToClassification awards classification from a given mark and boundaries
     */	
	public float convertMarksToClassification(int mark, int firstBoundary, int upperSecondBoundary , int lowerSecondBoundary){
		float classification;		
		if (mark >= firstBoundary){
			classification = 1.1f;
		}else if (mark >= upperSecondBoundary ){
			classification = 2.1f;
		}else if (mark >= lowerSecondBoundary){
			classification = 2.2f;
		}else{
			classification = 0.0f;
		}
		return classification;
	}
}
	