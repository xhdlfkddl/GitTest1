package Ch05;

import java.util.Scanner;

public class ContinueTest {
	public static void main(String[] args) {
	
		// ����� continue
		// �����ϰ� �����ϴ� continue
		
		// ��ĳ�ʸ� �̿��Ͽ� MAX��, MULTIPLE���� �޾Ƽ� ���
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("MAX ��: ");
		final int MAX = scanner.nextInt();

		System.out.println("��� ��: ");
		final int MULTIPLE = scanner.nextInt();
		
		int num;
		int count = 0;
		
		for(num = 1; num < MAX; num++) {
			
			// 3�� ������ ������� ������
			if(num % MULTIPLE == 0) {
				// break�ʹ� �޸� ���߰� �ؿ� �ִ� ����� ����Ǵ� ���� �ƴ϶�
				// �ٽ� for������ ���ư��� ���� �ݺ��ϰ� ��
				count++;
				continue;
				
			} // end of if
			
		} // end of for
		//System.out.println("��� ��: " + num);
		System.out.println( MULTIPLE + "�� ����� ����: " + count);
		
		
	} // end of main
	
} // end of class
