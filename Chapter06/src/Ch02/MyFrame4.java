package Ch02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame{
	
	JButton button;
	JButton button2;
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�͸� ���� ��ü ����غ���");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("�̺�Ʈ ��� �� ���");
		button2 = new JButton("�̺�Ʈ ��� �� ���2");
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(button, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
	}
	
	private void addEventListener() {
//		button.addActionListener(new ActionListener() {
//			
//			// �߻�޼��带 �Ϲݸ޼���� ������
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
		ActionListener ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư Ŭ�� ��");
				System.out.println("���� �˾Ƽ� ���� �ڵ带 �ۼ����ּ���");
			}
		};
		
		// �ڵ��ϼ�
		// �͸� ���� ��ü
		// ��ȸ���� �������̽��� �͸� ���� ��ü�� ����� ����� �� �ִ�.
		button.addActionListener(ac);
		button2.addActionListener(ac);
	
	}
	
	
	public static void main(String[] args) {
//		MyFrame4 mf4 = new MyFrame4();
//		mf4.button.setText("�ȳ��ϼ���");
		
//		 �͸�Ŭ����(�ν��Ͻ� ������ ���� ������ ���������� �����Ͽ� ����� ���� ����.)
		 new MyFrame4();
	}
	
}
