package Ch07;

// 추상메서드를 선언했기때문
public abstract class Computer {
	
	/*
	추상 클래스란 
	구현 코드 없이 메서드의 선언만 있는 추상메서드를 포함한 클래스 
	메서드의 선언: 반환타입, 메서드 이름, 매개변수로 구성
	메서드 정의: 메서드 구현과 동일한 의미 구현부를 가짐({})
	
	int add(intx, int y); 선언
	int add(int x, int y){} 구현부가 있음 -> 추상메서드가 아님
	abstract 예약어를 사용
	추상 클래스는 new 할 수 없음(인스턴스화 할 수 없음)
	*/
	
	// 추상 메서드
	// 선언부
	// 추상메서드를 선언하면 클래스도 추상클래스로 바꿔줘야함 
	public abstract void display(); // body(중괄호)가 없음
	public abstract void typing();
	
	// 일반 메서드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
