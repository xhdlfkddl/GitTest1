package Ch03;

public class MainTest5 {
	
	// ���� �޼ҵ� 
	public static void main(String[] args) {
		
		// �� ������ (&&, ||) ���ۼ�Ʈ, ��Ƽ�� ��
		// ���� �����ڿ� ȥ���Ͽ� ���� ����
		// ������ ����� true, false�� ��ȯ��
		
		int num1 = 10;
		int num2 = 20;
		
		
		// && (�� ��) �� ���� ��� ���� ��쿡�� ����� ���� ���Դϴ�
		boolean flag1 = ( num1 > 0 ) && ( num2 > 0 ); // true, true
		System.out.println(flag1); // true
		
		boolean flag2 = ( num1 > 0) && ( num2 < 0); // true, false
		System.out.println(flag2); // false
		
		
		// || (�� ��) �� �� �� �ϳ��� �׸� ���̸� ��� ���� ���Դϴ�. �� ���� ��� �����̸� ��� ���� �����Դϴ�
		boolean flag3 = ( num1 < 0 ) || ( num2 > 0 ); // false, true
		System.out.println(flag3); // true

		boolean flag4 = ( num1 > 0 ) || ( num2 > 0 ); // true, true
		System.out.println(flag4); // true
		

		// ! (����) ���� �������Դϴ�. ���ΰ��� �������� �ٲٰ� ������ ���� ������ �ٲߴϴ�
		
		
		
		// �� ���꿡�� ��� ���� ������� �ʴ°��
		
		// �� ���� �� ���� ����� ��� ���� ���� ����� ��
		// -- ���� ���� ����� �����̸� �� ���� ����� ������ ����
		boolean flag5 = ( num1 < 0 ) && ( num2 > 0 ); // false, �� ����
		
		// �� ���� �� ���� ����� ��� ������ ���� ����� ����
		// -- ���� ���� ����� ���̸� �� ���� ����� ������ ����
		boolean flag6 = ( num1 > 0 ) || ( num2 > 0 ); // true, �򰡾���
		
	
	} // end of main
	
} // end of class
