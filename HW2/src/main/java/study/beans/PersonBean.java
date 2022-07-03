package study.beans;

public class PersonBean {

	private String name;
	private int age;
	private AddressBean adress;
	
	public PersonBean()
	{
		System.out.println("PersonBean constructor is called");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressBean getAdress() {
		return adress;
	}

	public void setAdress(AddressBean adress) {
		this.adress = adress;
	}

	
	
	
}
