package Ch03;

// 클래스를 사용하는 입장 코딩
public class StudentMainTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "인천";
		
		studentLee.showStudentInfo(); // 이순신, 인천
		studentLee.takeTest(); // 학생이 시험을 친다
		studentLee.cleanUp(); // 학생이 청소를 한다
		
		System.out.println("==================");
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo(); // 김유신, 경주
		// 메서드 사용
		// 1. takeTest 사용
		studentKim.takeTest(); // 학생이 시험을 친다
		// 2. cleanUp 사용
		studentKim.cleanUp(); // 학생이 청소를 한다
		
		System.out.println("==================");
		
		
		String name1 = studentKim.getStudentName();
		System.out.println("name1: " + name1); // 김유신
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2: " + name2);
		
	}// end of main
	
} // end of class
