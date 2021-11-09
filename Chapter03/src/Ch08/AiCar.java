package Ch08;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
		
	}

	@Override
	public void wiper() {
		System.out.println("자동차가 스스로 유리를 닦습니다.");
	}

	@Override
	public void washCar() {
		System.out.println("제발로 세차장에 걸어들어갑니다.");
	}
}
