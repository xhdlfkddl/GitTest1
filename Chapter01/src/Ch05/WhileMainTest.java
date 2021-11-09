package Ch05;

public class WhileMainTest {
	
	// 메인클래스
	public static void main(String[] args) {
		
		// while문
		// 주어진 조건에 맞는 동안(true 일 동안) 지정된 수행문을 반복적으로 수행하는 제어문
		// 조건이 맞지 않으면 반복하던 수행을 멈추게 됨
		// 조건은 주로 반복 횟수나 값이 비교의 결과에 따라 true,false를 판단하게 됨
		
		// 1~10까지 덧셈 연산
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			// 조건문이 참일 때 출력
			System.out.println("현재 값: " + num);
			sum += num;
			// 출력이 완료된 후 num의 값을 1씩 증가시킨 뒤 while의 조건문을 다시 판단(반복)
			num++;
			
			// 0.5초마다 반복
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} // end of while
		
		System.out.println("연산의 결과 값은: " + sum + " 입니다.");
	
		
		
		
		
	} // end of main
	
} // end of class
