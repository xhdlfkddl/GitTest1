package Ch04;

public class Warrior extends Hero {
	
	// �⺻ �����ڰ� �ƴ� ����� ���� �����ڸ� ����� ���ұ� ������
	// �ڽ� Ŭ���������� �������־����
	public Warrior(String name, int hp) {
		super(name, hp);	// = Hero(String name, int hp)
	}
	
	public void comboAttack() {
		System.out.println("comboAttack!!");
	}
	
}
