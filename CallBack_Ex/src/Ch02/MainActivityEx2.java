package Ch02;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivityEx2 extends JFrame implements CallBackBtn2{
	
	int count;
	
	JLabel label;
	
	public MainActivityEx2() {
		count = 0;
		label = new JLabel(count +"");
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(label);
	}

	@Override
	public void plusBtnAction() {
		System.out.println("더하기 버튼 콜백");
		count++;
		label.setText(count + "");
	}

	@Override
	public void minusBtnAction() {
		System.out.println("빼기 버튼 콜백");
		count--;
		label.setText(count + "");
	}

	@Override
	public void resetBtnAction() {
		System.out.println("리셋 버튼 콜백");
		count = 0;
		label.setText(count + "");
	}
	
}
