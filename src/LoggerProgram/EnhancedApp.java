package LoggerProgram;

import java.util.Scanner;

public class EnhancedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLogger = new AsteriskLogger(); 
			//Instantiates the AsteriskLogger class to be used in this app. 
		Logger spacedLogger = new SpacedLogger();
			//Instantiates the SpacedLogger class to be used in this app. 
		
		Scanner methodSelection = new Scanner(System.in);
			//creates a new scanner to be used for selecting methods during testing. 
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Please select which method you would like to test:");
			System.out.println("1: Asterisk-Log");
			System.out.println("2: Asterisk-Error");
			System.out.println("3: SpacedLogger-Log");
			System.out.println("4: SpacedLogger-Error");
			
				//small menu for testing all logger methods in this assignment. 
			
			String choice = methodSelection.nextLine();
			
				//stores user input to be compared to the choices below. Gets reset each time the loop runs. 
			
			switch(choice){
			
				case "1":
					System.out.println("Please enter your test word:");
						
						asteriskLogger.Log(methodSelection.nextLine());
							//Takes user input and passes it through the Log method in the AsteriskLogger class.
						break;
				case "2":
					System.out.println("Please enter your test word:");
					
						asteriskLogger.Error(methodSelection.nextLine());
							//Takes user input and passes it through the Error method in the AsteriskLogger class.
						break;
					
				case "3":
					System.out.println("Please enter your test word:");
					
						spacedLogger.Log(methodSelection.nextLine());
							//Takes user input and passes it through the Log method in the SpacedLogger class.
						break;
						
				case "4":
					System.out.println("Please enter your test word:");
					
						spacedLogger.Error(methodSelection.nextLine());
							//Takes user input and passes it through the Error method in the SpacedLogger class.
						break;
						
				default:
					System.out.println("Please enter a valid number 1-4.");
					
				}
			
		
		}
		
		methodSelection.close();
	}

}
