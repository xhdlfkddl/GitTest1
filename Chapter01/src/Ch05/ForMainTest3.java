package Ch05;

public class ForMainTest3 {
	public static void main(String[] args) {
		
		
		// 1���� 9���� �ݺ�
		for(int i = 1; i <=9; i++) {
			
			for(int j = 1; j <= 9; j++) {

			} // end of for2
			
		} // end of for1
		
		// 2�� for������ ������ 2~9�ܱ��� ���
		int num = 0;
		
		// ������� 1
		for(num = 2; num <=9; num++) {
			// ������� 2 
			// 2~9���� �ݺ���
			// num = 2�� �� ���·� �Ʒ��� for������ �Ѿ
			
			// �Ʒ��� for���� �Ϸ�Ǹ� num = 3�� �� ���·� for������ �Ѿ(�ݺ�) 
			for(int i = 1; i <= 9; i++) {
				// num = 2�� ���¸� ������ i�� 1~9���� �ݺ���
				// ����� �Ϸ�Ǹ� �ٽ� ���� for������ �ö󰡰� ��
				System.out.println(num + " * "+ i +" = " + (num * i));
				
			} // end of for2
			
			// ������� 3
			System.out.println();
			
		} // end of for1
		
		
	} // end of main
	
} // end of class
