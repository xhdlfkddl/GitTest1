package Ch05;

public class Fruit {
	
	String name;
	int price;
	int fresh;
	
	public void showInfo() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 가격: " + price);
		System.out.println("과일 신선도: " + fresh);
		System.out.println();
	}
	
	/*
	public Fruit(String name, int price, int fresh) {
		this.name = name;
		this.price = price;
		this.fresh = fresh;
	}
	*/
	
	
}
