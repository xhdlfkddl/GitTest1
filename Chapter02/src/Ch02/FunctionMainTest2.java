package Ch02;

public class FunctionMainTest2 {
	public static void main(String[] args) {
		
		// 함수 사용하는 방법(모양 맞추기)
		int num1 = 10;
		int num2 = 20;
		
		double total = addNum(42.123, 10.5);
		System.out.println("total: " + total); // total: 52.623
		
		sayHello("안녕하세요?"); // 안녕하세요?
		
		// 매개변수가 없는 함수이기 때문에 괄호 안에 아무것도 적으면 안됨
		int sum  = calcSum();
		System.out.println("sum: " + sum); // sum: 5050
		
		int intAddResult = intAdd(1, 2, 3);
		System.out.println(intAddResult);
		
		double doubleAddResult = doubleAdd(3.14, 4.14);
		System.out.println(doubleAddResult);
		
		String article = "아토";
		printArticle(article);
		
	} // end of main
	
	// 1. 반환 값이 없는 함수 설계하기
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 2. 매개변수가 없는 함수 만들기 -> 반환값 존재
	public static int calcSum() {
		
		// 지역변수(지역에서만 존재하는 변수) 선언/초기화
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
		} // end of for
		return sum;
		
	} // end of calcSum
	
	// 3. 반환값이 존재하면서 매개변수를 받는 함수 만들기
	public static double addNum(double n1, double n2) {
		
		double result = 0.0;
		result = n1 + n2;
		
		return result;
	}
	
	// 함수를 만들어 봅시다
	// 1. return값 int, 매개변수 n1, n2, n3 이름 -> intAdd
	public static int intAdd(int n1, int n2, int n3) {
		int intAddResut;
		
		intAddResut = n1 + n2 + n3;
		
		return intAddResut;
	}
	
	// 2. return값 double, 매개변수 d1, d2 이름-> doubleAdd
	public static double doubleAdd(double d1, double d2) {
		double doubleAddResult;
		
		doubleAddResult = d1 + d2;
		
		return doubleAddResult;
	}
	
	// 3. return값 없음, 매개변수 String article 이름 -> printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	
} // end of class
