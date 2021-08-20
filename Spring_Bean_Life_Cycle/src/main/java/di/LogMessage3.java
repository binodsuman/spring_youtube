package di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LogMessage3  {
	
	
	private String message;

	public void getMessage() {
		System.out.println("Log Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void init()  {
		 System.out.println("Log Bean is going through init method using Annotation.");
		
	}
	
	@PreDestroy
	public void destroy() {
	      System.out.println("Log Bean will destroy now using Annotation.");
	}

	
	
	

}
