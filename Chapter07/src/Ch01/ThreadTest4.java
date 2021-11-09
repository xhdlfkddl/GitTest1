package Ch01;


public class ThreadTest4 {
	
	
	public static void main(String[] args) {
		/*
		Thread 란?
		process: 프로그램이 실행되면 os로부터 메모리를 할당받아 프로세스 상태가 된다.
		thread: 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는 단위는 thread이다.
		
		MultiThreading이란?
		여러 Thread가 동시에 수행되는 프로그램, 여러 작업이 동시에 실행되는 것처럼 보이는 효과
		Thread는 각각 자신만의 작업 공간을 가질 수 있다.(context)
		
		여러 thread가 자원을 공유하여 작업이 수행되는 경우
		서로 자원을 차지하려는 race condition이 발생할 수 있다.
		-> 의도하지않은 결과를 생성할 수 있음
		-> 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section(임계영역)이라고 함
		
		해결책 - 동기화 - critical section에 대한 동기화(순차적으로 수행)을 구현, 설계해야함.
		*/
	}
	
}
