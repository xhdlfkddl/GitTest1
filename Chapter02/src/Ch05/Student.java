package Ch05;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 학생이 버스를 탄다.(객체와 객체 간의 상호작용이 이루어지도록 코드 설계)
	// 객체의 주소를 넣는 것
	// 데이터 타입이 bus인 것이 들어와야함
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	public void takeSub(Subway sub) {
		sub.take(1500);
		this.money -= 1500;
	}
	
	//정보창 보여주기
	public void showInfo() {
		System.out.println(name + "님의 잔액은 " + money + "원 입니다");
		System.out.println();
	}
	
}
