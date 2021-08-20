package di;

import org.springframework.stereotype.Component;

//@Component("log")
public class LogMessage {

	private String message = "Spring is super easy";
	
	public void setMessage(String message){
	      this.message = message;
	   }
	
	public void getMessage(){
	      System.out.println("Log Message : " + message);
	}
}
