package Ch03;

// Ŭ������ ����ϴ� ���� �ڵ�
public class StudentMainTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "��õ";
		
		studentLee.showStudentInfo(); // �̼���, ��õ
		studentLee.takeTest(); // �л��� ������ ģ��
		studentLee.cleanUp(); // �л��� û�Ҹ� �Ѵ�
		
		System.out.println("==================");
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo(); // ������, ����
		// �޼��� ���
		// 1. takeTest ���
		studentKim.takeTest(); // �л��� ������ ģ��
		// 2. cleanUp ���
		studentKim.cleanUp(); // �л��� û�Ҹ� �Ѵ�
		
		System.out.println("==================");
		
		
		String name1 = studentKim.getStudentName();
		System.out.println("name1: " + name1); // ������
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2: " + name2);
		
	}// end of main
	
} // end of class
