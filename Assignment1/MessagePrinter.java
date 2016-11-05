/* PPA Assignment 1
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 */

public class MessagePrinter {
	
	public static void main (String[] args) {
		
		//Define new variable instanceOfMessage and copy the entire codes from Message
		Messages instanceOfMessage = new Messages();
		instanceOfMessage.namePrinter();
		instanceOfMessage.wordPrinter();
		instanceOfMessage.incrementPrinter(10); //open variable instanceOfMessage and call incrementPrinter with num = 10
	}
}
