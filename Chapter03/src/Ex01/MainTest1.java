package Ex01;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
	
		
//		zealot.showInfo();
//		marine.showInfo();
//		zergling.showInfo();
		
//		marine.showInfo();
//		zergling.showInfo();
		
		System.out.println("1.������ ������ ����");
		System.out.println("2.������ ���۸��� ����");
		System.out.println("3.���۸��� ������ ����");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		Zealot zealot= new Zealot("����");
		Marine marine = new Marine("����");
		Zergling zergling = new Zergling("���۸�");
		
		if (input == 1) {
			zealot.attack(marine);
			marine.showInfo();
		} else if (input == 2) {
			marine.attack(zergling);
			zergling.showInfo();
		} else if (input == 3) {
			zergling.attack(zealot);
			zealot.showInfo();
		}
		
		
	}//end of main
	
}//end of class
