package Ch07;

public class MainTest1 {
	public static void main(String[] args) {
		
		Bank bank = new Bank();// �޸𸮿� �ø� ����
		// ��������� �⺻ ����
		// int balance --> 0
		// double --> 0.0
		// String --> null
		
		// �Ա��մϴ�.
		bank.deposit(10_000);
		bank.showInfo();
		
		// ����մϴ�.
		int money = bank.withdraw(5_000);
		System.out.println("����� �ݾ��� " + money + "���Դϴ�.");
		bank.showInfo();
		
		// �Ǽ��� ��������� �ٷ� �����Ͽ� �ܾ��� ������
		// bank.balance = 100_000; 
		// private int�� �ٲٸ� The field Bank.balance is not visible ���� �߻�
		// �� �� ���� = ����� �� ����
		// ��������
		
		bank.showInfo();
		
		// ������ ������ ���� ���� ���
		// getter = read only
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		// setter
		bank.setBalance(-1000);
		bank.showInfo();
		
		
		
		
	}// end of main
	
}// end of class
