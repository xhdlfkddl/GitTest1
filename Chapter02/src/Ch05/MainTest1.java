package Ch05;

public class MainTest1 {

	public static void main(String[] args) {

		// 버스 만들기
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		
		// 학생만들기
		Student student1 = new Student("최익현", 10_000);
		Student student2 = new Student("최형배", 50_000);
		Student student3 = new Student("김판호", 20_000);
		
		// 지하철 만들기
		Subway sub1 = new Subway(1);
		Subway sub2 = new Subway(2);
		Subway sub3 = new Subway(3);

		// 학생 버스 탑승
		student1.takeBus(bus100);
		student2.takeBus(bus200);
		student3.takeBus(bus300);
		
		// 학생 잔액확인
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		
		// 버스 정보 확인
		bus100.showInfo();
		bus200.showInfo();
		bus300.showInfo();
		
		// 학생 지하철 탑승
		student1.takeSub(sub1);
		student2.takeSub(sub2);
		student3.takeSub(sub3);
		
		// 학생 잔액확인
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		
		// 지하철 정보확인
		sub1.showInfo();
		sub2.showInfo();
		sub3.showInfo();
		
		/*
		// 학생이 버스를 탄다
		student1.takeBus(bus100);
		
		// 상태창 확인
		student1.showInfo();
		bus100.showInfo();
		
		student2.takeBus(bus100);
		student2.showInfo();
		bus100.showInfo();
		
		
		// student1이 지하철을 탑니다
		student1.takeSub(sub1);
		
		student1.showInfo();
		sub1.showInfo();
		*/
		
		}// end of main

} // end of class
