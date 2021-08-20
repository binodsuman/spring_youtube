package di;

public class DebitCard {
	
	public Address address;
	
	public DebitCard(Address address) {
		this.address = address;
	}
	
	public void details() {
		System.out.println("This is Debit Card, city is : "+address.city);
	}

}
