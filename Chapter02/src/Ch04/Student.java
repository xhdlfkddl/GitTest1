package Ch04;

public class Student {
	
	// ������ - constructor
	// ��ü�� ������ �� ������ ���� ������� ������� �����ϴ� �� (�������� �ο���)
	
	
	// �������
	int number;
	String name;
	int grade;

	// �⺻������ (default constructor)
	// ����� ���� �����ڰ� ���� ��� �����Ϸ��� �˾Ƽ� �⺻�����ڸ� ����� ��
	public Student() {
		
	}
	
	// ������ ����� (�����ڰ� ���� ���� -> ����� ���� ������)
	// ��ȣ�ȿ� �Ű������� �־��� �� ����
	public Student(int num, String name, int grade) {
		number = num;
		// �Ű����� �̸��� ��� ���� �̸��� ���Ƹ� this. Ű���带 ����Ͽ� �������־����
		// this = �ڱ��ڽ�
		// �Ű����� name�� ���ͼ� ��������� name�� ������ ��
		this.name = name;
		this.grade = grade;
	}
	
	// �ż��� ����
	public void showInfo() {
		System.out.println(
				name + "�л��� �й��� " + number + "�Դϴ�."
				// "\n" = �ٹٲ�
						+"\n�г��� "+ grade + "�г��Դϴ�." );
	}
	
}
