package Ch07;

// public Ŭ������ .java���� �ȿ� �� �ϳ��� ����� �� ����
public class Bank {
	/*
	 ���� ���� ������
	 Ŭ���� �ܺο��� Ŭ������ ��� ����, �޼���, �����ڸ� ����� �� �ִ� �� ���θ� �����ϴ� Ű����
	 �������� ������ (4����)
	 public - ������ ������ �����
	 default - ���� ��Ű�� ������ ������ �����
	 protected - ��Ӱ��迡�� ������ �����
	 private - ���� Ŭ���������� ������ �����
	 */
	
	private int balance; // �ܾ�
	
	//method
	// �Ա�
	public void deposit(int money) {
		// this.balance = this.balance + money;
		this.balance += money;
	}
	
	// ���
	public int withdraw(int money) {
		this.balance -= money;
		
		return money;
	}
	
	public void showInfo() {
		System.out.println("�ܾ��� " + this.balance + "���Դϴ�.");
	}
	
	// getter �޼��� �����
	// �޼��带 ���� ��������� ������ �Ѱ� �޴� ��
	// �Ϲݹ����� get() �޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� ����
	public int getBalance() {
		return this.balance;
	}
	
	// setter �޼��� �����
	// �Ϲ������� set() �޼��带 �����ؼ� �ܺο��� ��� ������ ������ �� �ֵ��� ����
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			this.balance = balance;
		}
	}
	
	
	
	
	
}
