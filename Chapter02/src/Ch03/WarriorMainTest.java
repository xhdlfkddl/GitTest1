package Ch03;

public class WarriorMainTest {
	public static void main(String[] args) {
		// ���� �ڵ带 ��������ּ���
		
		Warrior w1 = new Warrior();
		w1.name = "ȫ�浿";
		w1.age = 24;
		w1.height = 175;
		w1.weight = 70;
		
		w1.callName();
		w1.howOld();
		w1.BMI();
		
	} // end of main
	
} //end of class
