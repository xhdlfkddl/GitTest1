package Ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	
	public MyFrame() {
		setTitle("ù��° GUI ���α׷� �ۼ�");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*
	 flowlayout - ���ʿ��� ���������� ��ġ ������ ������ ���ٸ� �Ʒ������� ��ġ
	 borderlayout
	 gridlayout
	 cardlayout
	 null
	 */
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
}
