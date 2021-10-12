package binod.suman.Spring_JWT.controller.entity;

public class CredentialRequest {
	
	private String userName;
	private String password;
	
	
	public CredentialRequest() {}
	
	public CredentialRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
