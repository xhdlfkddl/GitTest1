package Ch03;

import java.awt.BorderLayout;
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

public class ThreadGame extends JFrame {
	
	MyImagePanel imagePanel;
	MoveImage moveImage = new MoveImage();
	
	BufferedImage backgroundImage;
	BufferedImage img1;
	BufferedImage img2;
	
	int xPoint = 100;
	int yPoint = 100;
	
	int xPoint2 = -15;
	
	boolean start = true;
//	boolean stop = false;
	
	JPanel buttonPanel;
	
	JButton startButton;
	JButton stopButton;
	
	public ThreadGame() {
		initData();
		setInitLayout();
		addEventListener();
		moveImage.run();
	}
	
	private void initData() {
		setTitle("게임");
		setSize(500, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			img1 = ImageIO.read(new File("among1.png"));
			img2 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("파일이없습니다. 프로그램을 종료합니다");
			System.exit(0);
		}
		imagePanel = new MyImagePanel();
		moveImage = new MoveImage();
		
		buttonPanel = new JPanel();
		
		startButton = new JButton("start");
		stopButton = new JButton("stop");
	}
	
	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(imagePanel);
		add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(startButton);
		buttonPanel.add(stopButton);
	}
	
	private void addEventListener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyPointer = e.getKeyCode();
				System.out.println(keyPointer);
				System.out.println(xPoint);
				System.out.println(yPoint);
				
				if (keyPointer == 37) {
					xPoint = (xPoint < -10) ? -10 : xPoint - 10;
				} else if (keyPointer == 38) {
					yPoint = (yPoint < 0) ? 0 : yPoint - 10;
				} else if (keyPointer == 39) {
					xPoint = (xPoint > 400) ? 400 : xPoint + 10;
				} else if (keyPointer == 40) {
					yPoint = (yPoint > 380) ? 380 : yPoint + 10;
				}
				repaint();
			}
		});
		
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				start = true;
			}
		});
		
		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				start = false;
			}
		});
	}
	
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(img1, xPoint, yPoint, 100, 100, null);
			g.drawImage(img2, xPoint2, 370, 100, 100, null);
		}
	}
	
	private class MoveImage implements Runnable{
		@Override
		public void run() {
			boolean flag = true;
	
			while(start) {
				if (xPoint2 >= 399) {
					flag = false;
				}
				if (xPoint2 < -11) {
					flag = true;
				}
				if (flag) {
					xPoint2 += 10;
				} else {
					xPoint2 -= 10;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
			} 
				
			
		}// end of run

	}

	public static void main(String[] args) {
		new ThreadGame();
	}

}
