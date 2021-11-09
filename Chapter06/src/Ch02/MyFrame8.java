package Ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame8 extends JFrame{
	
	MyImagePanel imagePanel;
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	
	int xPoint = 200;
	int yPoint = 200;
	
	public MyFrame8() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�̹��� ��׶��� ����2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.png"));
		} catch ( Exception e) {
			System.err.println("������ �����ϴ�.");
			// ���α׷� ���� �޼ҵ�
			System.exit(0);
		}
		
		imagePanel = new MyImagePanel();
	}
	
	private void setInitLayout() {
		this.setVisible(true);
		// ���콺�� âũ�� �����Ұ�
		this.setResizable(false);
		this.add(imagePanel);
	}
	
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				if (keyCode == KeyEvent.VK_UP) {
					//yPoint -= 10;
					// ���� ������(���ǽ�) ? "���1" : "���2" 
					yPoint = (yPoint<0) ? 0 : yPoint -10;
				} else if(keyCode == KeyEvent.VK_DOWN) {
					yPoint = (yPoint>381) ? 380 : yPoint +10;
					//yPoint += 10;
					//if (yPoint > 381) {
					//	yPoint = 380;
					//}
				} else if(keyCode == KeyEvent.VK_LEFT) {
					xPoint = (xPoint<0) ? -10 : xPoint -10;
					//xPoint -= 10;
					//if (xPoint < 0) {
					//	xPoint = -10;
					//}
				} else if(keyCode == KeyEvent.VK_RIGHT) {
					xPoint = (xPoint>421) ? 420 : xPoint +10;
					//xPoint += 10;
					//if (xPoint > 421) {
					//	xPoint = 420;
					//}
				}
				
				repaint();
				
			} // end of keyPressed
			
		});
	}
	
	// ����Ŭ���� ����
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// (�����̸�, �׸��� �׸��� ������ x��, y��, ��������ũ��, ��������ũ��, 0)
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon1, xPoint, yPoint, 80, 80, null);
		}
	}
	
	
} // end of class
