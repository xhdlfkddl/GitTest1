package Ch02;

public class TypeConversion_02 {
	
	// �����Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		// �������� ����ȯ�̶�?
		// ���� �ٸ� �ڷ��� ���� ���� ���� ������ ���� �ϳ��� �ڷ������� �����ϴ� ��
		// int �ڷ����� double�� �����ϰų� 
		// double �ڷ����� int�� �����ϴ� ���� ����
		
		int iNum1 = 100;
		System.out.println(iNum1); // 100 ���
		
		// �ڵ� ����ȯ (������ ����ȯ)
		// ����Ʈ ũ�Ⱑ ���� �ڷ������� ū �ڷ������� ����ȯ�� �ڵ����� �̷�� �� 
		double dNum1 = iNum1;
		System.out.println(dNum1); // 100.0 ���
		
		// ���� ����ȯ (����� ����ȯ)
		double dNumber = 1.12345;
		//	int iNumber = dNumber; 
		// Type Mismatch �����߻�
		// int�� 4����Ʈ double�� 8����Ʈ
		// ���� ���� 8����Ʈ�� 4����Ʈ ũ�⿡ �������� �ϴ� ������ �����Ͽ� ������ �߻�
		
		// �����ڰ� �����Ϸ����� ������ �ְ� �ϴ� ���
		int iNumber = (int)dNumber;
		System.out.println(iNumber); // 1�� ��� (������ �ս��� �Ͼ)
		
		// ����
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		
		System.out.println(aValue);
		System.out.println(bValue);
		
		
	} // end of main
	
} // end of class
