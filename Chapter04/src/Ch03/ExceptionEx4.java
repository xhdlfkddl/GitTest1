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
			student.name = "ȫ�浿";
		} catch (Exception e) {
			//System.out.println("�����߻�!!");
			logger.warning("�����߻�: " + e.toString());
		}
		
		System.out.println("������ �����������");
		
		
	} // end of main
	
} // end of class
