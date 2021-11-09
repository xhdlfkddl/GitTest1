package Ch03;

public class Warrior {
	
	String name;
	int age;
	int height;
	int weight;
	
	public void callName() {
		System.out.println("전사의 이름은 " + name + "입니다");
	}
	
	public void howOld() {
		System.out.println( name + " 전사의 나이는 " + age + "살 입니다.");
	}
	
	public double BMI() {
		double h = height * 0.01;
		System.out.println(h);
		
		double Bmi = weight / (h * h);
		System.out.println(name + " 전사의 BMI 수치는 " + Bmi + "입니다.");
		
		return Bmi;
	}
	
}
