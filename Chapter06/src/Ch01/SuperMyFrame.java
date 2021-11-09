package Ch01;

import javax.swing.JFrame;

public class SuperMyFrame extends JFrame{
	
	public SuperMyFrame() {
		
	}
	
	// private 에서 protected로 변경 해주어야 상속을 받은 클래스에서 사용가능
	protected void initData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void setInitLayout() {
		setVisible(true);
	}
	
	protected void addEventListener() {
		
	}
	
}
