package Ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// SuperMyFrame�� JFrame�� ��� �ް� �ֱ� ������ JFrame ��밡��
class MyFrame2 extends SuperMyFrame implements ActionListener {
	
	JButton button1;
	JButton button2;
	JButton button3;
	
	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	@Override
	protected void initData() {
		setTitle("�̺�Ʈ ������ ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		button1 = new JButton("�̺�Ʈ ��ư 1");
		button2 = new JButton("�̺�Ʈ ��ư 2");
		super.initData();
	}
	
	@Override
	protected void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		super.setInitLayout();
	}
	
	@Override
	protected void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		super.addEventListener();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư�� ���������ϴ�.");
	}
	
	
}


public class EventListenerEx2 {
	
	public static void main(String[] args) {
		new MyFrame2();
		
	}
	
	
}
