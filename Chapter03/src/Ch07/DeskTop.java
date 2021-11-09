package Ch07;

// extends Computer를 하게되면 에러가 발생함
// DeskTop을 추상클래스로 만들던지
// Computer에 있던 추상메서드를 Override(재정의)하여 일반 메서드로 재정의 하던지
public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("화면이 표시됩니다.");
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타이핑합니다.");
	}

}
