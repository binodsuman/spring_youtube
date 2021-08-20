package di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LogMessage2  implements ILogMessage{
	
	//private String message = "Spring is super easy from SECOND CLASS"; // Hard Code
			
	//@Value("Spring is awesome") // Defualt Message;
	
	//@Value("${caption}")
	@Value("${java.home}")
	private String message;
	
	   public void getMessage(){
	      System.out.println("Log Message : " + message);
	   }
}
