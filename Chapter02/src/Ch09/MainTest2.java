package Ch09;

import java.util.Random;

public class MainTest2 {
	public static void main(String[] args) {
		
		// JDK가 만들어 놓은 도구
		
		Random r = new Random();
		// 괄호 안에 0~n번째 숫자까지 번호를 뽑아낼 수 있음.
		int value = r.nextInt(20);
		System.out.println("value 값은: " + value);
		
		
		
	}// end of main
} // end of class
