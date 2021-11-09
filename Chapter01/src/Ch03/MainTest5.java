package Ch03;

public class MainTest5 {
	
	// 메인 메소드 
	public static void main(String[] args) {
		
		// 논리 연산자 (&&, ||) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용됨
		// 연산의 결과가 true, false로 반환됨
		
		int num1 = 10;
		int num2 = 20;
		
		
		// && (논리 곱) 두 항이 모두 참인 경우에만 결과의 값이 참입니다
		boolean flag1 = ( num1 > 0 ) && ( num2 > 0 ); // true, true
		System.out.println(flag1); // true
		
		boolean flag2 = ( num1 > 0) && ( num2 < 0); // true, false
		System.out.println(flag2); // false
		
		
		// || (논리 합) 두 항 중 하나의 항만 참이면 결과 값은 참입니다. 두 항이 모두 거짓이면 결과 값은 거짓입니다
		boolean flag3 = ( num1 < 0 ) || ( num2 > 0 ); // false, true
		System.out.println(flag3); // true

		boolean flag4 = ( num1 > 0 ) || ( num2 > 0 ); // true, true
		System.out.println(flag4); // true
		

		// ! (부정) 단항 연산자입니다. 참인경우는 거짓으로 바꾸고 거짓인 경우는 참으로 바꿉니다
		
		
		
		// 논리 연산에서 모든 항이 실행되지 않는경우
		
		// 논리 곱은 두 항의 결과가 모두 참일 때만 결과가 참
		// -- 앞의 항의 결과가 거짓이면 뒤 항의 결과를 평가하지 않음
		boolean flag5 = ( num1 < 0 ) && ( num2 > 0 ); // false, 평가 안함
		
		// 논리 합은 두 항의 결과가 모두 거짓일 때만 결과가 거짓
		// -- 앞의 항의 결과가 참이면 뒤 항의 결과를 평가하지 않음
		boolean flag6 = ( num1 > 0 ) || ( num2 > 0 ); // true, 평가안함
		
	
	} // end of main
	
} // end of class
