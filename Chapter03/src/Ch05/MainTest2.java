package Ch05;

import java.util.Scanner;

public class MainTest2 {
	
	public static void main(String[] args) {
		
		//�������, �ʱ�ȭ
		final int BANANA = 1;
		final int PEACH = 2;
		
		// ����ڰ� �Է��� 1/2�� �޾Ƽ� �ش��ϴ� ��ü�� ������ ȭ�鿡 ������ּ���
		System.out.println("�ٳ���: 1 , ������: 2");

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
		
		// ����ڰ� �Է��� ���� ���� �ν��Ͻ��� ���� �ٲ��� �� �ִ�.
	
	}
}
