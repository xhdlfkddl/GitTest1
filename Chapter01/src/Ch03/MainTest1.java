package Ch03;

public class MainTest1 {
	
	// �����Լ�
	public static void main(String[] args) {
		
		// �װ� ������
		// ��(operand) : ���꿡 ���Ǵ� �� 2*3 ���� 2�� 3�� ����
		// ������(operator) : ���� �̿��Ͽ� �����ϴ� ��ȣ *
		
		// ���� ������ (assignment operator, "=") 
		// ������ �ٸ� ������ ���� �����ϴ� ������
		// ���� ������ �� �켱 ������ ���� ���� �����ڵ�
		// ���� ���� = ������ ���� (���� �Ǵ� ��, ��)
		
		// ���� ������ ���� (�����ʿ��� ��������)
		// int a = 10;  10�̶�� ���� a�� ����
		
		int number = 10;
		// = (���б�ȣ�ʹ� �޸� ������ ���� �����ϴ� �������Դϴ�.)
		// ������ ������ �����ʿ��� �������� ������ �˴ϴ�
		
		int number2 = number;
		// ������ ������ ������ ���� �ֽ��ϴ�
		
		System.out.println(number);
		System.out.println(number2);
		
		System.out.println("========================");
		
		// ��ȣ ������ ( +, - )
		// ���� ������
		// ������ ��ȣ�� �����ϰų�(+) �ٲ�(-)
		// ��ȣ�� �����ϴ� ������
		// �� ������ ����ִ� ���� ���� ������ ���´� �ƴ�
		System.out.println(-number);
		System.out.println("number�� ���� ��: " + number);
		
		// ���� ������ ��ȣ�� �����Ϸ��� ���� �����ڸ� ����ؾ���
		number  = -number;
		System.out.println(number);
		
	} // end of main
	
} // end of class
