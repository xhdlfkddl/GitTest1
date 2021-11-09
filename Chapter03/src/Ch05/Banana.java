package Ch05;

// banana 클래스로 볼수도 있고 fruit 클래스로 볼수도 있음
// 다형성 개념이 적용된 것.
public class Banana extends Fruit {
		
	String origin;
	
	public Banana() {
		name = "바나나";
		price = 3000;
		fresh = 100;
		origin = "태국";
	}
	
}
