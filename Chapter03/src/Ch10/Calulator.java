package Ch10;

// 추상클래스는 new 할 수 없음
public abstract class Calulator implements Calc {
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}
