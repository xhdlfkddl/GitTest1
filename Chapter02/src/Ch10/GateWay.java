package Ch10;

public class GateWay {
	
	// �����Ǵ� �ڿ�
	public static int zealotCount = 0;
	
	private int gateWayId;
	private String name;
	
	public GateWay(int id) {
		this.gateWayId = id;
		name = "����Ʈ����";
	}
	
	// ���� �����ϱ�
	public Zealot createZealot() {
		System.out.println("������ �����մϴ�.");
		zealotCount++;
		return new Zealot("����");
	}
	
}
