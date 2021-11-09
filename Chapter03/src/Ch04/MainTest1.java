package Ch04;

public class MainTest1 {
	public static void main(String[] args) {
		
		Hero hero1 = new Hero("Hero1", 100);
		
		Warrior warrior1 = new Warrior("전사", 100);
		Archer archer1 = new Archer("궁수", 100);
		Wizard wizard1 = new Wizard("마법사", 50);
		
		// warrior 클래스에는 멤버변수, attack이라는 메서드가 없지만
		// hero 클래스를 상속받고 있기 때문에 .name . hp .attack 사용이 가능하다.
		String name = warrior1.name;
		int hp = warrior1.hp;
		warrior1.attack();
		// warrior 클래스에 있는 메서드
		warrior1.comboAttack();
		
		archer1.attack();
		archer1.fireArrow();
		
		wizard1.attack();
		wizard1.freezing();
		
	} //end of main
} //end of class
