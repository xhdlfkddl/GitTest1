package Ch10;

public interface Calc {
	
	// static final ����
	double IP = 3.14;
	int ERROR = -99999;
	
	// �߻�޼���
	// body�� ���� ���� �ϴ� ��
	// return int
	// add, �Ű����� num1, num2 ���ϱ�
	int add(int num1, int num2);
	
	//substract, �Ű����� num1, num2 ����
	int substract(int num1, int num2);
	
	// times �Ű����� num1, num2 ���ϱ�
	int times(int num1, int num2);
	
	// divide �Ű����� num1, num2 ������
	int divide(int num1, int num2);
	
	// void showInfo
	void showInfo();
	
	
}
