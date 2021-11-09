package Ch03;

public class ExceptionEx1 {
	
	/*
	 예외처리
	  프로그램에서의 오류
	  
	  컴파일 오류 
	  프로그램 코드 작성 중 발생하는 문법적 오류
	  최근에는 개발 환경(이클립스)에서 대부분의 컴파일 오류는 detection됨
	  
	   실행오류(런타임 에러)
	   실행중인 프로그램이 의도하지않은 동작을 하거나 프로그램이 중지되는 오류
	   실행오류는 비정상 종료가 되는 경우 -> 시스템의 심각한 장애를 야기시킴
	   
	   예외처리 중요성
	   프로그램의 비정상 종료를 피하여 시스템이 원활히 진행되도록 함
	   실행오류가 발생한 경우 오류의 과정을 제한하는 것은 현실적으로 힘듦
	   오류가 밠행한 경우 log를 남겨서 추후 log 분석을 통해 그 원인을 파악하여 big를 수정하는 것이 중요
	   
	   시스템오류(error) 
	   가상 머신에서 발생, 프로그래머가 처리할 수 없는 오류
	   
	   예외(exception)
	   프로그램에서 제어할 수 있는 오류
	   읽어들이려는 파일이 존재하지 않거나, 네트워크나 DB 연결이 안되는 경우 등
	   -> 자바는 안전성이 중요한 언어로 대부분 프로그램에서 발생하는 오류에 대해 문법적으로 예외처리를 해야함
	   
	   try-catch
	   try 블록에는 예외가 발생할 가능성이 있는 코드를 작성하고  try 블록 안에서 예외가 발생하는 경우 catch 블록이 수행됨
	   
	 */
	public static void main(String[] args) {
		
		// 예외를 발생시켜보자
		int[] arr = {1, 2, 3, 4, 5};
		
		/*
		for (int i = 0; i < 10; i++) {
			// runtime Exception (실행 중 오류발생)
			// java.lang.ArrayIndexOutOfBoundsException
			System.out.println(arr[i]);
		}
		*/
		
		// 1. 반복문에서 오류 발생
		try {
			// 예외가 발생할 코드를 try문에 작성합니다.
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		// 2. try에서 종료되지않고 catch 구문으로 넘어감	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		// 3. 마지막 명령어까지 실행된 후 종료
		System.out.println("비정상 종료되지않았습니다.");
		
		// 예외처리를 하는 이유
		// 프로그래밍이 종료되지 않고 계속 실행되기 때문이다!!
		
	}
}
