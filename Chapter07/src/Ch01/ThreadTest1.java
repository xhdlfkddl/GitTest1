package Ch01;

public class ThreadTest1 {
	
	
	//�����Լ� <- ���ξ�����
	public static void main(String[] args) {
		// �ϳ��� ���μ����� �ϳ� �̻��� thread�� ������ �ǰ�, ���� �۾��� �����ϴ� ������ thread�̴�.
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}// end of for
		
	}//end of main
	
}// end of class
