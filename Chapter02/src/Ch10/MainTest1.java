package Ch10;

public class MainTest1 {
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("������");
		Zealot zealot2 = new Zealot("������");

		Marine marine1 = new Marine("�踶��");
		Marine marine2 = new Marine("�ڸ���");

		Zergling zergling1 = new Zergling("������");
		Zergling zergling2 = new Zergling("������");
		
		//zealot1.showInfo();
		//marine1.showInfo();
		//zergling1.showInfo();
		/*
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		marine1.showInfo();
		zealot1.attackMarine(marine1);
		marine1.showInfo();
		*/
		zealot1.attack(marine1);
		zealot1.attack(zergling1);
		
		zergling1.attack(zealot1);
		zergling1.attack(marine1);
		
		marine1.attack(zealot1);
		marine1.attack(zergling1);
		
		
		
	} // end of main
	
} // end of class
