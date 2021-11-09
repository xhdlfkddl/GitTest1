package Chapter01;

public class HelloJava {
	
	// 메인함수 (코드의 시작점) // <-- 주석
	public static void main(String[] args) {
		// 사람이 작성한 코드를 기계가 알아들을 수 있도록 하는 것을 컴파일이라고함
		// 저장버튼을 누르게 되면 bin 안의 .class 파일로 저장되어 컴파일됨
		
		System.out.println("Hello Java");
		// 화면에 문자열을 출력해봅시다.
		System.out.println("안녕하세요");
		
		// 글자를 작성하고 한줄을 띄움
		System.out.println();
		System.out.println("반갑습니다");
		
		// 글자를 작성하고 한줄을 띄우지않음
		System.out.print("여기는 print 명령문입니다.");
		System.out.println("다른 명령문입니다.");
		
	
	} // end of main

} // end of class
