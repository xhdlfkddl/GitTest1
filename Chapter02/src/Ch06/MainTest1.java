package Ch06;

// 클래스를 사용하는 입장
public class MainTest1 {
	
	// 메인 함수(코드의 시작점)
	public static void main(String[] args) {
		
		// 학생Lee
		Student studentLee = new Student(1, "Lee");
		
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		
		studentLee.showStudentScore(); // NullPointerException 발생
		
		// 학생Kim
		Student studentKim = new Student(2, "Kim");
		
		studentKim.setKoreaSubject("국어", 95);
		studentKim.setMathSubject("수학", 95);
		
		studentKim.showStudentScore(); 
		
		// 학생Park
		Student studentPark = new Student(3, "Park");
		
		studentPark.setKoreaSubject("국어", 80);
		studentPark.setMathSubject("수학", 100);
		
		studentPark.showStudentScore(); 
		
		
	} // end of main
	
} // end fo class
