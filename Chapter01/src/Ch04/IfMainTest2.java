package Ch04;

import java.util.Scanner;

public class IfMainTest2 {
	
	// ���θ޼ҵ�
	public static void main(String[] args) {
		
		System.out.println("������ �Է����ּ���: ");
		
		Scanner scanner = new Scanner(System.in);
		
		// ���� �Է��� ������
		int point = scanner.nextInt();
		char result ='Z';
		
		// ���� 1. if���� ����Ͽ� ������ ������ּ���.
		// 100 ~ 91�� = A
		// 90 ~ 81�� = B
		// 80 ~ 71�� = C
		// 70 ~ 61�� = D
		// 60 ~ 0�� = F
		
		if (point <= 100 && point >= 90 ) {
			result = 'A';
		} else if (point <=90 && point >= 80) {
			result = 'B';
		} else if (point <=80 && point >= 70) {
			result = 'C';
		} else if (point <= 70 && point >= 60) {
			result = 'D';
		} else if (point < 60 && point >= 0) {
			result = 'F';
		}
		
		if (result != 'Z') {
			System.out.println("����� ������: " + result + "�Դϴ�");
		} else {
			System.out.println("�߸��� �Է��Դϴ�");
		}
		
	} // end of main
} //end of class
