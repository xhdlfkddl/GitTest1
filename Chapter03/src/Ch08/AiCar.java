package Ch08;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
		
	}

	@Override
	public void wiper() {
		System.out.println("�ڵ����� ������ ������ �۽��ϴ�.");
	}

	@Override
	public void washCar() {
		System.out.println("���߷� �����忡 �ɾ���ϴ�.");
	}
}
