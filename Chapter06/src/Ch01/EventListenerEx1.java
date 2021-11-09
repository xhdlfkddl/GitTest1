package Ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener{
	
	final static int BUTTON_COUNT = 5;
	ArrayList<JButton> buttonList = new ArrayList<JButton>();
	
	JButton button;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;
	
	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�̺�Ʈ ������ ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < BUTTON_COUNT; i++) {
			buttonList.add(button = new JButton("��ư" + (i+1)));
		}
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < BUTTON_COUNT; i++) {
			add(buttonList.get(i));
		}
	}

	private void addEventListener() {
		//button�� actionListener�� ��Ͻ��ѳ���
		// �ش� ��ư�� ������ �Ǹ� �߻�޼��带 �����ϵ��� ��
		for (int i = 0; i < BUTTON_COUNT; i++) {
			buttonList.get(i).addActionListener(this);
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("��ư�� Ŭ���Ǿ����ϴ�.");

//		JButton clickedButton = (JButton) e.getSource();//ObjectŸ��
//		System.out.println(clickedButton.getText()); // ��ư 1�� ������ ��ư 1�̶�� ���
		
		// ���ڿ� ���Ͽ� 1�� Ŭ�� �� 1���� Ŭ���Ǿ����ϴ� ��� ���� ����ϱ�
//		if (clickedButton.getText().equals("��ư1")) {
//			System.out.println("1���� Ŭ���Ǿ����ϴ�");
//		}
//		else if (clickedButton.getText().equals("��ư2")) {
//			System.out.println("2���� Ŭ���Ǿ����ϴ�");
//		}
//		else if (clickedButton.getText().equals("��ư3")) {
//			System.out.println("3���� Ŭ���Ǿ����ϴ�");
//		}
//		else if (clickedButton.getText().equals("��ư4")) {
//			System.out.println("4���� Ŭ���Ǿ����ϴ�");
//		}
//		else if (clickedButton.getText().equals("��ư5")) {
//			System.out.println("5���� Ŭ���Ǿ����ϴ�");
//		}
		
		JButton clickedButton = (JButton) e.getSource();
		
		for (int i = 0; i < BUTTON_COUNT; i++) {
			if (clickedButton.getText().equals("��ư" + (i+1))) {
				System.out.println((i + 1) +"���� Ŭ���Ǿ����ϴ�");
			}
		}
		
	}

	
}


public class EventListenerEx1 {
	
	
	public static void main(String[] args) {
		new MyFrame1();
	}
}
