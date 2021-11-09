package Ch08;

public abstract class Car {
	
	//추상메서드
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	// 후크(hook) 메서드
	// 필요하면 쓰세용 하는 공란 메서드
	public void washCar() {
		
	}
	
	// 핵심!!
	// 하위클래스에서 재정의 할 수 없게 해야함. -> final
	// 재정의 받은 것들을 알아서 찾아서 실행시킬 것!!
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
	//일반메서드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
}
