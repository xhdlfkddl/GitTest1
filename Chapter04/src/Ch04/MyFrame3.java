package Ch04;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	// 이미지라는 친구를 선언
	private Image image;
	
	public ImagePanel(String name) {
		image = new ImageIcon(name).getImage();
	}

	public ImagePanel() {
		// 이미지로 사진을 불러올 때는 이미지 아이콘이라는 것을 사용
		// 컴포넌트로 가져오기 때문에 백그라운드로 가져올 때는 잘 그려지지 않음
		// 때문에 버퍼드 이미지를 사용
		image = new ImageIcon("image.jpg").getImage();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
	
}

public class MyFrame3 extends JFrame{
	
	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;
	
	public MyFrame3() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("JPanel에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel2 = new ImagePanel("image.jpg");
		button = new JButton("버튼입니다");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 1));
		
		add(imagePanel);
		add(imagePanel2);
		
		imagePanel.add(button);
	}

	public static void main(String[] args) {
		new MyFrame3();
	}
	
}
