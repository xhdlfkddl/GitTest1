package Ch11;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer Ȱ��
		// ���������� �������� char[]�� ��������� ����
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ������
		// StringBuffer�� ��Ƽ������ ���α׷��ֿ��� ����ȭ�� ������
		// ���� ������ ���α׷������� StringBuilder�� ����ϱ� ����
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(java));
		System.out.println("===================");
		
		builder.append(android);
		System.out.println(builder);
		// ���� ���� �ּҰ�
		System.out.println(System.identityHashCode(java));
		System.out.println("===================");
		
		// ����1. append �޼��� ��� 3�� �ּҰ� Ȯ��
		builder.append("apple");
		System.out.println(builder);
		builder.append("banana");
		System.out.println(builder);
		builder.append("crayon");
		System.out.println(builder);
		System.out.println(System.identityHashCode(java));
		System.out.println("===================");
		
		// ���� 2
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		
	}// end of main

}// end of class
