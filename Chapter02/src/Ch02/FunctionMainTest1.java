package Ch02;

public class FunctionMainTest1 {
	public static void main(String[] args) {
		
		// �Լ���? (function)
		// �ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�
		// ������(���ǵ�) �Լ��� ȣ���Ͽ� ����ϰ� ȣ��� �Լ��� ����� ������ ��� ��ȯ��
		// �Լ��� ������ �ϳ��� ����� ���� ������ ������ ������� ȣ��Ǿ� ���� �� ����
		
		// �Լ� �����ϱ�
		// �Լ��� �̸�, �Ű� ����, ��ȯ ��, �Լ� ��ü(body)�� ������
		// �Լ��� ����� �Ϸ�Ǹ� return�� ����Ͽ� ����� ��ȯ��
		// ����� ��ȯ���� �ʴ´ٸ�(return ���� ���ٸ�) void�� �����
		
		// �Լ� ��� ��� (��� ���߱�)
		// ������ �Լ��� �̸��� ���� ��ȣ�� �������
		// ��ȣ �ȿ��� input(�Ű�����)���� ���� �� ����
		// return ������ Ÿ�԰� �°� ������ ����
		int addResult1 = add(1,2);
		System.out.println(addResult1);
		
		int addResult2 = add(23,45);
		System.out.println(addResult2);
		
		
		
		
	} // end of main
	
	// add �Լ��� ����
	// �̰��� int�� return Ÿ����
	public static int add(int num1, int num2) {
		
		// �Լ� �ȿ��� ����ϴ� ������ ��������
		int result;
		
		// result ��� ���������� ������ ���
		result = num1 + num2;
		
		// ���� Ű���带 ������ �� ������ ������� ��ȯ�Ѵ�.
		return result;
	}
	
} // end of class
