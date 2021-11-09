package Ch09;

// 인터페이스를 구현하는 방법
// implements 하게되면 강제성이 생김 = 추상메서드를 사용해야한다는 강제성
public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {
	
	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다");
		
	}

	@Override
	public void notification() {
		System.out.println("문이 열렸또로롱..");
	}
	
	
	
}
