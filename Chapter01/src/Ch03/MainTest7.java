package Ch03;

public class MainTest7 {
	
	// 메인 메소드
	public static void main(String[] args) {
		
		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자가 함께 하용
		
		// += 	두 항의 값을 더해서 왼쪽 항에 대입합니다
		int num1 = 1;
//		num1 = num1 +10;
		num1 += 10;
		System.out.println(num1); // 11
		
		// -= 	왼쪽 항에서 오른쪽 항을 빼서 그 값을 왼쪽 항에 대입합니다
		int num2 = 1;
//		num2 = num2 - 10;
//		복합 대입 연산자로 변경
		num2 -= 10;
		System.out.println(num2); // num2 변수의 현재 값 -9

		// *= 	두 항의 값을 곱해서 왼쪽 항에 대입합니다
		//num2 변수에 곱하기 2를 하여 num2 변수 결과 값을 담아주세요
		// 단 복합 대입연산자를 사용
		num2 *= 2;
		System.out.println(num2); // -18
		num2 = num2 * 2;
		
		// /= 	왼쪽 항을 오른쪽 항으로 나누어 그 몫을 왼쪽 항에 대입합니다
		// num2 변수에 나누기 2를 하여 num2 변수 결과 값을 담아주세요
		// 단 복합 대입연산자를 사용
		num2 /= 2;
		System.out.println(num2); // -9
		num2 = num2 / 2;

		// %= 	왼쪽 항을 오른쪽 항으로 나누어 그 나머지를 왼쪽 항에 대입힙니다
		// num2 변수에 나머지 연산자 2를 하여 num2 변수 결과 값을 담아주세요
		// 단 복합 대입연산자를 사용
		num2 %= 2;
		System.out.println(num2); // -1
		num2 = num2 % 2;
		
		
		
		
	} // end of main
} // end of class
