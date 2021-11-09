package Ch03;

class Cal{
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int multyply(int n1, int n2) {
		return n1 *n2;
	}
}

class Cal2 extends Cal{
	
	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	/*
	// override (부모에 있는 메서드를 필요에 의해 재정의하여 사용하는 개념)
	// Cal1에서 만들어놓은 곱하기 연산을 수정하여 입력값이 0이라면 
	// 화면에 "0을 입력하지마세요" 라는 메세지가 출력되도록 하기
	// 자식 클래스에서 재정의한 메서드만 실행되며, 부모 클래스의 메서드는 잠시 가려짐
	@Override
	public int multyply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지 마세요");
		}
		return n1 * n2;
		
	}
	*/
	
	// 자동 완선
	@Override
	public int multyply(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지마세요");
		}
		// this.name = name과 비슷
		// super = 부모클래스 안으로 들어가서 multyply라는 메서드를 실행하라는 뜻
		// super를 사용하지않는다면
		// 만약 multyply의 코드가 1000줄이라면 1000줄을 모두 옮겨 적어야함
		return super.multyply(n1, n2);
	}
	
}

public class MainTest2 {
	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multyply(10, 0));
	}
}
