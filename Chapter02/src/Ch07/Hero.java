package Ch07;

public class Hero {
	
	private String name;
	private int hp;
	private int level;
	private double defence;
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}

	public int getLevel() {
		return this.level;
	}

	public double getDefence() {
		return this.defence;
	}
	
	// setter
	public void setName(String name) {
		// ����� �ڵ� �ۼ�
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �ۼ����ּ���.");
		} else {
			this.name = name;
		}
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setDefence(double defence) {
		this.defence = defence;
	}
	
	
	//main �Լ�
	public static void main(String[] args) {
		
		// Hero ��ü ���� �� getter, setter �޼��带 ������ּ���
		Hero hero = new Hero();
		
		// name
		hero.setName("New Hero");
		String heroName = hero.getName();
		System.out.println("����� �̸�: " +heroName);
		
		// hp
		hero.setHp(100);
		int heroHp = hero.getHp();
		System.out.println("������� ü��: " + heroHp);
		
		// level
		hero.setLevel(30);
		int heroLevel = hero.getLevel();
		System.out.println("������� ����: " + heroLevel);
		
		// defence
		hero.setDefence(70.5);
		double heroDefence = hero.getDefence();
		System.out.println("������� ����: " + heroDefence);
		
	} // end of main
	
} // end of class
