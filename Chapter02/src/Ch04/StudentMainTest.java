package Ch04;

public class StudentMainTest {
	
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		
		// �����ڴ� ����� �����־�� ��
		Student s1 = new Student(23, "������", 3);
		
		System.out.println(s1.number); // 23
		System.out.println(s1.name); // ������
		System.out.println(s1.grade); // 3
		
		s1.showInfo(); // �л��� �й��� 23�Դϴ�.
		
		System.out.println("=================");
		
		// �⺻ �����ڷ� ��ü �����غ���
		Student s2 = new Student();
		
		s2.number = 20;
		s2.name = "������";
		s2.grade = 1;
		
		System.out.println(s2.number);
		System.out.println(s2.name); 
		System.out.println(s2.grade); 
		
		
		
	} // end of main
	
} // end of class
