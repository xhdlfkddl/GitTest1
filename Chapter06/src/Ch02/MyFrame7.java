package Ch02;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {
	
	final static int UP_BUTTON = 38;
	final static int DOWN_BUTTON = 40;
	final static int LEFT_BUTTON = 37;
	final static int RIGHT_BUTTON = 39;
	
	JTextArea area;
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}
	
	private void addEventListener() {
		// 다형성이 적용되어 현재 클래스가 KeyListener 타입으로 볼 수 있음
		//area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 위쪽 방향키 38
				if (e.getKeyCode() == UP_BUTTON) { // = KeyEvent.VK_UP
					area.append("위쪽 방향키가 눌러졌습니다" + "\n");
				}
				// 아래쪽 방향키 40
				else if (e.getKeyCode() == DOWN_BUTTON) {
					area.append("아래쪽 방향키가 눌러졌습니다" + "\n");
				}
				// 왼쪽 방향키 37
				else if (e.getKeyCode() == LEFT_BUTTON) {
					area.append("왼쪽 방향키가 눌러졌습니다" + "\n");
				}
				// 오른쪽 방향키 39
				else if (e.getKeyCode() == RIGHT_BUTTON) {
					area.append("오른쪽 방향키가 눌러졌습니다" + "\n");
				}

			}
		});
	}
	
	
	/*
	// 키보드를 땠을 때 호출, 모든 키에 반응합니다.
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed: " + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");
//		area.append(e.getKeyCode() + "\n");
		// 위쪽 방향키 38
		if (e.getKeyCode() == UP_BUTTON) { // = KeyEvent.VK_UP
			area.append("위쪽 방향키가 눌러졌습니다" + "\n");
		}
		// 아래쪽 방향키 40
		else if (e.getKeyCode() == DOWN_BUTTON) {
			area.append("아래쪽 방향키가 눌러졌습니다" + "\n");
		}
		// 왼쪽 방향키 37
		else if (e.getKeyCode() == LEFT_BUTTON) {
			area.append("왼쪽 방향키가 눌러졌습니다" + "\n");
		}
		// 오른쪽 방향키 39
		else if (e.getKeyCode() == RIGHT_BUTTON) {
			area.append("오른쪽 방향키가 눌러졌습니다" + "\n");
		}
	}
	
	// 키보드를 눌렀을 때, 모든 키에 반응합니다.
	@Override
	public void keyReleased(KeyEvent e) {
	//	System.out.println("keyReleased: " + e.getID());
	}

	// 문자를 눌렀을 때 호출, 문자 키(화살표 등 제외)에만 반응합니다
	@Override
	public void keyTyped(KeyEvent e) {
	//	System.out.println("keyTyped: " + e.getID());
	}
	*/
	
}
