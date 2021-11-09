package Ch03;

public class MainTest3 {

	// 메인 메소드
	public static void main(String[] args) {

		// 증감, 감소 연산자
		// 단항연산자
		// 변수의 값을 1 더하거나 1 뺄 때 사용
		// 문장(statement)의 끝(;)을 기준으로 연산 시점을 생각해야함

		// ++ 항의 값에 1을 더합니다
		int num1 = 1;
		num1++;
		System.out.println(num1); // 2
		
		// -- 항의 값에 1을 뺍니다
		int num2 = 1;
		num2--;
		System.out.println(num2); // 0
		
		// 연산자가 항의 앞에 있는가, 뒤에 있는가에 따라 연산 시점과 결과가 달라짐
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		// num3의 값을 num4에 대입한 뒤 num3의 값을 ++ 함
//		num4 = num3++;
//		System.out.println(num4); // 10
//		System.out.println(num3); // 11
		
		// num3의 갑에 ++ 해준 뒤 num4에 값을 대입
		num4 = ++num3;
		System.out.println(num4); // 11
		System.out.println(num3); // 11
		
		// 문제
		int num5 = 100;
		int num6;
		// 1. num5를 num6 변수에 담아주세요
		// 단 증감 연산자를 사용하여 num6 변수를 101로 만들어서 출력
		num6 = ++num5;
		System.out.println(num6);
		
		// 2. num5를 num6 변수에 담아주세요
		// 단 증감 연산자를 사용하여 num6 변수를 101로 만들어서 출력
		num6 = num5++;
		System.out.println(num6);
		System.out.println(num5); // 102
		
		// 결론 : 증감 연산자는 변수(공간)에 있는 값을 1 증가시킨다.
		// 단, 앞에 있을 때와 뒤에 있을 때와 연산의 순서가 다르다.
	} // end of main
} // end of class
