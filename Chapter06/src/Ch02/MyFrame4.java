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
		setTitle("익명 구현 객체 사용해보기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("이벤트 등록 후 대기");
		button2 = new JButton("이벤트 등록 후 대기2");
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(button, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
	}
	
	private void addEventListener() {
//		button.addActionListener(new ActionListener() {
//			
//			// 추상메서드를 일반메서드로 구현함
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
		ActionListener ac = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭 됨");
				System.out.println("추후 알아서 구분 코드를 작성해주세요");
			}
		};
		
		// 자동완성
		// 익명 구현 객체
		// 일회성의 인터페이스를 익명 구현 객체로 만들어 사용할 수 있다.
		button.addActionListener(ac);
		button2.addActionListener(ac);
	
	}
	
	
	public static void main(String[] args) {
//		MyFrame4 mf4 = new MyFrame4();
//		mf4.button.setText("안녕하세요");
		
//		 익명클래스(인스턴스 변수가 없기 때문에 지속적으로 접근하여 사용할 수는 없다.)
		 new MyFrame4();
	}
	
}
