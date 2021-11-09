package Ch03;

public class MainTest3 {
	public static void main(String[] args) {
		
		// 자동차를 생성하여 showInfo를 호출해주세요.
		Car car1 = new Car("경찰차", 1200);
		car1.showInfo();
		
		// 해당 자동차의 엔진의 정보를 출력해보세요
		car1.engine = new Engine("7기통", 300);
		car1.engine.showInfo();
		// 생성자에 넣어도 됨
		
		
	} // end of main
} // end of class
