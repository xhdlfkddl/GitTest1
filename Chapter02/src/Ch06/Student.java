package Ch06;

public class Student {
	/*
	������ �ڷ���
	 
	 1. �⺻ �ڷ��� int, long, float, double ��
	 - ù���ڰ� �ҹ���
	 
	 2. ���� �ڷ��� String, Date, Student ��
	 - �����ڰ� ���� ����� �� �ְ� JDK���� �������� �ڷ����� ����� �� ����
	 Ŭ���� ������ ������ ����
	 �⺻ �ڷ����� ����ϴ� �޸��� ũ�Ⱑ ������������(ex. int�� 4byte), ���� �ڷ����� Ŭ������ ���� �ٸ�
	 ���� �ڷ����� ���� ���� �ش� ������ ���Ͽ� �����ؾ���. (ex. new Student)
	 ��, String Ŭ������ ���������� �������� �ʰ� ��밡��
	 
	 */
	int studentId;
	
	String studentName;
	
	// �츮�� ������ Ŭ������ ����Ÿ������ ����մϴ�.
	Subject korea = new Subject();
	Subject math = new Subject();
	
	// ������(�ش� ��ü�� �޸𸮿� �ø� ��)
	public Student(int id, String name) {
		studentId = id; // main���� ���� ���� �Ѱܹ���
		studentName= name;
		
		// ??
		// NullPointerExecption �߻��� ����
		// ���� Ÿ���� ������ �ؾ� ����� �� �ִ�.
		// �޸𸮿� �����ϰ� �������Ѵ�. = new
//		korea = new Subject();
//		math = new Subject();
	}
	
	// �޼���
	// ������ �Է¹޴� �޼��� ���� (���� ���� ���� ��������)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// ���а��� ���� ��������
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	// �л��� ������ ȭ�鿡 ����ϴ� ���
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�.");
	}
	
	
}
