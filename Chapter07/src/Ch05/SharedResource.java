package Ch05;

class BankAccount {
	
	int money = 100_000;
	
	// getter
	public int getMoney() {
		return money;
	}
	
	// setter
	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력입니다");
		} else {
			this.money = money;
		}
	}
	
	// synchronized 메서드
	// 메서드 전체 보호
	public synchronized void saveMoney(int money) {
		// 10만원인 상태
		int currentMoney = getMoney();
		System.out.println("메서드 동작 확인1: saveMoney");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(currentMoney + money);
		System.out.println("입급 후 계좌 잔액: "+ getMoney());
		
	}

	// 출금기능
	public void withdrawMoney(int money) {
		
		// synchronized 블럭
		// 블럭 내부 자원만 보호
		synchronized (this) {
			int currentMoney = getMoney();
			System.out.println("메서드 동작 확인2: withdrawMoney");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Todo
			//출금 금액이 잔액보다 적으면 출금이 불가함
			setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액: " + getMoney());
		}// end of synchronized
		
	}
	
	
}//end of bankAccount class

class Father extends Thread {
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// 입금하기
		account.saveMoney(10_000);
	}
	
	
}// end of Father class

class Mother extends Thread {
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.withdrawMoney(5_000);
	}
}

public class SharedResource {
	/*
	 멀티 쓰레드
	 
	 동기화
	 두개의 thread가 같은 객체에 접근할 경우, 동시에 접근함으로써 오류가 발생
	 동기화는 임계영역에 접근한 경우 공유자원을 lock하여 다른 thread의 접근을 제어
	 자바에서는 synchronized메서드나 synchronized 블럭을 사용
	 
	  synchronized 메서드
     객체의 메소드에 synchronized 키워드 사용
     현재 이 메서드가 속해있는 객체에 lock을 건다.

	synchronized 블럭

    현재 객체 또는 다른 객체를 lock으로 만든다
	 */
	
	public static void main(String[] args) {
		
		// 현재 10만원이 저금되어있는 상태로 객체 생성
		BankAccount account = new BankAccount();
		
		// 다형성이 적용된 상태
		// Fahter = Thread, Mother = Thread
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// 아버지가 입금하는 동작
		father.start();
		// 어머니가 출금
		mother.start();
		
		// 정상 처리 금액 : 10만원 + 1만원 - 5만원 = 10만 5천원
		// 출금 후 계좌 잔액:95000
		// 입급 후 계좌 잔액: 110000
		
		// 동기화
		// 임계영역이 발생될 때는 (작업자 간 자원을 공유하는 상태)
		// 현재 자원(데이터 = BankAccount)을 사용하고 있기 때문에 보호처리를 해주어야함
		// 다른 작업자가 사용하지 못하도록 lock을 걸어준다.
		// 순서를 지켜서 작업을 하도록 한다.
		
		// 사용방법
		// 1.synchronized 메서드
		// 2.synchronized 블럭
	}
	
}
