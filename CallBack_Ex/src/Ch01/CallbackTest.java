package Ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Callback �޼��� ����� ��
// �������̽��� �����Ѵ�.
// �������̽����� �߻�޼��常 ������ �� ����
interface CallbackBtnAction {
	// �߻�޼���� body�� ����
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	// �޼��� 3�� �߰� ����
	public void clickedMultiBtn();
	public void clickedDiviBtn();
	public void clickedResetBtn();
	// �Ű������� �� ���� ����
	public void passValue(int value);
	
}// end of interface


// Callback�� �޴� ��ü: CallbackBtnAction �������̽��� �����Ͽ� �޼��带 �����Ѵ�.
// interface �����: implements
class MainActivity extends JFrame implements CallbackBtnAction{
	
	int count;
	JLabel label;
	
	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
	}

	@Override
	public void clickedAddBtn() {
		//Callback�Ǿ����� �޼���: 
		System.out.println(this.getClass().getName() + "�� �ݹ�޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("���̳ʽ��� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMultiBtn() {
		System.out.println("���ϱ⸦ �ݹ� �޾ҽ��ϴ�");
		count = count * count;
		label.setText(count + "");
		
	}

	@Override
	public void clickedDiviBtn() {
		System.out.println("�����⸦ �ݹ� �޾ҽ��ϴ�.");
		count = count / 2;
		label.setText(count + "");
		
	}

	@Override
	public void clickedResetBtn() {
		System.out.println("������ �ݹ� �޾ҽ��ϴ�.");
		count = 0;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		System.out.println("value ���� ���޹���: " + value);
		label.setText(value + "");
		
	}
	
}// end of MainActivity


// �ݸ�(ȣ����): Callback�޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ��Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	// ���� 1. ��ư 3�� ����
	JButton btnMulti;
	JButton btnDivi;
	JButton btnReset;
	//
	JButton btnPassValue;
	
	// Callback�޴� ��ü���ּҰ��� �ҷ����� ���
	//1. ��������� ����
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿�!!
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnMulti = new JButton("���ϱ� ��ư");
		btnDivi = new JButton("������ ��ư");
		btnReset = new JButton("���� ��ư");
		btnPassValue = new JButton("�� ���� ��ư");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		add(btnMinus);
		add(btnMulti);
		add(btnDivi);
		add(btnReset);
		add(btnPassValue);
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnMulti.addActionListener(this);
		btnDivi.addActionListener(this);
		btnReset.addActionListener(this);
		btnPassValue.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 1. ��ư ����
		JButton targetBtn = (JButton)e.getSource();
		
		if (targetBtn == btnAdd) {
			// ���ϱ� ��ư
			callbackBtnAction.clickedAddBtn();
		} else if(targetBtn == btnMinus) {
			// ���� ��ư
			callbackBtnAction.clickedMinusBtn();
 		} else if(targetBtn == btnMulti) {
			// ���ϱ� ��ư
			callbackBtnAction.clickedMultiBtn();
		} else if(targetBtn == btnDivi) {
			// ������ ��ư
			callbackBtnAction.clickedDiviBtn();
		} else if(targetBtn == btnReset){
			// ���� ��ư
			callbackBtnAction.clickedResetBtn();
		} else if(targetBtn == btnPassValue) {
			// �� ��� ��ư
			callbackBtnAction.passValue(100);
		}
		
		
	}
	
}// end of SubActivity


public class CallbackTest {
	
	public static void main(String[] args) {
		MainActivity mainActivity = new MainActivity();
		new SubActivity(mainActivity);
		
	}
	
}
