package Ch05;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
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
