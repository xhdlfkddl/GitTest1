package Ch10;

public class MainTest1 {

	public static void main(String[] args) {
		
		// �θ�Ÿ�� Calc
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
	}
	
}
