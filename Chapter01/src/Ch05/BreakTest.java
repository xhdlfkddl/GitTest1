package Ch05;

public class BreakTest {
	public static void main(String[] args) {
		
		// ����� break;
		// �߰��� ���ߴ� break
		
		for(int i = 1; i < 11; i++) {
			
			System.out.println(i);
			
			// ���� for������ ��� ��
			// ���� ����� for���� break �ϰ� ��
			
			// 7�� �������� �� ������ ������ ����� 0�̸� break
			if(( i % 7 ) == 0) {
				break;
			}
			
		} //end of for
		
		
	} // end of main
	
} // end of class
