package Ch10;

public class Zealot {

	private int power;
	private int hp;
	private String name;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("====정보창====");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("체력: " + this.hp);
		System.out.println("===========");
		System.out.println();
	}

	// 공격당함
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다");
			this.hp = 0;
		}
	}

/*	
	// 공격 -> 질럿이 마린을 공격
	// 다른 객체와 상호작용 - 메서드로 참조변수 전달
	public void attackMarine(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "이(가)" + targetName +"을 공격했습니다.");
		marine.beAttacked(this.power);
	}

	// 공격 -> 질럿이 저글링을 공격
	public void attackZergling(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "이(가)" + targetName +"을 공격했습니다.");
		zergling.beAttacked(this.power);
	}
*/
	// getter
	public String getName() {
		return this.name;
	}
	
	
	// 메서드 오버로딩을 사용해봅시다.
	// 이름이 같다고 하더라도 컴파일러는 매개변수를 통해 구별할 수 있다.
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "이(가)" + targetName +"을 공격했습니다.");
		marine.beAttacked(this.power);
	}

	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "이(가)" + targetName +"을 공격했습니다.");
		zergling.beAttacked(this.power);
	}

}
