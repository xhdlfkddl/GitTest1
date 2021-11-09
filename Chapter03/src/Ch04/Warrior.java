package Ch04;

public class Warrior extends Hero {
	
	// 기본 생성자가 아닌 사용자 지정 생성자를 만들어 놓았기 때문에
	// 자식 클래스에서도 지정해주어야함
	public Warrior(String name, int hp) {
		super(name, hp);	// = Hero(String name, int hp)
	}
	
	public void comboAttack() {
		System.out.println("comboAttack!!");
	}
	
}
