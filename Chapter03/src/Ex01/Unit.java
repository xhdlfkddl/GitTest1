package Ex01;

// new Ű���带 ����Ͽ� �޸𸮿� �ø� �� ����. Ÿ�����θ� ���
public abstract class Unit {
	
	 protected int power;
	 protected int hp;
	 protected String name;
	
	public void showInfo() {
		System.out.println("====����â====");
		System.out.println("�̸�: " + this.name);
		System.out.println("���ݷ�: " + this.power);
		System.out.println("ü��: " + this.hp);
		System.out.println("===========");
		System.out.println();
	}
	
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "���");
			this.hp = 0;
		}
	}
	
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(name + "��" + targetName +"�� �����߽��ϴ�.");
		unit.beAttacked(this.power);
	}
	
	private String getName() {
		return this.name;
	}

	public void attack() {
		
	}
	
}
