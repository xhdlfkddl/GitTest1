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
		
		//다형성 - 배(선박, 신체, 과일)
		
		RemoteController[] remote = new RemoteController[3];
		// 다형성의 개념이 적용되었기 때문
		remote[0] = televison;
		remote[1]	= refrigerator;
		remote[2] = toyrobot;
		
		// 확장 for문을 사용 turnOn호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("--------------------");
		
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("--------------------");

		// instanceOf 연산자 사용해보기
		for (int i = 0; i < remote.length; i++) {
			if (remote[i] instanceof ToyRobot) {
				System.out.println("장난감 객체입니다.");
				// 화면에 name 변수를 출력해보세요
				String name = ((ToyRobot)remote[i]).name;
				System.out.println(name);
			}
			if (remote[i] instanceof Televison) {
				System.out.println("TV 객체입니다.");
			}
			if (remote[i] instanceof Refrigerator) {
				System.out.println("냉장고 객체입니다.");
			}
			
		}
		
		/*
		인터페이스 장점
		표준화가 가능하다.
		서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
		클래스간의 결합도를 낮추어 유연한 코드를 설계할 수 있다.
		
		정리
		객체지향 패러다임 핵심
		객체와 객체 간의 상호협력하여 코드를 설계해 나간다(버스, 질럿 등)
		객체와 객체 간의 관계를 정의하여 코드를 설계해 나간다.
		(상속, 포함관계, 추상클래스, 인터페이스) 다형성(클래스를 다양한 형태로)
		*/
		
		
	}

}
