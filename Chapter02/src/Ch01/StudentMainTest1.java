package Ch01;

// ����� �л� Ŭ������ ����غ��� ����
public class StudentMainTest1 {
	
	// �����Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		
		// ���� Ÿ���� �����մϴ�.
		Student s1;
		Student s2;
		
		// �ʱ�ȭ�մϴ�. (heap�� �����ϴ� �����Դϴ�)
		// instance�� �� ����
		// heap �޸𸮿� ��ü�� ������ �� �ּҰ��� s1, s2�� ���� ���� 
		s1 = new Student();
		s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
	} // end of main
	
} // end of class
