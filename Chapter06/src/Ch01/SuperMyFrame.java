package Ch01;

import javax.swing.JFrame;

public class SuperMyFrame extends JFrame{
	
	public SuperMyFrame() {
		
	}
	
	// private ���� protected�� ���� ���־�� ����� ���� Ŭ�������� ��밡��
	protected void initData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void setInitLayout() {
		setVisible(true);
	}
	
	protected void addEventListener() {
		
	}
	
}
