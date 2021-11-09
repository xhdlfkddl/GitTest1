package Ch04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAomgUs extends JFrame implements ActionListener {
	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	
	CustomJPanel customJPanel;

	//
	BorderLayout borderLayout;
	JPanel bottomPanel;
	JButton btnStart;
	JButton btnStop;
	
	//
	boolean isOn = true;
	
	//thread�� ����� ����
	int among1XPoint = 0;
	int among1YPoint = 370;
	
	int among2XPoint = 200;
	int among2YPoint = 200;
	
	public MiniAomgUs() {
		initData();
		setInitLayout();
		addEventListener();
		
		//������ ���� ����
		Thread thread = new Thread(customJPanel);
		thread.start();
	}
	
	private void initData() {
		setTitle("����");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			amongImage1 = ImageIO.read(new File("among2.png"));
			amongImage2 = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("������ ���׿�!!");
			System.exit(0);
		}
		
		customJPanel = new CustomJPanel();
		
		// ��ư �г� ����
		borderLayout = new BorderLayout();
		bottomPanel = new JPanel();
		btnStart = new JButton("Start");
		btnStop = new JButton("Stop");
	}
	
	private void setInitLayout() {
		
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(borderLayout);
		
		this.add(customJPanel, BorderLayout.CENTER);
		this.add(bottomPanel, BorderLayout.SOUTH);
		
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		bottomPanel.add(btnStart);
		bottomPanel.add(btnStop);
	}
	
	private void addEventListener() {
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				switch (code) {
				case KeyEvent.VK_UP:
					among2YPoint -= 10;
					break;
				case KeyEvent.VK_DOWN:
					among2YPoint += 10;
					break;
				case KeyEvent.VK_LEFT:
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					among2XPoint += 10;
					break;
				}
				repaint();
			}
		});
		
	}// end of EventListener
	
	// ����Ŭ���� �����
	private class CustomJPanel extends JPanel implements Runnable{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 600, 600, null);
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {
			
			boolean isRight = true;
			
			while(true) {
				
				if(isOn) {
					if (isRight) { // ĳ���Ͱ� ���������� ���� �ִٸ�
						among1XPoint += 10;
					} else {
						among1XPoint -= 10;
					}
					
					if(among1XPoint == 400) {
						isRight = false;
					}
					
					if(among1XPoint == 0) {
						isRight = true;
					}
					
					// �̹��� 1�� �̹��� 2�� ��ǥ��(x,y)�� ��ġ�Ѵٸ� �̹��� 2�� ���ش�.
					if ((among1XPoint == among2XPoint) 
							&& (among1YPoint == among2YPoint)) {
						amongImage2 = null;
					}
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}// end of if
				
				repaint();
				
				
			}// end of while
			
		}// end of run
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1. ��ư�� start, stop �������ּ���
		JButton button = (JButton)e.getSource();
		if (button == btnStart) {
			System.out.println("���۹�ư");
			isOn = true;
		} else {
			System.out.println("�����ư");
			isOn = false;
		}
		
		// 2. ������ ���Ӱ� Ȱ���Ͽ� while�� ���߰ų� �ٽ� ������ �� �ְ� �ڵ带 �������ּ���
		
	}
	
	
	
}

public class MainTest1 {
	
	public static void main(String[] args) {
		new MiniAomgUs();
	}
}
