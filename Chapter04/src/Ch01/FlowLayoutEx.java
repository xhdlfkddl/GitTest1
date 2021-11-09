package Ch01;

import java.awt.FlowLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame{
	
	final int JBUTTONS_SIZE = 6;
	
	private ArrayList<JButton> button = new ArrayList<>();
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("FlowLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 10));
		setVisible(true);
		
		// ArrayList
		// ArrayList는 처음 사이즈가 0임
		// button.add(new JButton("n번째 버튼")
		for (int i = 0; i < JBUTTONS_SIZE; i++) {
			button.add(new JButton(i+1 + "번째 버튼")); 
		}
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		// button.get(1);
		for (int i = 0; i < button.size(); i++) {
			add(button.get(i));
		}
	}
	
}


public class FlowLayoutEx {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
