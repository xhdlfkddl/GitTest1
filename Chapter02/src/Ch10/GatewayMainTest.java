package Ch10;

public class GatewayMainTest {
	public static void main(String[] args) {
	
		GateWay gateway1 = new GateWay(1);
		
		Zealot zealot1 = gateway1.createZealot();
		Zealot zealot2 = gateway1.createZealot();
		Zealot zealot3 = gateway1.createZealot();

		GateWay gateway2 = new GateWay(1);
		
		Zealot zealot4 = gateway2.createZealot();
		Zealot zealot5 = gateway2.createZealot();
		Zealot zealot6 = gateway2.createZealot();
		
		GateWay gateway3 = new GateWay(1);
		
		Zealot zealot7 = gateway3.createZealot();
		Zealot zealot8 = gateway3.createZealot();
		Zealot zealot9 = gateway3.createZealot();
		
		zealot1.showInfo();
		
		// static ������ �ν��Ͻ����� ������ �� �ִ� �����̴�
		// -> ��ü�� �������� �ʰ� Ŭ���� �̸����� ������ �����ϴ�.
		// ex) �¾� (��ü�� �����Ǳ� ���� �޸𸮿� �ö�����)
		System.out.println("������ ���� ��: " + GateWay.zealotCount);
		
	}// end of main
} // end of class
