package Ch05;

public class Subway {

	int num;
	int passengerCount;
	int money;

	public Subway(int num) {
		this.num = num;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(num+ "ȣ�� ����ö��");
		System.out.println("�°� ���� " + passengerCount + "���̸�");
		System.out.println("���� ���ͱ��� " + money + "�� �Դϴ�");
		System.out.println();
	}
	
}
