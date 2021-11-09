package Ch04;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {
	
	MyPanel myPanel;
	
	// 생성자
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
	
	// 내부클래스 - 클래스 안의 클래스  static (정적 내부 클래스) / 인스턴스 (내부 클래스)
	static class MyPanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			/*
			g.drawString("안녕하세요", 10, 20);
			g.drawLine(20, 30, 100, 100); // 선을 긋는다, x축, y축
			g.drawRect(100, 100, 150, 150); // x, y, 사각형의 가로, 사각형의 세로
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
