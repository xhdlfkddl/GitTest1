package Ch03;

public class MainTest4 {
	public static void main(String[] args) {
		
		// 관계연산자
		// 관찰의 결과가 참, 거짓인지 판별할 때 사용한다
		// 이항연산자
		// 연산의 결과가 true(참), false(거짓)으로 반환됨, 비교연산자라고도 함
		// 조건문, 반복문의 조건식으로 많이 사용됨
		
		int num1 = 5;
		int num2 = 3;
		
		// > 왼쪽항이 크면 참, 아니면 거짓
		boolean value2 = ( num1 > num2 );
		System.out.println(value2);
		
		// < 왼쪽항이 작으면 참, 아니면 거짓
		boolean value1 = ( num1 < num2 );
		System.out.println(value1);
		
		// == 왼쪽항과 오른쪽 항이 같으면 참, 아니면 거짓
		boolean value3 = ( num1 == num2 );
		System.out.println(value3);
		
		// != 왼쪽항과 오른쪽항이 같지않으면 참, 아니면 거짓
		boolean value4 = ( num1 != num2 );
		System.out.println(value4);
		
		// >= 왼쪽항이 오른족항보다 크거나 같으면 참, 아니면 거짓
		
		// <= 왼쪽항이 오른쪽항보다 작거나 같으면 참, 아니면 거짓
		
		
	} // end of main
} // end of class
