package Ch04;

public class Bus {
	
	// ���� ��ȣ
	int busNumber;
	// �°� �� 
	int passengerCount;
	// ���ͱ�
	int money;
	
	
	// �����Ϸ��� �⺻ �����ڸ� ����� ��
	
	public Bus(int busNumber) {
		// this.������� = �Ű�����
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		// ������ money�� ���ο� ž���ڰ� ���� �� ���� ������
		// this.money = money + money;
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber +"���� �°��� ");
		System.out.println(passengerCount +"�� �̸� ");
		System.out.println("���� ���ͱ��� " + money +"�� �Դϴ�");
		System.out.println();
	}
	
}
