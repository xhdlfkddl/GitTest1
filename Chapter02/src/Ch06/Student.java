package Ch06;

public class Student {
	/*
	변수의 자료형
	 
	 1. 기본 자료형 int, long, float, double 등
	 - 첫글자가 소문자
	 
	 2. 참조 자료형 String, Date, Student 등
	 - 개발자가 직접 만들수 도 있고 JDK에서 만들어놓은 자료형을 사용할 수 있음
	 클래스 형으로 변수를 선언
	 기본 자료형은 사용하는 메모리의 크기가 정해져있지만(ex. int는 4byte), 참조 자료형은 클래스에 따라 다름
	 참조 자료형을 사용랄 때는 해당 변수에 대하여 생성해야함. (ex. new Student)
	 단, String 클래스는 예외적으로 생성하지 않고 사용가능
	 
	 */
	int studentId;
	
	String studentName;
	
	// 우리가 설계한 클래스를 참조타입으로 사용합니다.
	Subject korea = new Subject();
	Subject math = new Subject();
	
	// 생성자(해당 객체를 메모리에 올릴 때)
	public Student(int id, String name) {
		studentId = id; // main에서 받은 값을 넘겨받음
		studentName= name;
		
		// ??
		// NullPointerExecption 발생의 이유
		// 참조 타입은 생성을 해야 사용할 수 있다.
		// 메모리에 존재하게 만들어야한다. = new
//		korea = new Subject();
//		math = new Subject();
	}
	
	// 메서드
	// 정보를 입력받는 메서드 생성 (국어 과목에 대한 정보세팅)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// 수학과목에 대한 정보세팅
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	// 학생의 총점을 화면에 출력하는 기능
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
	
}
