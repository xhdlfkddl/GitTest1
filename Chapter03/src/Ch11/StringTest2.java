package Ch11;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		// �� �� ������ String�� �Һ�(immutable)
		
		// String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴϰ�
		// ���ο� ���ڿ��� �����Ǵ� ��
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		// String Ÿ�� ������ ��� heap �޸��� �ּ�
		System.out.println(System.identityHashCode(java));// 366712642
		
		// java = java + android;
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));// 1829164700
		
	}// end of main
	
}// end of class
