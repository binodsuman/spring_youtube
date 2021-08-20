package di;

public class CreditCard {
	
	int limit;
	String bankName;
	
	public CreditCard(int limit, String bankName) {
		this.limit = limit;
		this.bankName = bankName;
	}
	
	public void details() {
		System.out.println("This is Credit Card and limit is "+limit+" issue from this Bank :"+bankName);
	}

}
