package Ch01;

public class ThreadTest1 {
	
	
	//메인함수 <- 메인쓰레드
	public static void main(String[] args) {
		// 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는 단위는 thread이다.
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}// end of for
		
	}//end of main
	
}// end of class
