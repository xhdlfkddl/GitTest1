package Ch11;

public class Company {
	/*
	 싱글톤 패턴이란?
	 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
	 static변수, 매서드를 활용하여 구현할 수 있음
	 */
	 
	// 1. 생성자를 private으로 만든다
	private Company() {
		
	}
	
	// 2. static 변수를 활용해서 내부에서 객체를 생성한다.
	// 변수 선언과 동시에 객체를 생성한 것
	private static Company instance = new Company();
	
	// 3. 외부에서 유일한 인스턴스를 참조할 수 있는 public method를 제공
	public static Company getInstance() {
		// 방어적코드
		return instance;
	}
	
	
	
	
}
