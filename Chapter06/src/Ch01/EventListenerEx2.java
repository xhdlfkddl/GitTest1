package Ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// SuperMyFrame이 JFrame을 상속 받고 있기 때문에 JFrame 사용가능
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
		setTitle("이벤트 리스너 연습2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		button1 = new JButton("이벤트 버튼 1");
		button2 = new JButton("이벤트 버튼 2");
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
		System.out.println("버튼이 눌러졌습니다.");
	}
	
	
}


public class EventListenerEx2 {
	
	public static void main(String[] args) {
		new MyFrame2();
		
	}
	
	
}
