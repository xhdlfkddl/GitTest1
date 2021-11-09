package Ch02;

import java.util.Scanner;

class MyThread1 extends Thread {
	
	boolean flag = true;
	
	@Override
	public void run() {
		
		while(flag) {
			System.out.print("-");
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of while
	}// end of run
	
}

public class ThreadEx1 {

	public static void main(String[] args) {
		System.out.println("작업자를 생성합니다.");

		// 메인 스레드가 작업자를 요청하여 생성
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		System.out.println("0번을 입력하면 중지합니다.");
		Scanner sc = new Scanner(System.in);
		
		
		/*
		int userInput = sc.nextInt();
		
		if(userInput == 0) {
			//thread1.stop(); // deprecated -> 더이상 유지보수하지 않음
			thread1.flag = false;
		}
		*/
		int userInput;
		
		do {
			userInput = sc.nextInt();
			if(userInput == 0) {
				thread1.flag = false;
			}
		} while (userInput != 0);
		
	}

}
