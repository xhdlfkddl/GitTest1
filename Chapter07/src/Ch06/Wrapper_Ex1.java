package Ch06;

public class Wrapper_Ex1 {
	/*
	  �ڹ� �ڷ����� ũ�� �⺻Ÿ�԰� ����Ÿ������ ��������ϴ�
	 �⺻ Ÿ���� �����͸� ��ü�� ǥ���ؾ��ϴ� ��찡 �ִµ� 
	 �̶� �⺻ �ڷ��� Ÿ���� ��ü�� �ٷ�� ���ؼ� ����ϴ� Ŭ������ ���� Ŭ������� �մϴ�.
	 
	 �⺻ ������ Ÿ�� -> ����Ŭ���� : �ڽ�
	 ����Ŭ���� -> �⺻ ������ Ÿ�� : ��ڽ�
	 */
	public static void main(String[] args) {
		
		// int -> Integer
		Integer num = new Integer(17); // �ڽ�
		int n = num.intValue(); // ��ڽ�
		
		System.out.println(n);
		

	}

}
