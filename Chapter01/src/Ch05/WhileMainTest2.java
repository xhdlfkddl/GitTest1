package Ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	public static void main(String[] args) {
		
		System.out.println("������ �Է����ּ���: ");
		Scanner scanner = new Scanner(System.in);
		
		// ����� ��� ���� ��ĳ�ʸ� ����Ͽ� �ڵ带 �����غ�����
		final int LIMIT_VALUE = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE) {
			sum = sum + num;
			num++;
		} // end of while
		
		System.out.println("��� ��: " + sum);
		
	} // end of main
} // end of class
