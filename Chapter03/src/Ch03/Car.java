package Ch03;

public class Car {
	
	// Engine Ŭ������ ��������� ������, �޼��尡 ����
	// ������ ����� ���� �ȵ�
	String name;
	int price;
	
	// ��Ӱ��谡 �ƴ� ���԰���(has a)�� ��
	Engine engine;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("�ڵ��� �̸�: " + name);
		System.out.println("�ڵ��� ����: " + price);
	}
	
}
