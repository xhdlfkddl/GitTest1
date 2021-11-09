package Ch01;

public class DataType3 {
	public static void main(String[] args) {
		// 기본 자료형 - 실수형(1.0, 0.123, 0.011 등)
		
		// float, double
		// 변수의 선언과 초기화를 동시에 해줌

//		float name = 0.5; // 실수의 기본 타입은 double임 
		// 때문에 여기서도 접미사를 사용해주어야 함
		float name = 0.5F;
		
		// 8바이트 -> 소수점을 더 많이 표현할 수 있기 때문에 많이 사용
		// 즉, 정확성을 더 보장해준다는 말
		double name2 = 0.123;
		
		System.out.println(name);
		System.out.println(name2);
		
		System.out.println("====================");
		System.out.println(0.5F);
		System.out.println(0.123);
		
	} // end of main
}
