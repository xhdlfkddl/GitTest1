package Ch01;

public class StudentMainTest2 {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		// 1. ������� ���� �༭ ȭ�鿡 ����غ�����
		student1.name = "�ﵹ��";
		student1.grade = 100;
		student1.height = 175;
		student1.weight = 80;
		
		System.out.println(student1.name);
		System.out.println(student1.grade);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println("===============");
		
		Student student2 = new Student();
		// 1. ������� ���� �༭ ȭ�鿡 ����غ�����
		student2.name = "�Ա���";
		student2.grade = 95;
		student2.height = 185;
		student2.weight = 70;
		
		System.out.println(student2.name);
		System.out.println(student2.grade);
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println("===============");
		
		
	} // end of main
	
} // end of class
