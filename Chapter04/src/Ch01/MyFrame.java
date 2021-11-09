package Ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	
	public MyFrame() {
		setTitle("첫번째 GUI 프로그램 작성");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*
	 flowlayout - 왼쪽에서 오른족으로 배치 오른쪽 공간이 없다면 아래쪽으로 배치
	 borderlayout
	 gridlayout
	 cardlayout
	 null
	 */
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
}
