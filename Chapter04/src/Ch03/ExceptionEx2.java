package Ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {
	
	public static void main(String[] args) {

		//
		FileInputStream fis;
		
		try {
			//FileNotFoundException이 발생할 수 있습니다.
			fis = new FileInputStream("a.txt");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			
		// Exception은 예외 처리 중 최상위 클래스임
		} catch (Exception e) { 
			System.out.println("예외처리");
			return; // return문이 있어도 finally가 실행됨, finally 하단의 명령문은 실행되지않음
		// try문이 실행되면 반드시 실행됨
		} finally {
			System.out.println("반드시 실행됩니다.");
		}
		
		System.out.println("비정상 종료가 되지않았습니다.");
		
	} // end of main
	
} // end of class
