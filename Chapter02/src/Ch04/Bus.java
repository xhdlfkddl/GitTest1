package Ch04;

public class Bus {
	
	// 버스 번호
	int busNumber;
	// 승객 수 
	int passengerCount;
	// 수익금
	int money;
	
	
	// 컴파일러가 기본 생성자를 만들어 줌
	
	public Bus(int busNumber) {
		// this.멤버변수 = 매개변수
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		// 기존의 money에 새로운 탑승자가 돈을 낸 것을 더해줌
		// this.money = money + money;
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber +"번의 승객은 ");
		System.out.println(passengerCount +"명 이며 ");
		System.out.println("현재 수익금은 " + money +"원 입니다");
		System.out.println();
	}
	
}
