package Ch04;

import java.util.Scanner;

public class IfMainTest2 {
	
	// 메인메소드
	public static void main(String[] args) {
		
		System.out.println("성적을 입력해주세요: ");
		
		Scanner scanner = new Scanner(System.in);
		
		// 내가 입력한 정수값
		int point = scanner.nextInt();
		char result ='Z';
		
		// 문제 1. if문을 사용하여 학점을 출력해주세요.
		// 100 ~ 91점 = A
		// 90 ~ 81점 = B
		// 80 ~ 71점 = C
		// 70 ~ 61점 = D
		// 60 ~ 0점 = F
		
		if (point <= 100 && point >= 90 ) {
			result = 'A';
		} else if (point <=90 && point >= 80) {
			result = 'B';
		} else if (point <=80 && point >= 70) {
			result = 'C';
		} else if (point <= 70 && point >= 60) {
			result = 'D';
		} else if (point < 60 && point >= 0) {
			result = 'F';
		}
		
		if (result != 'Z') {
			System.out.println("당신의 학점은: " + result + "입니다");
		} else {
			System.out.println("잘못된 입력입니다");
		}
		
	} // end of main
} //end of class
