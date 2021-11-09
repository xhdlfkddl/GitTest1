package Ch03;

import java.util.Scanner;

public class MainTest6 {
	
	// 메인 메소드
	public static void main(String[] args) {
		
		// 조건 연산자
		// 삼항 연산자
		// 조건식의 결과가 true 인 경우와 false인 경우에 따라 다른 결과가 수행됨
		// if (조건문)을 간단히 표현할 때 사용 가능
		
		// 연산자 
		// 조건식 ? 결과1 : 결과2
		// 조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택됩니다.
		int num1 = ( 5 > 3 ) ? 10  : 20; // trre
		System.out.println(num1); // 10
		
		int num2 = ( 5 < 3 ) ? 10  : 20; // false
		System.out.println(num2); // 20
		
		//JDK가 만들어준 도구를 이용해 봅시다.
		int max;
		System.out.println("입력받은 두 수 중 큰 수를 출력하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력 1 : ");
		int x = scanner.nextInt();
		System.out.println("입력 2 : ");
		int y = scanner.nextInt();
		
		// 삼항연산자 식
		max = ( x > y )? x : y;
		System.out.println("큰 숫자는 : " + max + "입니다");
	
	
	} // end of main
} // end of class
