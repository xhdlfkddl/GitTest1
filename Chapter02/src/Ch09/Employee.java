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

	// static 메서드 활용
	// 독립직으로 돌아감
	// new 사용 전에 미리 사용 가능
	// 객체가 생성되기 전에 실행될 수 있다.
	public static int getSeriaNum() {
		// 주의: static 메서드 안에서는 멤버변수를 사용할 수 없다.
		// department = "개발팀"; // Cannot make a static reference to the non-static field department
		//  why: 객체가 만들어지기 전에 접근하여 사용할 수 있는 static이기 때문입니다.
		return seriaNum;
	}
	
	
	
	
}
