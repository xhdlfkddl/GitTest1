package Ch05;

public class ForMainTest{
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		
		// for ��
		// for(�ʱ�ȭ��; ���ǽ�; ������;) {���๮}
		
		// for���� �̿��ؼ� 1���� 10���� ����, ����
		// ���꿡 ���� ����� ���ؼ� ������ �ʿ��ϴ�
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			// ���� ���� ������
//			sum = sum + i;
			sum += i;
			
			System.out.println("i�� ���簪: " + i);
			System.out.println("sum�� ���簪: " + sum);
			
		} // end of for
		
		System.out.println("sum: " + sum);
		
		
	} // end of main
	
} // end of class
