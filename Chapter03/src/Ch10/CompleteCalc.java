package Ch10;

public class CompleteCalc extends Calulator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int result = 0;
		
		if (num2 == 0) {
			System.out.println(Calc.ERROR);
		}
		else {
			result = num1 / num2;
		}
		return result;
	}

	@Override
	public void showInfo() {
		System.out.println("모두 구현했습니다.");
	}

	

}
