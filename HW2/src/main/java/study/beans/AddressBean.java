package study.beans;

public class AddressBean {
	
	private String city;
	private int pin;
	
	public AddressBean()
	{
		System.out.println("AddressBean constructor is called");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

}
