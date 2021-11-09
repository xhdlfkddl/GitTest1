package Ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {
	
	MyPanel myPanel;
	
	// ������
	public MyFrame1() {
		initData();
		setInitLayout();
	}
	
	
	private void initData() {
		setTitle("java 2D Test");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = new MyPanel();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(myPanel);
	}
	
	// ����Ŭ���� - Ŭ���� ���� Ŭ����  static (���� ���� Ŭ����) / �ν��Ͻ� (���� Ŭ����)
	static class MyPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			/*
			g.drawString("�ȳ��ϼ���", 10, 20);
			g.drawLine(20, 30, 100, 100); // ���� �ߴ´�, x��, y��
			g.drawRect(100, 100, 150, 150); // x, y, �簢���� ����, �簢���� ����
			*/
			
			g.drawLine(300, 100, 200, 200);
			g.drawRect(200, 200, 200, 200);
			g.drawLine(300, 100, 400, 200);
			
		}
	}
	
	
	public static void main(String[] args) {
		new MyFrame1();
	}
	
}
