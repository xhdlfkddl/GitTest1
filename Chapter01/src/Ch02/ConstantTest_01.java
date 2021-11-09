package Ch02;

public class ConstantTest_01 {
	
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 상수(constant)
		// 상수는 변하지 않는 수 (일년의 개월 수 등)
		// 한번 초기화를 하면 값이 변하지 않음
		final int MAX_NUM = 12; // 상수의 선언과 초기화를 동시에 진행
		final int MIN_NUM; // 상수선언
		MIN_NUM = 1;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// 상수에 한 번 초기화 된 공간에는 값을 변경할 수 없다
//		MAX_NUM = 100; // 에러코드 : 다시 값을 바꿀 수 없다
		
		// 예제
		final int MY_COUNT = 100;
		// 1. 위에서 상수는 어디를 말하는 것인가요? 
		// 		MY_COUNT (보통 대문자, 언더바를 사용함)
		// 2. 위에서 예약어는 어디를 말하는 것인가요?
		// 		final, int (예약어란? 자바에서 미리 설정해놓은 단어)
		// 3. 위의 100은 무엇이라고 하나요?
		//		리터럴(우라가 알고 있는 '상수'의 다른 이름)
		
		
		
	} // end of main
} // end of class
