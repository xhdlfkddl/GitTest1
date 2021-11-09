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
			System.out.println("�߸��� �Է��Դϴ�");
		} else {
			this.money = money;
		}
	}
	
	// synchronized �޼���
	// �޼��� ��ü ��ȣ
	public synchronized void saveMoney(int money) {
		// 10������ ����
		int currentMoney = getMoney();
		System.out.println("�޼��� ���� Ȯ��1: saveMoney");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(currentMoney + money);
		System.out.println("�Ա� �� ���� �ܾ�: "+ getMoney());
		
	}

	// ��ݱ��
	public void withdrawMoney(int money) {
		
		// synchronized ��
		// �� ���� �ڿ��� ��ȣ
		synchronized (this) {
			int currentMoney = getMoney();
			System.out.println("�޼��� ���� Ȯ��2: withdrawMoney");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Todo
			//��� �ݾ��� �ܾ׺��� ������ ����� �Ұ���
			setMoney(currentMoney - money);
			System.out.println("��� �� ���� �ܾ�: " + getMoney());
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
		// �Ա��ϱ�
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
	 ��Ƽ ������
	 
	 ����ȭ
	 �ΰ��� thread�� ���� ��ü�� ������ ���, ���ÿ� ���������ν� ������ �߻�
	 ����ȭ�� �Ӱ迵���� ������ ��� �����ڿ��� lock�Ͽ� �ٸ� thread�� ������ ����
	 �ڹٿ����� synchronized�޼��峪 synchronized ���� ���
	 
	  synchronized �޼���
     ��ü�� �޼ҵ忡 synchronized Ű���� ���
     ���� �� �޼��尡 �����ִ� ��ü�� lock�� �Ǵ�.

	synchronized ��

    ���� ��ü �Ǵ� �ٸ� ��ü�� lock���� �����
	 */
	
	public static void main(String[] args) {
		
		// ���� 10������ ���ݵǾ��ִ� ���·� ��ü ����
		BankAccount account = new BankAccount();
		
		// �������� ����� ����
		// Fahter = Thread, Mother = Thread
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// �ƹ����� �Ա��ϴ� ����
		father.start();
		// ��Ӵϰ� ���
		mother.start();
		
		// ���� ó�� �ݾ� : 10���� + 1���� - 5���� = 10�� 5õ��
		// ��� �� ���� �ܾ�:95000
		// �Ա� �� ���� �ܾ�: 110000
		
		// ����ȭ
		// �Ӱ迵���� �߻��� ���� (�۾��� �� �ڿ��� �����ϴ� ����)
		// ���� �ڿ�(������ = BankAccount)�� ����ϰ� �ֱ� ������ ��ȣó���� ���־����
		// �ٸ� �۾��ڰ� ������� ���ϵ��� lock�� �ɾ��ش�.
		// ������ ���Ѽ� �۾��� �ϵ��� �Ѵ�.
		
		// �����
		// 1.synchronized �޼���
		// 2.synchronized ��
	}
	
}
