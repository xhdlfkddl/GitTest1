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
	
	// ������ ���� 6���� ��� ��
	int[] lotto = new int[LottoNumber.LOTTO_NUM_SIZE];
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�ζǹ�ȣ������");
		setSize(600, 400);
		button = new JButton("++�ζǹ�ȣ �����ϱ�++");
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
		//6�ڸ� ���� ���ڰ� �迭�� �Ѿ�´�.
		lotto = lottoNumber.getLottoNumber();
		repaint();
		
	}
	
	class LottoPanel  extends JPanel {
		@Override
		public void paint(Graphics g) {
			Font font = new Font("�ü�ü", Font.BOLD, 20);
			g.setFont(font);
			
			// �ƹ��͵� �������� �ʾҴٸ� lotto[] �迭���� ��� 0�� ������� ��
			// ������ ù index���� 0�̶�� �ش� ������ ����ϵ��� ��.
			if (lotto[0] == 0) {
				g.drawString("�ζ� ��ȣ�� �����ϼ���", 180, 180);
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
