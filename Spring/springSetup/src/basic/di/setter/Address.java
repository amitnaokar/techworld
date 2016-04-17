package basic.di.setter;

public class Address {
	String city;
	String state;
	String country;
	int pincode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "city:"+city+"\tstate:"+state+"\tcountry:"+country+"\tpincode:"+pincode;
	}

	public void init(){
		System.out.println("Bean is going through init.");
	}

	public void destroy(){
		System.out.println("Bean will destroy now.");
	}

	public void defaultInit(){
		System.out.println("Bean default init.");
	}

	public void defaultDestroy(){
		System.out.println("Bean default destroy.");
	}
}
