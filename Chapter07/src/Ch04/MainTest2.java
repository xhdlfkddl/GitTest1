package Ch04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame1 extends JFrame {
	
	public MyFrame1() {
		setTitle("gif����غ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("����!!");
		ImageIcon img = new ImageIcon("img.gif");
		
		JLabel imageLabel = new JLabel(img);
		
		JLabel bottomTextLabel = new JLabel("�������ּ���");
		
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(bottomTextLabel);
		
		setSize(500, 500);
		setVisible(true);
	}

}



public class MainTest2 {

	public static void main(String[] args) {
		new MyFrame1();
	}

}
