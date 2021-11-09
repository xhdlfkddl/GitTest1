package Ex01;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
	
		
//		zealot.showInfo();
//		marine.showInfo();
//		zergling.showInfo();
		
//		marine.showInfo();
//		zergling.showInfo();
		
		System.out.println("1.질럿이 마린을 공격");
		System.out.println("2.마린이 저글링을 공격");
		System.out.println("3.저글링이 질럿을 공격");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		Zealot zealot= new Zealot("질럿");
		Marine marine = new Marine("마린");
		Zergling zergling = new Zergling("저글링");
		
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
