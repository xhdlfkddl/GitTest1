package Ex1;

import java.util.Random;

public class Warrior {
	// �������
	//hp, power, name ��
	private int helth;
	private int power;
	private int mp;
	private int potion;
	
	String name;

	// �����ڵ� ���� ��
	public Warrior(int helth, int power, String name) {
		super();
		this.helth = helth;
		this.power = power;
		this.name = name;
	}
	
	
	// �ż���
	// �����縦 �����Ѵ�
	public void attack(Wizard w) {
		System.out.println( name +"���簡 " + w.name + "�����縦 ������ �Ͽ����ϴ�.");
	}
	
	public static void main(String[] args) {
		returnRandom();
	}
	
	public static void returnRandom() {
		
		Random random = new Random();
		int number = random.nextInt(21);
		System.out.println(number);
		
	}
	
	// ����â�� �ٸ缭 �� �� �ִ� ����� ���� ��
}
