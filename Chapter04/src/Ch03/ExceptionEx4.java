package Ch03;

import java.util.logging.Logger;

class Student {
	String name;
	int grade;
}

public class ExceptionEx4 {
	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("myLogger");
		
		Student student = null;
		
		try {
			student.name = "홍길동";
		} catch (Exception e) {
			//System.out.println("오류발생!!");
			logger.warning("오류발생: " + e.toString());
		}
		
		System.out.println("비정상 종료되지않음");
		
		
	} // end of main
	
} // end of class
