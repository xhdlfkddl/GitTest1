package Ch05;

import java.util.Scanner;

public class MainTest2 {
	
	public static void main(String[] args) {
		
		//상수선언, 초기화
		final int BANANA = 1;
		final int PEACH = 2;
		
		// 사용자가 입력한 1/2를 받아서 해당하는 객체의 정보를 화면에 출력해주세요
		System.out.println("바나나: 1 , 복숭아: 2");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		Fruit fruit;
		
		if (input == BANANA) {
			fruit = new Banana();
		} 
		else {
			fruit = new Peach();
		}
		fruit.showInfo();
		
		// 사용자가 입력한 값에 따라서 인스턴스를 쉽게 바꿔줄 수 있다.
	
	}
}
