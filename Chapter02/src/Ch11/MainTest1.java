package Ch11;

import java.util.Calendar;

public class MainTest1 {
	public static void main(String[] args) {
		
		//Company ��ü�� �����غ�����(5��)
		// �����ڰ� private�̶� �Ұ��� ��
//		Company company = new Company();
		Company co1 = Company.getInstance(); // = new Company(); �ּҰ�
		Company co2 = Company.getInstance();
		Company co3 = Company.getInstance();
		Company co4 = Company.getInstance();
		Company co5 = Company.getInstance();
		
		
		// ȭ�鿡 �ּҰ��� ����غ�����
		// .getInstance�� ������ ������ �ᱹ new Company�� �� �� �ѰͰ� ����
		// ���� new��� �ؼ� �޸� ���� ���̱� ����
		System.out.println(co1);
		System.out.println(co2);
		System.out.println(co3);
		System.out.println(co4);
		System.out.println(co5);
		
		// �̱��� �����̶� new�� ������������
		// ����: 
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		
		
	}
	
}
