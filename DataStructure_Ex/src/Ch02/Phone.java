package Ch02;

public class Phone {
	
	String name;
	String address;
	String telephone;
	
	public Phone(String name, String address, String telephone) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "주소: " + address + ", 전화번호: " + telephone;
	}
	
	
}
