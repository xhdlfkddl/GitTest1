package Ch09;

// �����������̽�
public class ToyRobot implements RemoteController, SoundEffect{

	String name;
	
	public ToyRobot() {
		this.name = "�Ǵ�κ�";
	}
	
	@Override
	public void turnOn() {
		System.out.println("�峭�� �κ��� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("�峭�� �κ��� ���ϴ�");
		
	}

	@Override
	public void notification() {
		System.out.println("�ߺ�ߺ�....");
	}
	
}
