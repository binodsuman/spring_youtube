package di;

import org.springframework.stereotype.Component;

@Component
public class LogMessage implements ILogMessage{
	
	private String message = "Spring is super easy"; // Hard code
			

	   public void getMessage(){
	      System.out.println("Log Message : " + message);
	   }
}
