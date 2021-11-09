package Ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoFrame extends JFrame implements ActionListener{

	JButton button;
	LottoPanel lottoPanel;
	LottoNumber lottoNumber;
	
	// 생성한 숫자 6개를 담는 통
	int[] lotto = new int[LottoNumber.LOTTO_NUM_SIZE];
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("로또번호생성기");
		setSize(600, 400);
		button = new JButton("++로또번호 생성하기++");
		lottoPanel = new LottoPanel();
		lottoNumber = new LottoNumber();
	}
	
	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.GRAY);
		add(button, BorderLayout.NORTH);
		add(lottoPanel, BorderLayout.CENTER);
	}
	
	private void addEventListener() {
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//6자리 랜덤 숫자가 배열로 넘어온다.
		lotto = lottoNumber.getLottoNumber();
		repaint();
		
	}
	
	class LottoPanel  extends JPanel {
		@Override
		public void paint(Graphics g) {
			Font font = new Font("궁서체", Font.BOLD, 20);
			g.setFont(font);
			
			// 아무것도 실행하지 않았다면 lotto[] 배열에는 모두 0이 담겨있을 것
			// 때문에 첫 index값에 0이라면 해당 문구가 출력하도록 함.
			if (lotto[0] == 0) {
				g.drawString("로또 번호를 생성하세요", 180, 180);
				return;
			}
			
			int xPoint = 150;
			for (int i = 0; i < lotto.length; i++) {
				g.drawString(lotto[i] + "", xPoint, 150);
				xPoint += 50;
			}
		}
	}
	
	public static void main(String[] args) {
		new LottoFrame();
	}
	
}
