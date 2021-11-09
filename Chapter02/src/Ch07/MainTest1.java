package Ch07;

public class MainTest1 {
	public static void main(String[] args) {
		
		Bank bank = new Bank();// 메모리에 올린 상태
		// 멤버변수의 기본 성질
		// int balance --> 0
		// double --> 0.0
		// String --> null
		
		// 입금합니다.
		bank.deposit(10_000);
		bank.showInfo();
		
		// 출금합니다.
		int money = bank.withdraw(5_000);
		System.out.println("출금한 금액은 " + money + "원입니다.");
		bank.showInfo();
		
		// 실수로 멤버변수에 바로 접근하여 잔액을 수정함
		// bank.balance = 100_000; 
		// private int로 바꾸면 The field Bank.balance is not visible 에러 발생
		// 볼 수 없음 = 사용할 수 없음
		// 정보은닉
		
		bank.showInfo();
		
		// 숨겨진 정보를 보기 위한 방법
		// getter = read only
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		// setter
		bank.setBalance(-1000);
		bank.showInfo();
		
		
		
		
	}// end of main
	
}// end of class
