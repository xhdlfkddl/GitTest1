package Ch06;

public class Wrapper_Ex2 {

	public static void main(String[] args) {
		
		// 17의 데이터 타입 = int
		// num의 데이터 타입은 Integer
		// 데이터 타입이 맞지 않으면 형변환을 해주어야하는데
		//	자동으로 형변환을 해주었기 때문에 오류가 생기지 않음
		Integer num = 17; // 오토 박싱
		int n = num; // 오토 언박싱
		System.out.println(n);

	}

}
