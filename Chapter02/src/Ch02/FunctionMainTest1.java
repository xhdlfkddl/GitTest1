package Ch02;

public class FunctionMainTest1 {
	public static void main(String[] args) {
		
		// 함수란? (function)
		// 하나의 기능을 수행하는 일련의 코드
		// 구현된(정의된) 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 제어가 반환됨
		// 함수로 구현된 하나의 기능은 여러 곳에서 동일한 방식으로 호출되어 사용될 수 있음
		
		// 함수 정의하기
		// 함수는 이름, 매개 변수, 변환 값, 함수 몸체(body)로 구성됨
		// 함수의 기능이 완료되면 return을 사용하여 결과를 반환함
		// 결과를 반환하지 않는다면(return 값이 없다면) void를 사용함
		
		// 함수 사용 방법 (모양 맞추기)
		// 생성한 함수의 이름을 적고 괄호를 만들어줌
		// 괄호 안에는 input(매개변수)값을 넣을 수 있음
		// return 데이터 타입과 맞게 변수를 생성
		int addResult1 = add(1,2);
		System.out.println(addResult1);
		
		int addResult2 = add(23,45);
		System.out.println(addResult2);
		
		
		
		
	} // end of main
	
	// add 함수를 생성
	// 이곳의 int는 return 타입임
	public static int add(int num1, int num2) {
		
		// 함수 안에서 사용하는 변수는 지역변수
		int result;
		
		// result 라는 지역변수에 연산을 사용
		result = num1 + num2;
		
		// 리턴 키워드를 만났을 때 실행의 제어권을 반환한다.
		return result;
	}
	
} // end of class
