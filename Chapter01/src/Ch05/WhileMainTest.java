package Ch05;

public class WhileMainTest {
	
	// ����Ŭ����
	public static void main(String[] args) {
		
		// while��
		// �־��� ���ǿ� �´� ����(true �� ����) ������ ���๮�� �ݺ������� �����ϴ� ���
		// ������ ���� ������ �ݺ��ϴ� ������ ���߰� ��
		// ������ �ַ� �ݺ� Ƚ���� ���� ���� ����� ���� true,false�� �Ǵ��ϰ� ��
		
		// 1~10���� ���� ����
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			// ���ǹ��� ���� �� ���
			System.out.println("���� ��: " + num);
			sum += num;
			// ����� �Ϸ�� �� num�� ���� 1�� ������Ų �� while�� ���ǹ��� �ٽ� �Ǵ�(�ݺ�)
			num++;
			
			// 0.5�ʸ��� �ݺ�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} // end of while
		
		System.out.println("������ ��� ����: " + sum + " �Դϴ�.");
	
		
		
		
		
	} // end of main
	
} // end of class
