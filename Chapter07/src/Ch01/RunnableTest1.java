package Ch01;

import javax.swing.JFrame;

// Runnable 인터페이스를 구현하여 만들면 됨
class MyRunnable1 extends JFrame implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 200; i++) {
			System.out.print(i + "\t");
		}
	}
	
}


public class RunnableTest1 extends JFrame{
	
	public static void main(String[] args) {
		MyRunnable1 myRunnable1 = new MyRunnable1();
		
		//Runnable을 구현한 객체는 Thread를 생성하여 매개변수에 담고 Thread를 시작함
		Thread thread1 = new Thread(myRunnable1);
		thread1.start();

		Thread thread2 = new Thread(myRunnable1);
		thread2.start();
	}
	
}
