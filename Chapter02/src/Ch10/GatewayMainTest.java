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
		
		// static 변수는 인스턴스들이 공유할 수 있는 변수이다
		// -> 객체를 생성하지 않고도 클래스 이름으로 접근이 가능하다.
		// ex) 태양 (객체가 생성되기 전에 메모리에 올라가있음)
		System.out.println("생성된 질럿 수: " + GateWay.zealotCount);
		
	}// end of main
} // end of class
