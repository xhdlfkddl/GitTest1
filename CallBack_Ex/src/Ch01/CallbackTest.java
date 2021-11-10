package Ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Callback 메서드 만드는 법
// 인터페이스를 선언한다.
// 인터페이스에는 추상메서드만 존재할 수 있음
interface CallbackBtnAction {
	// 추상메서드는 body가 없음
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	// 메서드 3개 추가 생성
	public void clickedMultiBtn();
	public void clickedDiviBtn();
	public void clickedResetBtn();
	// 매개변수로 값 전달 가능
	public void passValue(int value);
	
}// end of interface


// Callback을 받는 객체: CallbackBtnAction 인터페이스를 구현하여 메서드를 정의한다.
// interface 사용방법: implements
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
		//Callback되어지는 메서드: 
		System.out.println(this.getClass().getName() + "이 콜백받았습니다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println("마이너스를 콜백 받았습니다.");
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMultiBtn() {
		System.out.println("곱하기를 콜백 받았습니다");
		count = count * count;
		label.setText(count + "");
		
	}

	@Override
	public void clickedDiviBtn() {
		System.out.println("나누기를 콜백 받았습니다.");
		count = count / 2;
		label.setText(count + "");
		
	}

	@Override
	public void clickedResetBtn() {
		System.out.println("리셋을 콜백 받았습니다.");
		count = 0;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		System.out.println("value 값을 전달받음: " + value);
		label.setText(value + "");
		
	}
	
}// end of MainActivity


// 콜리(호출자): Callback받는 객체의 주소값을 알고 있어야 메서드가 호출되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	// 문제 1. 버튼 3개 생성
	JButton btnMulti;
	JButton btnDivi;
	JButton btnReset;
	//
	JButton btnPassValue;
	
	// Callback받는 객체의주소값을 불러오는 방법
	//1. 멤버변수로 선언
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요!!
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnMulti = new JButton("곱하기 버튼");
		btnDivi = new JButton("나누기 버튼");
		btnReset = new JButton("리셋 버튼");
		btnPassValue = new JButton("값 전달 버튼");
		
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
		
		// 1. 버튼 구문
		JButton targetBtn = (JButton)e.getSource();
		
		if (targetBtn == btnAdd) {
			// 더하기 버튼
			callbackBtnAction.clickedAddBtn();
		} else if(targetBtn == btnMinus) {
			// 빼기 버튼
			callbackBtnAction.clickedMinusBtn();
 		} else if(targetBtn == btnMulti) {
			// 곱하기 버튼
			callbackBtnAction.clickedMultiBtn();
		} else if(targetBtn == btnDivi) {
			// 나누기 버튼
			callbackBtnAction.clickedDiviBtn();
		} else if(targetBtn == btnReset){
			// 리셋 버튼
			callbackBtnAction.clickedResetBtn();
		} else if(targetBtn == btnPassValue) {
			// 값 출력 버튼
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
