package Ch01;

public class ArrayMainTest2 {
	
	public static void main(String[] args) {
		//������ �����͸� ������ ��Ƽ� �����ϱ� ���Ѱ�
		int[] nums = new int[12];
		
		// ������ ���� �� �ִ� �迭�� 12ĭ ������ּ���.
		Zealot[] zealots = new Zealot[12];
		
		// ����
		Marine[] marines = new Marine[12];
		
		// ���۸�
		Zergling[] zerglings = new Zergling[12];
		
		// for���� �̿��� ��������
		for(int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("����" + (i+1));
		} // end of for
		
		// 1. ��������
		for(int i = 0; i < marines.length; i++) {
			marines[i] = new Marine("����" + (i+1));
		}
		
		// 2. ��������
		for(int i = 0; i < zerglings.length; i++) {
			zerglings[i] = new Zergling("���۸�" + (i+1));
		}
		
		// 3. ���� 12������ ������ ������ּ���
		for(int i = 0; i < zealots.length; i++) {
			zealots[i].showInfo();
		}
		
		
		
		
	}//end of main
}//end of class
