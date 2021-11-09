package Ch06;

public class Wrapper_Ex1 {
	/*
	  자바 자료형은 크게 기본타입과 참조타입으로 나우어집니다
	 기본 타입의 데이터를 객체로 표현해야하는 경우가 있는데 
	 이때 기본 자료형 타입을 객체로 다루기 위해서 사용하는 클래스를 래퍼 클래스라고 합니다.
	 
	 기본 데이터 타입 -> 래퍼클래스 : 박싱
	 래퍼클래스 -> 기본 데이터 타입 : 언박싱
	 */
	public static void main(String[] args) {
		
		// int -> Integer
		Integer num = new Integer(17); // 박싱
		int n = num.intValue(); // 언박싱
		
		System.out.println(n);
		

	}

}
