package Ch07;

// �߻�޼��带 �����߱⶧��
public abstract class Computer {
	
	/*
	�߻� Ŭ������ 
	���� �ڵ� ���� �޼����� ���� �ִ� �߻�޼��带 ������ Ŭ���� 
	�޼����� ����: ��ȯŸ��, �޼��� �̸�, �Ű������� ����
	�޼��� ����: �޼��� ������ ������ �ǹ� �����θ� ����({})
	
	int add(intx, int y); ����
	int add(int x, int y){} �����ΰ� ���� -> �߻�޼��尡 �ƴ�
	abstract ���� ���
	�߻� Ŭ������ new �� �� ����(�ν��Ͻ�ȭ �� �� ����)
	*/
	
	// �߻� �޼���
	// �����
	// �߻�޼��带 �����ϸ� Ŭ������ �߻�Ŭ������ �ٲ������ 
	public abstract void display(); // body(�߰�ȣ)�� ����
	public abstract void typing();
	
	// �Ϲ� �޼���
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
