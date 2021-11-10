package Ch02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivityEx2 extends JFrame implements ActionListener{
	
	JButton btnPlus;
	JButton btnMinus;
	JButton btnReset;
	
	CallBackBtn2 cbb2;
	MainActivityEx2 mac2;
	
	public SubActivityEx2(CallBackBtn2 cbb2) {
		this.cbb2 = cbb2;
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		btnPlus = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnReset = new JButton("리셋 버튼");
		
		add(btnPlus);
		add(btnMinus);
		add(btnReset);
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnReset.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		
		if (targetBtn == btnPlus) {
			cbb2.plusBtnAction();
		} else if (targetBtn == btnMinus) {
			cbb2.minusBtnAction();
		} else if (targetBtn == btnReset) {
			cbb2.resetBtnAction();
		}
		
	}
	
}
