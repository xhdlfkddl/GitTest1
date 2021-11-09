package Ch05;

public class WhileMainTest3 {
	public static void main(String[] args) {
		
		// do while문
		// 조건과 상관없이 한번은 수행문을 수행한다
		// while문은 조건을 먼저 체크하고 반복 수행이 된다면, do while은 조건과 상관없이
		// 수행을 한번 하고나서 조건을 체크함
		// do{
		//		수행문 - 무조건 실행
		// } while (조건문);
		
		int input = 10;
		int sum = 0;
		
		do {
			System.out.println("현재값: " + input);
			sum += input;
			input--;
			
		} while(input != 0);
		System.out.println("연산의 결과는: " + sum + " 입니다");
		
		
	} //end of main
} // end of class
