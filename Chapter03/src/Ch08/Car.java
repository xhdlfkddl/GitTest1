package Ch08;

public abstract class Car {
	
	//�߻�޼���
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	// ��ũ(hook) �޼���
	// �ʿ��ϸ� ������ �ϴ� ���� �޼���
	public void washCar() {
		
	}
	
	// �ٽ�!!
	// ����Ŭ�������� ������ �� �� ���� �ؾ���. -> final
	// ������ ���� �͵��� �˾Ƽ� ã�Ƽ� �����ų ��!!
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
	//�Ϲݸ޼���
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
}
