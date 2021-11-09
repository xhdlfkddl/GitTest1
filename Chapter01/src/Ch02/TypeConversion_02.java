package Ch02;

public class TypeConversion_02 {
	
	// 메인함수(코드의 시작점)
	public static void main(String[] args) {
		// 데이터의 형변환이란?
		// 서로 다른 자료형 간에 연산 등의 수행을 위해 하나의 자료형으로 통일하는 것
		// int 자료형을 double로 변경하거나 
		// double 자료형을 int로 변경하는 것을 말함
		
		int iNum1 = 100;
		System.out.println(iNum1); // 100 출력
		
		// 자동 형변환 (묵시적 형변환)
		// 바이트 크기가 작은 자료형에서 큰 자료형으로 형변환은 자동으로 이루어 짐 
		double dNum1 = iNum1;
		System.out.println(dNum1); // 100.0 출력
		
		// 강제 형변환 (명시적 형변환)
		double dNumber = 1.12345;
		//	int iNumber = dNumber; 
		// Type Mismatch 에러발생
		// int는 4바이트 double은 8바이트
		// 쉽게 말해 8바이트를 4바이트 크기에 넣으려고 하니 공간이 부족하여 에러가 발생
		
		// 개발자가 컴파일러에게 강제로 넣게 하는 방법
		int iNumber = (int)dNumber;
		System.out.println(iNumber); // 1이 출력 (데이터 손실이 일어남)
		
		// 연습
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		
		System.out.println(aValue);
		System.out.println(bValue);
		
		
	} // end of main
	
} // end of class
