package Ch01;

public class ArrayMainTest {
	public static void main(String[] args) {
		

	/*
	 �迭�̶�
	 ������ �����͸� ��Ƽ� ������ �����ϱ� ���ؼ� ����ϴ� ������ Ÿ���Դϴ�
	 ������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� 
	 �迭�� ���� ���� �����͸� �ϳ��� ������ �����ϱ� ���� ���̶�� �� �� �ֽ��ϴ�.
	 
	 ������ �ڷ����� ������ �ڷᱸ��
	 �ε��� ������[]�� �̿��Ͽ� ���� ������ ����
	 ������ ��ġ�� ���� ��ġ�� ����
	 �迭�� ������ 0���� ����
	 �ڹٿ����� ��ü �迭�� ������ ArrayList�� ���� Ȱ����
	 */
	int number = 10;
	
	// �迭 ������
	int[] arr1 = new int[3]; // int Ÿ���� ���� 3���� ���� �� �ִ� ���� ���� ��
	int arr2[] = new int[10]; 
	
	// �迭�� �ʱ�ȭ�ϴ� ���(���� �ִ� ���)
	// 0��° ĭ �ȿ� 33�� �ְڴ�.
	arr1[0] = 33;
	arr1[1] = 10;
	arr1[2] = 11;
	
	// �迭�� ����� ���ÿ� �ʱ�ȭ
	// index ������ ���� n-1�̴�
	// length = 3
	int[] numbers1 = new int[] {11, 20, 30};
	int[] numbers2 = {10, 50, 100};
	
	// ��¹��
	System.out.println(numbers1[0]);
	System.out.println(numbers1[1]);
	System.out.println(numbers1[2]);
	System.out.println(numbers1); // �ּҰ� ���
	
	
	// String Ÿ���� �迭
	String[] strArr = new String[10];
	strArr[0] = "�߽���";
	strArr[1] = "Ƽ��";
	strArr[2] = "�ֽ�";
	strArr[3] = "�ٸ��콺";
	
	// 1. ȭ�鿡 0,1,2,3,4�� ������ּ���. �� for�� ������
//	System.out.println(strArr[0]);
//	System.out.println(strArr[0]);
//	System.out.println(strArr[0]);
//	System.out.println(strArr[0]);
	System.out.println(strArr.length);
	
	// null ���� ������� ������
	for (int i = 0; i < strArr.length; i++) {
		if(strArr[i] != null) {
			System.out.println(strArr[i]);
		}
	}
	
	// ��� ���α׷��� ������ index�� 0���� �����մϴ�
	// �迭�� ����� �� ���� for���� �����Ͽ� ���� ����մϴ�.
	
	// int[] i1 = new int[22]; // length = 22, index = 21
	// int[] i2 = new int[74]; // length = 74, index = 73
			
		
		
	}// end of main
	
} //end of class
