package Ch05;

import java.util.Scanner;

public class WhileMainTest4 {
	public static void main(String[] args) {

		// 사용자가 0을 입력하면 프로그램을 종료시키도록
		// 사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경

		// do while 문 사용
		// scaaner를 사용, 사용자의 입력 값을 받아 덧셈연산을 해보세요
		// 반복문 종료 후 결과를 화면에 출력하는 프로그램을 만들어보세요


			Scanner scanner = new Scanner(System.in);

			int num;
			int sum = 0;
			do {
				System.out.println("덧셈 연산을 하고자 하는 정수를 입력해주세요");
				num = scanner.nextInt();
				sum += num;

			} while (num != 0);

			System.out.println("연산의 결과는: " + sum + " 입니다.");		
			
 /*
			for(int i = 0; i < 3; i++) {
				System.out.println("덧셈 연산을 하고자 하는 정수를 입력해주세요");
				num = scanner.nextInt();
				sum += num;
			}
			System.out.println("연산의 결과는: " + sum + " 입니다.");
  */

			
			
			
	} // end of main
} // end of class
