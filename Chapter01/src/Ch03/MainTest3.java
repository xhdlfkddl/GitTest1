package Ch03;

public class MainTest3 {

	// ���� �޼ҵ�
	public static void main(String[] args) {

		// ����, ���� ������
		// ���׿�����
		// ������ ���� 1 ���ϰų� 1 �� �� ���
		// ����(statement)�� ��(;)�� �������� ���� ������ �����ؾ���

		// ++ ���� ���� 1�� ���մϴ�
		int num1 = 1;
		num1++;
		System.out.println(num1); // 2
		
		// -- ���� ���� 1�� ���ϴ�
		int num2 = 1;
		num2--;
		System.out.println(num2); // 0
		
		// �����ڰ� ���� �տ� �ִ°�, �ڿ� �ִ°��� ���� ���� ������ ����� �޶���
		// 1. ���� �����ڰ� �ڿ� �� ���
		int num3 = 10;
		int num4;
		
		// num3�� ���� num4�� ������ �� num3�� ���� ++ ��
//		num4 = num3++;
//		System.out.println(num4); // 10
//		System.out.println(num3); // 11
		
		// num3�� ���� ++ ���� �� num4�� ���� ����
		num4 = ++num3;
		System.out.println(num4); // 11
		System.out.println(num3); // 11
		
		// ����
		int num5 = 100;
		int num6;
		// 1. num5�� num6 ������ ����ּ���
		// �� ���� �����ڸ� ����Ͽ� num6 ������ 101�� ���� ���
		num6 = ++num5;
		System.out.println(num6);
		
		// 2. num5�� num6 ������ ����ּ���
		// �� ���� �����ڸ� ����Ͽ� num6 ������ 101�� ���� ���
		num6 = num5++;
		System.out.println(num6);
		System.out.println(num5); // 102
		
		// ��� : ���� �����ڴ� ����(����)�� �ִ� ���� 1 ������Ų��.
		// ��, �տ� ���� ���� �ڿ� ���� ���� ������ ������ �ٸ���.
	} // end of main
} // end of class
