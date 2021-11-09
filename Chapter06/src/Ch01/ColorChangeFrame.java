package Ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyFrame implements ActionListener{
	
	final static int COUNT = 5;
	
	BorderLayout borderLayout;
	
	JPanel panel1;
	JPanel panel2;
	
	ArrayList<JButton> buttonList = new ArrayList<>();
	ArrayList<String> colorList = new ArrayList<>();
	
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue};
	
	String[] stringColor = {"빨간색", "주황색", "노란색", "초록색", "파란색"};
	
	JButton button;
//	JButton button2;
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	@Override
	protected void initData() {
		super.initData();
		setTitle("이벤트 리스너 연습3");
		setSize(500,500);
		borderLayout = new BorderLayout();
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		for (int i = 0; i < COUNT; i++) {
			colorList.add(stringColor[i]	);
		}
		
		for (int i = 0; i < COUNT; i++) {
			buttonList.add(button = new JButton(colorList.get(i)));
		}
		
//		button = new JButton("빨간색");
//		button2 = new JButton("노란색");
	}
	
	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		setLayout(borderLayout);
		
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		add(panel1, BorderLayout.NORTH);

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);
		
		for (int i = 0; i < COUNT; i++) {
			panel2.add(buttonList.get(i));
		}
		
//		panel2.add(button);
//		panel2.add(button2);
	}
	
	@Override
	protected void addEventListener() {
		super.addEventListener();
		
		for (int i = 0; i < COUNT; i++) {
			buttonList.get(i).addActionListener(this);
		}
//		button.addActionListener(this);
//		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		
		for (int i = 0; i < COUNT; i++) {
			if (clickedButton.getText().equals(stringColor[i])) {
				panel1.setBackground(color[i]);
			}
		}
		
//		if (clickedButton.getText().equals("빨간색")) {
//			panel1.setBackground(Color.red);
//		}
//		else if (clickedButton.getText().equals("노란색")) {
//			panel1.setBackground(Color.yellow);
//		} 
		
	}
	
	
	public static void main(String[] args) {
		new ColorChangeFrame();
	}
}
