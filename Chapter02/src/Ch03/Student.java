package Ch03;

public class Student {

	// �޼���(method)
	// ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	// ��� �Լ�(member function)�̶�� ��
	// �޼��带 ���������ν� ��ü�� ����� ������
	
	// ��ü�� ���¸� ��Ÿ��
	// ��� ���� ����
	public int studentID;
	public String studentName;
	public String address;
	
	// �޼��� (��� ������ �̿��Ͽ� ��ü�� ����� ����� ��)
	// ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	// = ��� �Լ�(member function)
	// �޼��带 ���������μ� ��ü�� ����� �����˴ϴ�
	public void showStudentInfo() {
		System.out.println(studentName + ","  + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void takeTest() {
		System.out.println(studentName + " �л��� ������ ģ��.");
	}
	
	public void cleanUp() {
		System.out.println(studentName + " �л��� û�Ҹ� �Ѵ�");
	}
	

} // end of class
