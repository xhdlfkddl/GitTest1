package Ch05;

import java.util.Scanner;

public class ContinueTest {
	public static void main(String[] args) {
	
		// 예약어 continue
		// 무시하고 진행하는 continue
		
		// 스캐너를 이용하여 MAX값, MULTIPLE값을 받아서 사용
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("MAX 값: ");
		final int MAX = scanner.nextInt();

		System.out.println("배수 값: ");
		final int MULTIPLE = scanner.nextInt();
		
		int num;
		int count = 0;
		
		for(num = 1; num < MAX; num++) {
			
			// 3의 배수라면 출력하지 마세요
			if(num % MULTIPLE == 0) {
				// break와는 달리 멈추고 밑에 있는 명령이 실행되는 것이 아니라
				// 다시 for문으로 돌아가서 일을 반복하게 됨
				count++;
				continue;
				
			} // end of if
			
		} // end of for
		//System.out.println("출력 값: " + num);
		System.out.println( MULTIPLE + "의 배수의 개수: " + count);
		
		
	} // end of main
	
} // end of class
