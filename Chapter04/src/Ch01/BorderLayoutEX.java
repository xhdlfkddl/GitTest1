package Ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEX extends JFrame{
	
	BorderLayout borderLayout;

	JButton[] buttons = new JButton[5];
	String[] titles = {"북", "센터", "남", "동", "서"};
	// directions
	String[] directions = {BorderLayout.NORTH, BorderLayout.CENTER,
									BorderLayout.SOUTH, BorderLayout.EAST,
									BorderLayout.WEST};
//	String[] directions = {"NORTH", "CENTER","SOUTH", "EAST", "WEST"};
	
	public BorderLayoutEX() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		super.setTitle("BorderLayout 연습");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 400);
		
		borderLayout = new BorderLayout();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
		// for
		// super.add(buttons[0], BorderLayout.NORTH);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i]);
		}
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEX();
	}
	
}
