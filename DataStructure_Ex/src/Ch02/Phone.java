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
		return "�ּ�: " + address + ", ��ȭ��ȣ: " + telephone;
	}
	
	
}
