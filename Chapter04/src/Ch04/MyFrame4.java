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
	 
	// 내부적으로 여러 장의 사진을 가져오기 위해 버퍼드 이미지를 사용
	// 중복해서 사용할 때는 버퍼드 이미지를 사용하는 것이 유리
	BufferedImage backgroundImage;

	BufferedImage imageIcon;
	// 3개 이상 만들기
	BufferedImage imageIcon2;
	BufferedImage imageIcon3;
	BufferedImage imageIcon4;
	// 반복적인 부분이 보이면 배열, ArrayList 사용
	
	
	MyImagePanel myImagePanel;
	
	// 생성자
	public MyFrame4() {
		initData();
		setInintLayout();
	}
	//initData
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			//정해져있는 문법
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
			imageIcon2 = ImageIO.read(new File("among2.png"));
			imageIcon3 = ImageIO.read(new File("among1.png"));
			imageIcon4 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾을 수 없습니다.");
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
	
	// 메인함수
	public static void main(String[] args) {
		new MyFrame4();
		
		
	}//end of main
	
} // end of class
