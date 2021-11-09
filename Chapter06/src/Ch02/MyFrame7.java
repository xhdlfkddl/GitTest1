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
		setTitle("Ű �̺�Ʈ ����");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.add(area);
	}
	
	private void addEventListener() {
		// �������� ����Ǿ� ���� Ŭ������ KeyListener Ÿ������ �� �� ����
		//area.addKeyListener(this);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// ���� ����Ű 38
				if (e.getKeyCode() == UP_BUTTON) { // = KeyEvent.VK_UP
					area.append("���� ����Ű�� ���������ϴ�" + "\n");
				}
				// �Ʒ��� ����Ű 40
				else if (e.getKeyCode() == DOWN_BUTTON) {
					area.append("�Ʒ��� ����Ű�� ���������ϴ�" + "\n");
				}
				// ���� ����Ű 37
				else if (e.getKeyCode() == LEFT_BUTTON) {
					area.append("���� ����Ű�� ���������ϴ�" + "\n");
				}
				// ������ ����Ű 39
				else if (e.getKeyCode() == RIGHT_BUTTON) {
					area.append("������ ����Ű�� ���������ϴ�" + "\n");
				}

			}
		});
	}
	
	
	/*
	// Ű���带 ���� �� ȣ��, ��� Ű�� �����մϴ�.
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("keyPressed: " + e.getID());
//		e.getKeyCode();
//		System.out.println(e.getKeyCode());
//		area.setText(e.getKeyCode() + "");
//		area.append(e.getKeyCode() + "\n");
		// ���� ����Ű 38
		if (e.getKeyCode() == UP_BUTTON) { // = KeyEvent.VK_UP
			area.append("���� ����Ű�� ���������ϴ�" + "\n");
		}
		// �Ʒ��� ����Ű 40
		else if (e.getKeyCode() == DOWN_BUTTON) {
			area.append("�Ʒ��� ����Ű�� ���������ϴ�" + "\n");
		}
		// ���� ����Ű 37
		else if (e.getKeyCode() == LEFT_BUTTON) {
			area.append("���� ����Ű�� ���������ϴ�" + "\n");
		}
		// ������ ����Ű 39
		else if (e.getKeyCode() == RIGHT_BUTTON) {
			area.append("������ ����Ű�� ���������ϴ�" + "\n");
		}
	}
	
	// Ű���带 ������ ��, ��� Ű�� �����մϴ�.
	@Override
	public void keyReleased(KeyEvent e) {
	//	System.out.println("keyReleased: " + e.getID());
	}

	// ���ڸ� ������ �� ȣ��, ���� Ű(ȭ��ǥ �� ����)���� �����մϴ�
	@Override
	public void keyTyped(KeyEvent e) {
	//	System.out.println("keyTyped: " + e.getID());
	}
	*/
	
}
