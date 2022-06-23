package aggregation;

public class Address {
	int houseNo;
	String city;
	String state;
	int pinNo;
	public Address() {
		super();
	}
	public Address(int houseNo, String city, String state, int pinNo) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", state="
				+ state + ", pinNo=" + pinNo + "]";
	}
	
	

}
