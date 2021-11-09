package Ch03;

public class Student {

	// 메서드(method)
	// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	// 멤버 함수(member function)이라고도 함
	// 메서드를 구현함으로써 객체의 기능이 구현됨
	
	// 객체의 상태를 나타냄
	// 멤버 변수 선언
	public int studentID;
	public String studentName;
	public String address;
	
	// 메서드 (멤버 변수를 이용하여 객체의 기능을 만들어 냄)
	// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	// = 멤버 함수(member function)
	// 메서드를 구현함으로서 객체의 기능이 구현됩니다
	public void showStudentInfo() {
		System.out.println(studentName + ","  + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void takeTest() {
		System.out.println(studentName + " 학생이 시험을 친다.");
	}
	
	public void cleanUp() {
		System.out.println(studentName + " 학생이 청소를 한다");
	}
	

} // end of class
