package Ch05;

public class ForMainTest{
	
	// 메인 메소드
	public static void main(String[] args) {
		
		// for 문
		// for(초기화식; 조건식; 증감식;) {수행문}
		
		// for문을 이용해서 1부터 10까지 덧셈, 연산
		// 연산에 담을 결과를 위해서 변수가 필요하다
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			// 복합 대입 연산자
//			sum = sum + i;
			sum += i;
			
			System.out.println("i의 현재값: " + i);
			System.out.println("sum의 현재값: " + sum);
			
		} // end of for
		
		System.out.println("sum: " + sum);
		
		
	} // end of main
	
} // end of class
