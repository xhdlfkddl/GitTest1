package Ch01;

public class CharacterTest {
	public static void main(String[] args) {
		
		char ch1 = 'A'; // 정수 값 65이 저장되어있음
		System.out.println(ch1); // 인코딩 되어 A가 출력됨
		System.out.println((int)ch1); // 인코딩 되기 전의 값 = 65가 출력됨
		
		char ch2 = 66; // 'A' , 'C'
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((int)ch3);
		
		// 주의할 점 - 음수는 대입 불가함
//		char ch4 = -68;
		
		// 문제
		// 1. 안, 녕, 하, 세, 요  --> 각각 정수값은 얼마인가요?
		char a1 = '안';
		char a2 = '녕';
		char a3 = '하';
		char a4 = '세';
		char a5 = '요';
		
		// 방법 1
		System.out.println("안녕하세요 정수값은?");
		System.out.println((int)a1);
		System.out.println((int)a2);
		System.out.println((int)a3);
		System.out.println((int)a4);
		System.out.println((int)a5);
		
		// 방법 2
		System.out.println((int)'안');
		System.out.println((int)'녕');
		System.out.println((int)'하');
		System.out.println((int)'세');
		System.out.println((int)'요');
		
	} // end of main
	
} // end of class
