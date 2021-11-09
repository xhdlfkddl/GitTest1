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
	// 메인스레드
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		// 작업자 3명 생성
		MyThreadEx3 th1 = new MyThreadEx3();
		MyThreadEx3 th2 = new MyThreadEx3();
		MyThreadEx3 th3 = new MyThreadEx3();
		
		// 작업을 시작시켜주세요
		th1.start();
		th2.start();
		th3.start();
		
	}// end of main
	
	
}// end of class
