package Ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame{
	
	private JPanel panel;
	private JButton button;
	private JLabel label;
	JTextField textField;
	private JPasswordField jPasswordField;
	private JCheckBox checkBox;
	
	public MyComponents() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("Component ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		
		panel = new JPanel();
		label = new JLabel("label");
		button = new JButton("button");
		textField = new JTextField("��Ʈ", 20);
		jPasswordField = new JPasswordField(20);
		checkBox = new JCheckBox("checkBox", true);
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(panel);
		
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		panel.add(jPasswordField);
		panel.add(checkBox);
		
	}
	
	
}
