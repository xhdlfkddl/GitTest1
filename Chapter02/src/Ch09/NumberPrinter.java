package Ch09;

public class NumberPrinter {
	/*
	 static

	 �������� ����ϴ� ������ �ʿ��� ���
	 ī�� ȸ�翡�� ī�带 ���� �߱��� ������ ���ο� ī�� ��ȣ�� �ο�
	 ȸ�翡 ����� �Ի��� ������ ���ο� ����� �ο�
	 ���࿡�� ���ǥ�� ���� ���(2�� �̻�)
	 
	 
	 */
	
	private int id;
	private static int waitNumber = 1;
	
	public NumberPrinter(int id) {
		this.id = id;
	}
	
	// ��ȣǥ�� ����ּ���
	public void printWaitNum() {
		System.out.println(id + "�� ����� ��� ������ " + waitNumber + "�� �Դϴ�.");
		waitNumber++;
	}
	
}
