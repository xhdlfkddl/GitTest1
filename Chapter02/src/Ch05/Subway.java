package Ch05;

public class Subway {

	int num;
	int passengerCount;
	int money;

	public Subway(int num) {
		this.num = num;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(num+ "호선 지하철의");
		System.out.println("승객 수는 " + passengerCount + "명이며");
		System.out.println("현재 수익금은 " + money + "원 입니다");
		System.out.println();
	}
	
}
