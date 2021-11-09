package Ch10;

public interface Calc {
	
	// static final 생략
	double IP = 3.14;
	int ERROR = -99999;
	
	// 추상메서드
	// body가 없고 선언만 하는 것
	// return int
	// add, 매개변수 num1, num2 더하기
	int add(int num1, int num2);
	
	//substract, 매개변수 num1, num2 빼기
	int substract(int num1, int num2);
	
	// times 매개변수 num1, num2 곱하기
	int times(int num1, int num2);
	
	// divide 매개변수 num1, num2 나누기
	int divide(int num1, int num2);
	
	// void showInfo
	void showInfo();
	
	
}
