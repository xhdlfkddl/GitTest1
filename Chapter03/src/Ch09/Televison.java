package Ch09;

// 다형성 개념이 적용됨
public class Televison extends HomeAppliances implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

}
