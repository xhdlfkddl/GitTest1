package Ch04;

public class IfMainTest {
	
	// 메인 메소드
	public static void main(String[] args) {
		
		// 조건문 = 제어문
		// 주어진 조건에 따라 다른 실행이 이루어지도록 구현
		
//		boolean flag = true;
		boolean flag = false;
		
		// if 문 단독 사용방법
		// if(조건식){수행문}
		// 조건식이 '참'인 경우에 수행문이 수행됨
		// 조건식이 '참'이 아니면 수행문이 수행되지않음

		if (flag) {
			System.out.println("조건식 결과가 true이면 실행됩니다");
		} // end of if
		
		// if else 문
		// if(조건문){수행문}  조건이 참일때 수행문이 수행됨
		// else(조건문){수행문} if 조건이 참이 아니고 else 조건이 참일 때 수행문이 수행됨
		
		if (flag) {
			System.out.println("ture이면 실행");
		} else {
			System.out.println("false이면 실행");
		}
		
		// if - else if - else
		// if(조건식1) { 수행문1 }
		// 조건식1이 '참'인 경우 수행하고 전체 조건문을 빠져나감
		// else if(조건식2) { 수행문2 }
		// 조건식2이 '참'인 경우 수행하고 전체 조건문을 빠져나감
		// else { 수행문3 }
		// 위 조건이 모두 해당되지 않는 경우 수행됨 (디폴트 조건)
		// 수행문4;            
		// if-else if-else 문이 끝나면 수행됨
		// 가령 조건식2가 만족되면 수행문2 -> 수행문4  순으로 수행됨
		
//		int point = 70;
		int point = 40;
		
		if (point >= 90) {
			System.out.println("A학점입니다");
		} else if (point >= 80) {
			System.out.println("B학점입니다");
		} else if (point >= 70) {
			System.out.println("C학점입니다");
		} else if (point >= 60) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		

		
	} // end of main
	
} // end of class
