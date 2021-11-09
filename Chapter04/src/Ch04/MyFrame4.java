package Ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame4 extends JFrame {
	
	private final int ICON_COUNT = 4;
	private ArrayList<BufferedImage> imgList = new ArrayList<BufferedImage>();
	 
	// ���������� ���� ���� ������ �������� ���� ���۵� �̹����� ���
	// �ߺ��ؼ� ����� ���� ���۵� �̹����� ����ϴ� ���� ����
	BufferedImage backgroundImage;

	BufferedImage imageIcon;
	// 3�� �̻� �����
	BufferedImage imageIcon2;
	BufferedImage imageIcon3;
	BufferedImage imageIcon4;
	// �ݺ����� �κ��� ���̸� �迭, ArrayList ���
	
	
	MyImagePanel myImagePanel;
	
	// ������
	public MyFrame4() {
		initData();
		setInintLayout();
	}
	//initData
	private void initData() {
		setTitle("�̹��� ��׶��� ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			//�������ִ� ����
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			imageIcon2 = ImageIO.read(new File("among2.png"));
			imageIcon3 = ImageIO.read(new File("among1.png"));
			imageIcon4 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		
		// MyImagePanel
		myImagePanel = new MyImagePanel();
	}
	
	//
	private void setInintLayout() {
		setVisible(true);
		add(myImagePanel);
	}
	
	private class MyImagePanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 80, 80, null);
			g.drawImage(imageIcon2, 100, 100, 80, 80, null);
			g.drawImage(imageIcon3, 300, 300, 80, 80, null);
			g.drawImage(imageIcon4, 400, 400, 80, 80, null);
		}
	} // end of inner class
	
	// �����Լ�
	public static void main(String[] args) {
		new MyFrame4();
		
		
	}//end of main
	
} // end of class
