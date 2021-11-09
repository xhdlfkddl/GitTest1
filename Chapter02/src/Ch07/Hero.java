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
		// 방어적 코드 작성
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("잘못된 입력입니다. 다시 작성해주세요.");
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
	
	
	//main 함수
	public static void main(String[] args) {
		
		// Hero 객체 생성 후 getter, setter 메서드를 사용해주세요
		Hero hero = new Hero();
		
		// name
		hero.setName("New Hero");
		String heroName = hero.getName();
		System.out.println("히어로 이름: " +heroName);
		
		// hp
		hero.setHp(100);
		int heroHp = hero.getHp();
		System.out.println("히어로의 체력: " + heroHp);
		
		// level
		hero.setLevel(30);
		int heroLevel = hero.getLevel();
		System.out.println("히어로의 레벨: " + heroLevel);
		
		// defence
		hero.setDefence(70.5);
		double heroDefence = hero.getDefence();
		System.out.println("히어로의 방어력: " + heroDefence);
		
	} // end of main
	
} // end of class
