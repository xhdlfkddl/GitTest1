package Ch07;

// public 클래스는 .java파일 안에 단 하나만 사용할 수 있음
public class Bank {
	/*
	 접근 제어 지시자
	 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는 지 여부를 지정하는 키워드
	 접근제어 지시자 (4가지)
	 public - 누구나 접근을 허용함
	 default - 같은 패키지 내에서 접근을 허용함
	 protected - 상속관계에서 접근을 허용함
	 private - 같은 클래스에서만 접근을 허용함
	 */
	
	private int balance; // 잔액
	
	//method
	// 입금
	public void deposit(int money) {
		// this.balance = this.balance + money;
		this.balance += money;
	}
	
	// 출금
	public int withdraw(int money) {
		this.balance -= money;
		
		return money;
	}
	
	public void showInfo() {
		System.out.println("잔액은 " + this.balance + "원입니다.");
	}
	
	// getter 메서드 만들기
	// 메서드를 통해 멤버변수의 정보를 넘겨 받는 것
	// 일반벅으로 get() 메서드를 만들어서 외부에서 확인할 수 있도록 구현
	public int getBalance() {
		return this.balance;
	}
	
	// setter 메서드 만들기
	// 일반적으로 set() 메서드를 제공해서 외부에서 멤버 변수에 접근할 수 있도록 구현
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.balance = balance;
		}
	}
	
	
	
	
	
}
