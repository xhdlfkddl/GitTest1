package Ch09;

public class MainTest {

	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyrobot = new ToyRobot();
		
		/*
		televison.turnOn();
		televison.turnOff();
		System.out.println("--------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		*/
		
		//������ - ��(����, ��ü, ����)
		
		RemoteController[] remote = new RemoteController[3];
		// �������� ������ ����Ǿ��� ����
		remote[0] = televison;
		remote[1]	= refrigerator;
		remote[2] = toyrobot;
		
		// Ȯ�� for���� ��� turnOnȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("--------------------");
		
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("--------------------");

		// instanceOf ������ ����غ���
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("�峭�� ��ü�Դϴ�.");
				// ȭ�鿡 name ������ ����غ�����
				String name = ((ToyRobot)remote[i]).name;
				System.out.println(name);
			}
			if (remote[i] instanceof Televison) {
				System.out.println("TV ��ü�Դϴ�.");
			}
			if (remote[i] instanceof Refrigerator) {
				System.out.println("����� ��ü�Դϴ�.");
			}
			
		}
		
		/*
		�������̽� ����
		ǥ��ȭ�� �����ϴ�.
		���� ������� Ŭ�����鿡�� ���踦 �ξ��� �� �ִ�.
		Ŭ�������� ���յ��� ���߾� ������ �ڵ带 ������ �� �ִ�.
		
		����
		��ü���� �з����� �ٽ�
		��ü�� ��ü ���� ��ȣ�����Ͽ� �ڵ带 ������ ������(����, ���� ��)
		��ü�� ��ü ���� ���踦 �����Ͽ� �ڵ带 ������ ������.
		(���, ���԰���, �߻�Ŭ����, �������̽�) ������(Ŭ������ �پ��� ���·�)
		*/
		
		
	}

}
