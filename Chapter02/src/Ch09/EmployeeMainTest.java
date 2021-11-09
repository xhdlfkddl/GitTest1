package Ch09;

public class EmployeeMainTest {
	public static void main(String[] args) {
		
		int temp = Employee.getSeriaNum(); // static 메서드
		System.out.println(temp);
		
		// Employee test1 = new Employee();
		//	test1.getEmployeeId(); // 일반 메서드 (초기화를 해주어야 함 = 메모리에 존재해야함)
		
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
		
		// static 변수, 멤버변수, 지역변수 --> 메모리 위치 확인
		
		// employee1~5까지 인스턴스 변수로 접근하여 getSeriaNum()실행
		employee1.getSeriaNum();
		employee2.getSeriaNum();
		employee3.getSeriaNum();
		employee4.getSeriaNum();
		employee5.getSeriaNum();
		
		// 클래스 이름으로 접근하여 getSeriaNum() 메서드를 사용
		Employee.getSeriaNum();
		
	} // end of main

} // end of class
