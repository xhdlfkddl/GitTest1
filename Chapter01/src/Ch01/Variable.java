package Ch01;

public class Variable {
	public static void main(String[] args) {
		
		// 변수를 사용하는 방법
		int age; 	// 변수의 선언
		int count;	// 변수의 선언
		
		// 변수의 초기화 (값을 넣는다)
		age = 20;
		count = 500;
		
		// 변수의 선언, 초기화를 동시에
		int age2 = 90;
		int count2 = 88;
		
		// 변수의 이름을 만들 때 규칙
		// 1. 대소문자가 구별되며 길이의 제한이 없음
			int name = 100; 
			int Name = 100; // 단, 변수명을 처음부터 대문자로 표기하지는 않음.
		
		// 2. 자바에서 사용하는 예약어(int, while, for, if 등)를 사용할 수 없다
		//	int while;
		//	int for;
		
		// 3. 변수는 숫자로 시작할 수 없습니다.
		// int 9name;
		// int 55age;	
		
		// 4. 특수문자는 _(언더바) ,(쉼표) $(달러)만 사용가능하다.
			int _age;
			int $age;
			int age_;
			int nam$e;
			
			System.out.println("===============");
			int id = 101;
			// 1. int 	<-- 데이터 자료형
			// 2. id		<-- 변수
			// 3. 101 	<-- 값(리터럴)
			
	} // end of main
} // end of class
