package Ch03;

import java.util.Scanner;

public class MainTest6 {
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		
		// ���� ������
		// ���� ������
		// ���ǽ��� ����� true �� ���� false�� ��쿡 ���� �ٸ� ����� �����
		// if (���ǹ�)�� ������ ǥ���� �� ��� ����
		
		// ������ 
		// ���ǽ� ? ���1 : ���2
		// ���ǽ��� ���̸� ���1, ���ǽ��� �����̸� ���2�� ���õ˴ϴ�.
		int num1 = ( 5 > 3 ) ? 10  : 20; // trre
		System.out.println(num1); // 10
		
		int num2 = ( 5 < 3 ) ? 10  : 20; // false
		System.out.println(num2); // 20
		
		//JDK�� ������� ������ �̿��� ���ô�.
		int max;
		System.out.println("�Է¹��� �� �� �� ū ���� ����ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Է� 1 : ");
		int x = scanner.nextInt();
		System.out.println("�Է� 2 : ");
		int y = scanner.nextInt();
		
		// ���׿����� ��
		max = ( x > y )? x : y;
		System.out.println("ū ���ڴ� : " + max + "�Դϴ�");
	
	
	} // end of main
} // end of class
