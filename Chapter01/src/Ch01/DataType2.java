package Ch01;

public class DataType2 {
	
	// 메인함수(코드의 시작점
	public static void main(String[] args) {
		
		// 기본 자료형 - 문자 자료형
		
		// 변수의 선언
		char name; // 2byte
		char a;
		char initial;
		
		// 값을 넣는다 -> 값을 초기화한다.
		// ' ' = 문자 한 글자,  " " = 문자열
		name = 'A'; // name = 'AB'; = 불가
		a = 'B';
		initial = 'C';
		
		// 문제 1 2 3, 화면에 변수 name, a, initial 출력해주세요
		// ctrl + alt + 화살표 = 라인복사
		
		// 변수로 사용한 것은 지속적으로 사용가능
		System.out.println(name);
		System.out.println(a);
		System.out.println(initial);
		
		System.out.println("================");
		// 지속적으로 사용불가
		System.out.println('a');
		System.out.println('b');
		System.out.println('c');
		
	} // end of main
	
} // end of class
