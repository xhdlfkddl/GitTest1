package Ch05;

public class WhileMainTest3 {
	public static void main(String[] args) {
		
		// do while��
		// ���ǰ� ������� �ѹ��� ���๮�� �����Ѵ�
		// while���� ������ ���� üũ�ϰ� �ݺ� ������ �ȴٸ�, do while�� ���ǰ� �������
		// ������ �ѹ� �ϰ��� ������ üũ��
		// do{
		//		���๮ - ������ ����
		// } while (���ǹ�);
		
		int input = 10;
		int sum = 0;
		
		do {
			System.out.println("���簪: " + input);
			sum += input;
			input--;
			
		} while(input != 0);
		System.out.println("������ �����: " + sum + " �Դϴ�");
		
		
	} //end of main
} // end of class
