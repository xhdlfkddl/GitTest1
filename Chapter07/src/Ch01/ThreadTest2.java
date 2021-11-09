package Ch01;

class MyThreadEx2 extends Thread {
	String name;
	
	public MyThreadEx2(String name) {
		this.name = name;
	}
	
	//thread 약속
	@Override
	public void run() {
		// RUN 안에서 실행시켜야 함
		int i;
		for(i = 0; i<50; i++) {
			System.out.println(name +": " + i +"\t");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// end of run
	
} // end of MyThreadEx2


public class ThreadTest2 {
	// main Thread
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		System.out.println("Start Main Thread");
		
		MyThreadEx2 th1 = new MyThreadEx2("작업자 1");
		// Thread의 작업을 시작시키는 명령어입니다.
		th1.start();
		
		/*
		for(int i = 0; i < 50; i++) {
			System.out.println("test: " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
		
		MyThreadEx2 th2 = new MyThreadEx2("작업자 2");
		th2.start();
		
		MyThreadEx2 th3 = new MyThreadEx2("작업자 3");
		th3.start();
		
		
		System.out.println("Finsh Main Thread");
		
		
	}// end of main
	
}//end of class
