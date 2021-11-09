package Ch06;

public class AnimalMainTest {
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		// 멤버변수는 부모클래스부터 살펴보고
		// 메서드는 자식클래스부터 살펴보게 됨
		// human 클래스에서 move 메서드를 주석처리한 뒤 실행하게 되면
		// animal 클래스에서 작성한 move 메서드가 실행됨
		hAnimal.move();
		System.out.println("----------------------");
		tAnimal.move();
		
	}
}
