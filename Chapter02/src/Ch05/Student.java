package Ch05;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// �л��� ������ ź��.(��ü�� ��ü ���� ��ȣ�ۿ��� �̷�������� �ڵ� ����)
	// ��ü�� �ּҸ� �ִ� ��
	// ������ Ÿ���� bus�� ���� ���;���
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	public void takeSub(Subway sub) {
		sub.take(1500);
		this.money -= 1500;
	}
	
	//����â �����ֱ�
	public void showInfo() {
		System.out.println(name + "���� �ܾ��� " + money + "�� �Դϴ�");
		System.out.println();
	}
	
}
