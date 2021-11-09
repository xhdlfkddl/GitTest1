package Ch09;

public interface RemoteController {
	
	/*
	 인터페이스
	 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	 멤버변수, 일반 메서드를 가질 수 없고 오직 추상메서드와 상수만을 멤버변수로 가질 수 있다.
	 추상클래스 보다 추상화가 더 높다
	 인터페이스는 표쥰, 약속, 규칙임
	 모든 메서드가 추상 메서드로 선언 public abstract
	 모든 변수는 상수로 서언됨 public static final
	 
	 사용방법
	 class 대신 Interface라는 키워드를 사용
	 class와 같이 public이나 default를 사용할 수 있다.
	 
	 제약사항
	 모든 멤버변수는 public static final이어야 한다.
	 모든 메서드는 추상 클래스이어야 하고, public abstract 키워드 생략가능
	*/
	
	public static final int SERIAL_NUMBER= 1000; //상수
	// 추상메서드 = 기능적인 요소를 만들기 위해
	public abstract void turnOn();
	void turnOff(); // = public abstract void turnOff();
	
}
