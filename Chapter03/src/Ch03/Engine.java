package Ch03;

public class Engine {
	
	// Car Ŭ������ ��������� ������, �޼��尡 ����
	String name;
	int price;
	
	public Engine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("���� �̸�: " + name);
		System.out.println("���� ����: " + price);
	}
}
