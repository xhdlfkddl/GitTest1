package Ch03;

public class Engine {
	
	// Car 클래스와 멤버변수와 생성자, 메서드가 같음
	String name;
	int price;
	
	public Engine(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("엔진 이름: " + name);
		System.out.println("엔진 가격: " + price);
	}
}
