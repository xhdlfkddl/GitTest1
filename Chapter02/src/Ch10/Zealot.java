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
	// ���� -> ������ ������ ����
	// �ٸ� ��ü�� ��ȣ�ۿ� - �޼���� �������� ����
	public void attackMarine(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "��(��)" + targetName +"�� �����߽��ϴ�.");
		marine.beAttacked(this.power);
	}

	// ���� -> ������ ���۸��� ����
	public void attackZergling(Zergling zergling) {
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
	// �̸��� ���ٰ� �ϴ��� �����Ϸ��� �Ű������� ���� ������ �� �ִ�.
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "��(��)" + targetName +"�� �����߽��ϴ�.");
		marine.beAttacked(this.power);
	}

	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "��(��)" + targetName +"�� �����߽��ϴ�.");
		zergling.beAttacked(this.power);
	}

}
