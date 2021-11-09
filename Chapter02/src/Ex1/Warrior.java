package Ex1;

import java.util.Random;

public class Warrior {
	// 멤버변수
	//hp, power, name 등
	private int helth;
	private int power;
	private int mp;
	private int potion;
	
	String name;

	// 생성자도 만들 것
	public Warrior(int helth, int power, String name) {
		super();
		this.helth = helth;
		this.power = power;
		this.name = name;
	}
	
	
	// 매서드
	// 마법사를 공격한다
	public void attack(Wizard w) {
		System.out.println( name +"전사가 " + w.name + "마법사를 공격을 하였습니다.");
	}
	
	public static void main(String[] args) {
		returnRandom();
	}
	
	public static void returnRandom() {
		
		Random random = new Random();
		int number = random.nextInt(21);
		System.out.println(number);
		
	}
	
	// 상태창을 꾸며서 볼 수 있는 기능을 만들 것
}
