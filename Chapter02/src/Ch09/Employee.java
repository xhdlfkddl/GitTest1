package Ch09;

public class Employee {
	
	public static int seriaNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		seriaNum++;
		employeeId = seriaNum;
	}

	//getter
	public int getEmployeeId() {
		return employeeId;
	}

	// static �޼��� Ȱ��
	// ���������� ���ư�
	// new ��� ���� �̸� ��� ����
	// ��ü�� �����Ǳ� ���� ����� �� �ִ�.
	public static int getSeriaNum() {
		// ����: static �޼��� �ȿ����� ��������� ����� �� ����.
		// department = "������"; // Cannot make a static reference to the non-static field department
		//  why: ��ü�� ��������� ���� �����Ͽ� ����� �� �ִ� static�̱� �����Դϴ�.
		return seriaNum;
	}
	
	
	
	
}
