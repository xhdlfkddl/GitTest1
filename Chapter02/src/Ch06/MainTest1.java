package Ch06;

// Ŭ������ ����ϴ� ����
public class MainTest1 {
	
	// ���� �Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		
		// �л�Lee
		Student studentLee = new Student(1, "Lee");
		
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);
		
		studentLee.showStudentScore(); // NullPointerException �߻�
		
		// �л�Kim
		Student studentKim = new Student(2, "Kim");
		
		studentKim.setKoreaSubject("����", 95);
		studentKim.setMathSubject("����", 95);
		
		studentKim.showStudentScore(); 
		
		// �л�Park
		Student studentPark = new Student(3, "Park");
		
		studentPark.setKoreaSubject("����", 80);
		studentPark.setMathSubject("����", 100);
		
		studentPark.showStudentScore(); 
		
		
	} // end of main
	
} // end fo class
