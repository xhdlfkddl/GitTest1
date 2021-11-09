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
		setTitle("이벤트 리스너 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < BUTTON_COUNT; i++) {
			buttonList.add(button = new JButton("버튼" + (i+1)));
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
		//button에 actionListener를 등록시켜놓음
		// 해당 버튼을 누르게 되면 추상메서드를 실행하도록 함
		for (int i = 0; i < BUTTON_COUNT; i++) {
			buttonList.get(i).addActionListener(this);
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼이 클릭되었습니다.");

//		JButton clickedButton = (JButton) e.getSource();//Object타입
//		System.out.println(clickedButton.getText()); // 버튼 1을 누르면 버튼 1이라고 출력
		
		// 문자열 비교하여 1번 클릭 시 1번이 클릭되었습니다 라는 문구 출력하기
//		if (clickedButton.getText().equals("버튼1")) {
//			System.out.println("1번이 클릭되었습니다");
//		}
//		else if (clickedButton.getText().equals("버튼2")) {
//			System.out.println("2번이 클릭되었습니다");
//		}
//		else if (clickedButton.getText().equals("버튼3")) {
//			System.out.println("3번이 클릭되었습니다");
//		}
//		else if (clickedButton.getText().equals("버튼4")) {
//			System.out.println("4번이 클릭되었습니다");
//		}
//		else if (clickedButton.getText().equals("버튼5")) {
//			System.out.println("5번이 클릭되었습니다");
//		}
		
		JButton clickedButton = (JButton) e.getSource();
		
		for (int i = 0; i < BUTTON_COUNT; i++) {
			if (clickedButton.getText().equals("버튼" + (i+1))) {
				System.out.println((i + 1) +"번이 클릭되었습니다");
			}
		}
		
	}

	
}


public class EventListenerEx1 {
	
	
	public static void main(String[] args) {
		new MyFrame1();
	}
}
