package Ch05;

public class DownCastingTest {

	public static void main(String[] args) {
		
		//1. 바나나의 origin 멤버변수를 추가
		
		// 업캐스팅
		Fruit fruit = new Banana();
		
		//fruit.origin; -> 안되는 상황 -> 해결방법 = 다운캐스팅
		// 다운캐스팅: 컴파일러에게 자식 객체 타입으로 바라보라고 명시
		
		// 컴파일 타임
		// 기계가 알아들을 수 있도록 0101로 명령을 내림 
		// 컴파일러는 부모타입 인스턴스 변수 타입을 바라보고 있는 상태
		// 객체는 바나나가 생성되었지만 컴파일러는 fruit를 바라보고 있는 것
		
		// 바나나를 바라보게 만듦
		String origin = ((Banana)fruit).origin;
		System.out.println("원산지: " + origin);
		
		//런타임
		
		
	}// end of main

}// end of class
