package Ch09;

import java.util.Random;

public class MainTest2 {
	public static void main(String[] args) {
		
		// JDK�� ����� ���� ����
		
		Random r = new Random();
		// ��ȣ �ȿ� 0~n��° ���ڱ��� ��ȣ�� �̾Ƴ� �� ����.
		int value = r.nextInt(20);
		System.out.println("value ����: " + value);
		
		
		
	}// end of main
} // end of class
