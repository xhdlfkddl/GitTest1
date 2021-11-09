package Ch04;

public class BusMainTest {
	
	
	public static void main(String[] args) {
		
		// 버스 101번, 102번 버스를 만들어주세요
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);
		
		// bus101
		bus101.showInfo();
		
		//bus102
		bus102.showInfo();
		
		// bus101.take
		bus101.take(1200);
		bus101.showInfo();
		
		// bus102.take 2번 showInfo 출력
		bus102.take(1200);
		bus102.take(1200);
		bus102.showInfo();
		
		
		
	}// end of main
	
}// end of class
