package Ch08;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� ������ �մϴ�.");
		System.out.println("����� ������ �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ��Ƽ� �����մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("����� ���� ������ �۽��ϴ�.");
	}

}
