package Ch09;

public class EmployeeMainTest {
	public static void main(String[] args) {
		
		int temp = Employee.getSeriaNum(); // static �޼���
		System.out.println(temp);
		
		// Employee test1 = new Employee();
		//	test1.getEmployeeId(); // �Ϲ� �޼��� (�ʱ�ȭ�� ���־�� �� = �޸𸮿� �����ؾ���)
		
		Employee employee1 = new Employee();
		System.out.println(employee1.seriaNum);
		System.out.println(employee1.getEmployeeId());

		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();

		System.out.println(employee5.getEmployeeId());

		System.out.println(employee2.seriaNum);
		System.out.println(employee3.seriaNum);
		System.out.println(employee4.seriaNum);
		System.out.println(employee5.seriaNum);
		
		// static ����, �������, �������� --> �޸� ��ġ Ȯ��
		
		// employee1~5���� �ν��Ͻ� ������ �����Ͽ� getSeriaNum()����
		employee1.getSeriaNum();
		employee2.getSeriaNum();
		employee3.getSeriaNum();
		employee4.getSeriaNum();
		employee5.getSeriaNum();
		
		// Ŭ���� �̸����� �����Ͽ� getSeriaNum() �޼��带 ���
		Employee.getSeriaNum();
		
	} // end of main

} // end of class
