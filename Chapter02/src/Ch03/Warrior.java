package Ch03;

public class Warrior {
	
	String name;
	int age;
	int height;
	int weight;
	
	public void callName() {
		System.out.println("������ �̸��� " + name + "�Դϴ�");
	}
	
	public void howOld() {
		System.out.println( name + " ������ ���̴� " + age + "�� �Դϴ�.");
	}
	
	public double BMI() {
		double h = height * 0.01;
		System.out.println(h);
		
		double Bmi = weight / (h * h);
		System.out.println(name + " ������ BMI ��ġ�� " + Bmi + "�Դϴ�.");
		
		return Bmi;
	}
	
}
