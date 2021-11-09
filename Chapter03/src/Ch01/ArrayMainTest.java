package Ch01;

public class ArrayMainTest {
	public static void main(String[] args) {
		

	/*
	 배열이란
	 연관된 데이터를 모아서 통으로 관리하기 위해서 사용하는 데이터 타입입니다
	 변수가 하나의 데이터를 저장하기 위한 것이라면 
	 배열은 여러 개의 데이터를 하나의 변수에 저장하기 위한 것이라고 할 수 있습니다.
	 
	 동일한 자료형의 순차적 자료구조
	 인덱스 연산자[]를 이용하여 빠른 참조가 가능
	 물리적 위치와 논리적 위치가 동일
	 배열의 순서는 0부터 시작
	 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
	 */
	int number = 10;
	
	// 배열 선언방법
	int[] arr1 = new int[3]; // int 타입의 변수 3개를 담을 수 있는 통이 생긴 것
	int arr2[] = new int[10]; 
	
	// 배열에 초기화하는 방법(값을 넣는 방법)
	// 0번째 칸 안에 33을 넣겠다.
	arr1[0] = 33;
	arr1[1] = 10;
	arr1[2] = 11;
	
	// 배열의 선언과 동시에 초기화
	// index 마지막 수는 n-1이다
	// length = 3
	int[] numbers1 = new int[] {11, 20, 30};
	int[] numbers2 = {10, 50, 100};
	
	// 출력방법
	System.out.println(numbers1[0]);
	System.out.println(numbers1[1]);
	System.out.println(numbers1[2]);
	System.out.println(numbers1); // 주소값 출력
	
	
	// String 타입의 배열
	String[] strArr = new String[10];
	strArr[0] = "야스오";
	strArr[1] = "티모";
	strArr[2] = "애쉬";
	strArr[3] = "다리우스";
	
	// 1. 화면에 0,1,2,3,4를 출력해주세요. 단 for문 사용금지
//	System.out.println(strArr[0]);
//	System.out.println(strArr[0]);
//	System.out.println(strArr[0]);
//	System.out.println(strArr[0]);
	System.out.println(strArr.length);
	
	// null 값을 출력하지 마세요
	for (int i = 0; i < strArr.length; i++) {
		if(strArr[i] != null) {
			System.out.println(strArr[i]);
		}
	}
	
	// 모든 프로그래밍 언어에서는 index는 0부터 시작합니다
	// 배열을 사용할 때 보통 for문과 관계하여 많이 사용합니다.
	
	// int[] i1 = new int[22]; // length = 22, index = 21
	// int[] i2 = new int[74]; // length = 74, index = 73
			
		
		
	}// end of main
	
} //end of class
