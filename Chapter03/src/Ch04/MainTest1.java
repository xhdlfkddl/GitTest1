package Ch04;

public class MainTest1 {
	public static void main(String[] args) {
		
		Hero hero1 = new Hero("Hero1", 100);
		
		Warrior warrior1 = new Warrior("����", 100);
		Archer archer1 = new Archer("�ü�", 100);
		Wizard wizard1 = new Wizard("������", 50);
		
		// warrior Ŭ�������� �������, attack�̶�� �޼��尡 ������
		// hero Ŭ������ ��ӹް� �ֱ� ������ .name . hp .attack ����� �����ϴ�.
		String name = warrior1.name;
		int hp = warrior1.hp;
		warrior1.attack();
		// warrior Ŭ������ �ִ� �޼���
		warrior1.comboAttack();
		
		archer1.attack();
		archer1.fireArrow();
		
		wizard1.attack();
		wizard1.freezing();
		
	} //end of main
} //end of class
