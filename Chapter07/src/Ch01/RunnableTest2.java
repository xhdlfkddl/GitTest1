package Ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame {
	
	int grade = 19;
	
	public MyRunnable2() {
		// ��ü ������ ���ÿ� run�޼��带 �����Ű�� ���
		runnable.run();
	}
	
	// �ڹٹ���
	// ������ü
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
		// �ܺο��� run �޼��带 �����Ű�� ���
		//myRunnable2.runnable.run();
		
	}
}
