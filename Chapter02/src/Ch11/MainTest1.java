package Ch11;

import java.util.Calendar;

public class MainTest1 {
	public static void main(String[] args) {
		
		//Company 객체를 생성해보세요(5개)
		// 생성자가 private이라서 불가능 함
//		Company company = new Company();
		Company co1 = Company.getInstance(); // = new Company(); 주소값
		Company co2 = Company.getInstance();
		Company co3 = Company.getInstance();
		Company co4 = Company.getInstance();
		Company co5 = Company.getInstance();
		
		
		// 화면에 주소값을 출력해보세요
		// .getInstance를 여러번 했지만 결국 new Company를 한 번 한것과 같음
		// 굳이 new라고 해서 메모리 낭비를 줄이기 위해
		System.out.println(co1);
		System.out.println(co2);
		System.out.println(co3);
		System.out.println(co4);
		System.out.println(co5);
		
		// 싱글톤 패턴이라서 new로 생성하지못함
		// 이유: 
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		
		
	}
	
}
