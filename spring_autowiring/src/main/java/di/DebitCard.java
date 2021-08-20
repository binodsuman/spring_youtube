package di;

public class DebitCard {
	
	public Address add2;
	
	public DebitCard() {}
	
	public DebitCard(Address add2) {
		System.out.println("Hitting Constructor");
		this.add2 = add2;
	}
	
	public void setAddress(Address address) {
		System.out.println("Hitting setter method");
		this.add2 = address;
	}
	
	public void details() {
		System.out.println("This is Debit Card and address is :"+add2.city);
	}

}
