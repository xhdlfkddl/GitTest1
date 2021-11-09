package Ch03;

public class MainTest1 {
	
	// 메인함수
	public static void main(String[] args) {
		
		// 항과 연산자
		// 항(operand) : 연산에 사용되는 값 2*3 에서 2와 3을 뜻함
		// 연산자(operator) : 항을 이용하여 연산하는 기호 *
		
		// 대입 연산자 (assignment operator, "=") 
		// 변수에 다른 변수나 값을 대입하는 연산자
		// 이항 연산자 중 우선 순위가 가장 낮은 연산자들
		// 왼쪽 변수 = 오른쪽 변수 (변수 또는 식, 값)
		
		// 대입 연산의 순서 (오른쪽에서 왼쪽으로)
		// int a = 10;  10이라는 값이 a에 담긴다
		
		int number = 10;
		// = (수학기호와는 달리 변수나 값을 대입하는 연산자입니다.)
		// 연산의 방향은 오른쪽에서 왼쪽으로 연산이 됩니다
		
		int number2 = number;
		// 변수에 변수를 대입할 수도 있습니다
		
		System.out.println(number);
		System.out.println(number2);
		
		System.out.println("========================");
		
		// 부호 연산자 ( +, - )
		// 단항 연산자
		// 변수의 부호를 유지하거나(+) 바꿈(-)
		// 부호를 변경하는 연산자
		// 단 변수에 들어있는 실제 값을 변경한 상태는 아님
		System.out.println(-number);
		System.out.println("number의 현재 값: " + number);
		
		// 실제 변수의 부호를 변경하려면 대입 연산자를 사용해야함
		number  = -number;
		System.out.println(number);
		
	} // end of main
	
} // end of class
