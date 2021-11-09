package Ex01;

// new 키워드를 사용하여 메모리에 올릴 수 없다. 타입으로만 사용
public abstract class Unit {
	
	 protected int power;
	 protected int hp;
	 protected String name;
	
	public void showInfo() {
		System.out.println("====정보창====");
		System.out.println("이름: " + this.name);
		System.out.println("공격력: " + this.power);
		System.out.println("체력: " + this.hp);
		System.out.println("===========");
		System.out.println();
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "사망");
			this.hp = 0;
		}
	}
	
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(name + "이" + targetName +"을 공격했습니다.");
		unit.beAttacked(this.power);
	}
	
	private String getName() {
		return this.name;
	}

	public void attack() {
		
	}
	
}
