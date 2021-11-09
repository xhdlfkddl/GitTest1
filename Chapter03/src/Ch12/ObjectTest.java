package Ch12;

// 많이 사용하는 기본 클래스들이 속한 패키지
import java.lang.*;

class Student {
	
	@Override
	public String toString() {
		return "학생클래스";
	}
	
}

public class ObjectTest extends Object {
	String str1;
	
	public static void main(String[] args) {
		
		/*
		 object 클래스 - 모든 클래스의 최상위 클래스
		 
		 java.lang 패키지
		 프로그래밍시 import하지 않아도 자동으로 import됨
		 많이 사용하는 기본 클래스들이 속한 패키지
		 ex) String, System...
		 
		 모든 클래스는 Object 클래스를 상속받는다
		 java.lang.Object 클래스
		 모든 클래스의 최상위 클래스는
		 모든 클래스는 Object에서 상속받고, Object 클래스의 메서드 중 일부는 재정의하여 사용할 수 있음
		 컴파일러가 extends Object를 추가함
		 class Student -> calss Student extends Object
		 
		 toString()매서드
		 객체의 정보를 String으로 바꿔 사용할 때 쓰임
		 많이 사용하는 String은 이미 재정의 되어있음
		 */
		
		Student s1 = new Student();
		System.out.println(s1); // toString 재정의 후 -> "학생클래스"
		String str1 = new String("안녕안녕");
		System.out.println(str1);
		
		
	} // end of main

} // end of class
