package Ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	public static void main(String[] args) {
		
		System.out.println("정수를 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		
		// 상수에 담는 값을 스캐너를 사용하여 코드를 수정해보세요
		final int LIMIT_VALUE = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE) {
			sum = sum + num;
			num++;
		} // end of while
		
		System.out.println("결과 값: " + sum);
		
	} // end of main
} // end of class
