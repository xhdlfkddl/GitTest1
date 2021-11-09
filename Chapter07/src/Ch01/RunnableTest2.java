package Ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame {
	
	int grade = 19;
	
	public MyRunnable2() {
		// 객체 생성과 동시에 run메서드를 실행시키는 방법
		runnable.run();
	}
	
	// 자바문법
	// 구현객체
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("-");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // end of for
			
		}// end of run
	};
	
}



public class RunnableTest2 {
	public static void main(String[] args) {
		
		MyRunnable2 myRunnable2 = new MyRunnable2();
		// 외부에서 run 메서드를 실행시키는 방법
		//myRunnable2.runnable.run();
		
	}
}
