package Ch07;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		// new 안됨
		// 추상클래스를 사용하는 이유
		// Computer 클래스를 상속받아 사용할 때 
		// display와 typing이라는 메서드를 이용해야 상속이 가능하다라고 조건
		Computer computer = new DeskTop();
		computer.turnOn();
		computer.display();
		computer.turnOff();
		
		System.out.println("------------------------------");
		
		NoteBook noteBook = new MyNoteBook();
		noteBook.turnOn();
		noteBook.display();
		noteBook.turnOff();
	}
	
}
