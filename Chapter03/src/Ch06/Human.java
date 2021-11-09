package Ch06;

public class Human extends Animal {
	
	// Animal클래스에서 정의된 move 메서드를 재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}
