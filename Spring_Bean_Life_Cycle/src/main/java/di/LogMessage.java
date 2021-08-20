package di;

public class LogMessage {
	
	
	private String message;

	public void getMessage() {
		System.out.println("Log Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
	      System.out.println("Log Bean is going through init method.");
	   }
	
	public void destroy() {
	      System.out.println("Log Bean will destroy now.");
	}
	

}
