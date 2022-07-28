package LoggerProgram;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
	
		int logLength = 6 + log.length();
			//Adds 6 characters for the text concatenated around log, then adds log's length. 
		
			for(int i = 0; i < logLength; i++) {
				System.out.print("*");
			}
				//prints out a line of * that matches the length of the middle line no matter how long the String log is. 
				System.out.print("\n");
			
		
		System.out.println("***" + log + "***");
				//concatenates the middle line of the output.
		
			for(int i = 0; i < logLength; i++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}

	@Override
	public void Error(String error) {
		
		int errorLength = 13 + error.length();
			//Adds 13 characters for the text concatenated around error, then adds error's length. 
			for(int i = 0; i < errorLength; i++) {
				System.out.print("*");
			}
				//prints out a line of * that matches the length of the middle line no matter how long the String error is. 
		
			System.out.print("\n");
			
		System.out.println("***Error: " + error + "***");
				//concatenates the middle line of the output.
		
			for(int i = 0; i < errorLength; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		
		}
			
		
		
				
		
	
	

	
	
}
