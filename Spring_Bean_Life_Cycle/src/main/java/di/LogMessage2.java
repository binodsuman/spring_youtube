package di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LogMessage2 implements InitializingBean, DisposableBean {
	
	
	private String message;

	public void getMessage() {
		System.out.println("Log Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	public void destroy() {
	      System.out.println("Log Bean will destroy now using Interface.");
	}

	// this is your init method
	public void afterPropertiesSet() throws Exception {
		 System.out.println("Log Bean is going through init method using Interfaces.");
		
	}
	

}
