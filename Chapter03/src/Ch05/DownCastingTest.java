package Ch05;

public class DownCastingTest {

	public static void main(String[] args) {
		
		//1. �ٳ����� origin ��������� �߰�
		
		// ��ĳ����
		Fruit fruit = new Banana();
		
		//fruit.origin; -> �ȵǴ� ��Ȳ -> �ذ��� = �ٿ�ĳ����
		// �ٿ�ĳ����: �����Ϸ����� �ڽ� ��ü Ÿ������ �ٶ󺸶�� ���
		
		// ������ Ÿ��
		// ��谡 �˾Ƶ��� �� �ֵ��� 0101�� ����� ���� 
		// �����Ϸ��� �θ�Ÿ�� �ν��Ͻ� ���� Ÿ���� �ٶ󺸰� �ִ� ����
		// ��ü�� �ٳ����� �����Ǿ����� �����Ϸ��� fruit�� �ٶ󺸰� �ִ� ��
		
		// �ٳ����� �ٶ󺸰� ����
		String origin = ((Banana)fruit).origin;
		System.out.println("������: " + origin);
		
		//��Ÿ��
		
		
	}// end of main

}// end of class
