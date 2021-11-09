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
		System.out.println("�۾��ڸ� �����մϴ�.");

		// ���� �����尡 �۾��ڸ� ��û�Ͽ� ����
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		System.out.println("0���� �Է��ϸ� �����մϴ�.");
		Scanner sc = new Scanner(System.in);
		
		
		/*
		int userInput = sc.nextInt();
		
		if(userInput == 0) {
			//thread1.stop(); // deprecated -> ���̻� ������������ ����
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
