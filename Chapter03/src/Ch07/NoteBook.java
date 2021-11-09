package Ch07;

// 두 메서드 중 하나만 일반 메서드로 재정의 하였기 때문에 추상 메서드가 포함된 클래스
// 때문에 해당 클래스는 추상 클래스가 되어야함.
public abstract class NoteBook extends Computer { 
	
	@Override
	public void typing() {
		System.out.println("노트북 키보드로 타이핑을 칩니다.");
	}
	
}
