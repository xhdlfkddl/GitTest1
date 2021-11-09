package Ch03;

public class MainTest2 {
	
	// 메인함수
	public static void main(String[] args) {
		
		// 산술 연산자
		// + 두 항을 더합니다
		// - 앞에 있는 항에서 뒤에 있는 항을 뺍니다
		// * 두항을 곱합니다
		// / 앞에 있는 항에서 뒤에 있는 항을 나누어 몫을 구합니다
		// % 앞에 있는 항에서 뒤에있는 항을 나누어 나머지를 구합니다
		int number1 = 5 +3;
		int number2 = 5-3;
		int number3 = 5*3;
		int number4 = 5/3;
		int number5 = 5%3;
		
		System.out.println(number1); // 8
		System.out.println(number2); // 2
		System.out.println(number3); // 15 
		System.out.println(number4); // 1
		System.out.println(number5); // 2
		
		// 문제
		// 1. (12+3) / 3을 화면에 출력해보세요
		// 단 변수를 만들어서 담고 출력해주세요
		int number6 = (12 + 3) / 3;
		System.out.println(number6); // 5
		
		// 2. (25%2) 값을 화면에 출력해보세요
		// 단 변수 사용없이 바로 화면에 출력해주세요
		System.out.println(25 % 2); // 1
		
		
		
	} // end of main
	
} // end of class
