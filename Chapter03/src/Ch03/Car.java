package Ch03;

public class Car {
	
	// Engine 클래스와 멤버변수와 생성자, 메서드가 같음
	// 하지만 상속을 쓰면 안됨
	String name;
	int price;
	
	// 상속관계가 아닌 포함관계(has a)가 됨
	Engine engine;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("자동차 이름: " + name);
		System.out.println("자동차 가격: " + price);
	}
	
}
