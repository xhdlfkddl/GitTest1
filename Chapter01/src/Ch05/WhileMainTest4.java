package Ch05;

import java.util.Scanner;

public class WhileMainTest4 {
	public static void main(String[] args) {

		// ����ڰ� 0�� �Է��ϸ� ���α׷��� �����Ű����
		// ����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ����

		// do while �� ���
		// scaaner�� ���, ������� �Է� ���� �޾� ���������� �غ�����
		// �ݺ��� ���� �� ����� ȭ�鿡 ����ϴ� ���α׷��� ��������


			Scanner scanner = new Scanner(System.in);

			int num;
			int sum = 0;
			do {
				System.out.println("���� ������ �ϰ��� �ϴ� ������ �Է����ּ���");
				num = scanner.nextInt();
				sum += num;

			} while (num != 0);

			System.out.println("������ �����: " + sum + " �Դϴ�.");		
			
 /*
			for(int i = 0; i < 3; i++) {
				System.out.println("���� ������ �ϰ��� �ϴ� ������ �Է����ּ���");
				num = scanner.nextInt();
				sum += num;
			}
			System.out.println("������ �����: " + sum + " �Դϴ�.");
  */

			
			
			
	} // end of main
} // end of class
