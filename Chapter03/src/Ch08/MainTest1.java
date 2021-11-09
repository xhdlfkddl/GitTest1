package Ch08;

public class MainTest1 {
	
	public static void main(String[] args) {
	
		// 재정의 한 메소드들은 알아서 그에 맞게 출력됨
		
		Car aiCar = new AiCar();
		aiCar.run();
//		시동을 켭니다.
//		자율 주행합니다.
//		자동차가 스스로 방향을 바꿉니다.
//		스스로 멈춥니다.
//		시동을 끕니다.
		
		Car manualCar = new ManualCar();
		manualCar.run();
//		시동을 켭니다.
//		사람이 운전을 합니다.
//		사람이 운전을 조작합니다.
//		브레이크를 밟아서 정지합니다.
//		시동을 끕니다.
		
	}
	
}
