package Ch01;

class MyThreadEx3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + ":" + Thread.currentThread());
		}// end of for
	}
}

public class ThreadTest3 {
	// ���ν�����
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		// �۾��� 3�� ����
		MyThreadEx3 th1 = new MyThreadEx3();
		MyThreadEx3 th2 = new MyThreadEx3();
		MyThreadEx3 th3 = new MyThreadEx3();
		
		// �۾��� ���۽����ּ���
		th1.start();
		th2.start();
		th3.start();
		
	}// end of main
	
	
}// end of class
