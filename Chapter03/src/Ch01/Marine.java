package Ch01;

public class Marine {
	
	private int power;
	private int hp;
	private String name;
	
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}
	
	public void showInfo() {
			System.out.println("====����â====");
			System.out.println("�̸�: " + this.name);
			System.out.println("���ݷ�: " + this.power);
			System.out.println("ü��: " + this.hp);
			System.out.println("===========");
			System.out.println();
	}
	
	// ���ݴ���
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�");
			this.hp = 0;
		}
	}

/*	
	// 1. ������ ������ ����
	public void attackZealot(Zealot zealot)	{
		String targetName = zealot.getName();
		System.out.println(name + "��(��)" + targetName +"�� �����߽��ϴ�.");
		zealot.beAttacked(this.power);
	}
	
	// 2. ������ ���۸��� ����
	public void attackZergling(Zergling zergling)	{
		String targetName = zergling.getName();
		System.out.println(name + "��(��)" + targetName +"�� �����߽��ϴ�.");
		zergling.beAttacked(this.power);
	}
*/	
	
	// getter
	public String getName() {
		return this.name;
	}
	

	// �޼��� �����ε��� ����غ��ô�.
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "��(��)" + targetName +"�� �����߽��ϴ�.");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "��(��)" + targetName +"�� �����߽��ϴ�.");
		zergling.beAttacked(this.power);
	}

	
}
