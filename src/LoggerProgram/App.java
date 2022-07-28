package LoggerProgram;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Logger asteriskLogger = new AsteriskLogger();
			Logger spacedLogger = new SpacedLogger();
	
			Scanner userString = new Scanner(System.in);
				//Allows each method to be tested in the console through user input rather than manual coding changes. 
			
			System.out.println("Please enter your first word:");
			
				asteriskLogger.Log(userString.nextLine());
					//Takes user input and passes it through the log method in the AsteriskLogger class.
				
			System.out.println("Please enter your second word:");
			
				asteriskLogger.Error(userString.nextLine());
					//Takes user input and passes it through the error method in the AsteriskLogger class.
				
			System.out.println("Please enter your Third word:");	
				
				spacedLogger.Log(userString.nextLine());
					//Takes user input and passes it through the log method in the SpacedLogger class.
				
			System.out.println("Please enter your Fourth word:");
			
				spacedLogger.Error(userString.nextLine());
					//Takes user input and passes it through the error method in the SpacedLogger class.
			
					userString.close();
			
			
	}

}
