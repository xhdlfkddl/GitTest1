package Ch12;

// ���� ����ϴ� �⺻ Ŭ�������� ���� ��Ű��
import java.lang.*;

class Student {
	
	@Override
	public String toString() {
		return "�л�Ŭ����";
	}
	
}

public class ObjectTest extends Object {
	String str1;
	
	public static void main(String[] args) {
		
		/*
		 object Ŭ���� - ��� Ŭ������ �ֻ��� Ŭ����
		 
		 java.lang ��Ű��
		 ���α׷��ֽ� import���� �ʾƵ� �ڵ����� import��
		 ���� ����ϴ� �⺻ Ŭ�������� ���� ��Ű��
		 ex) String, System...
		 
		 ��� Ŭ������ Object Ŭ������ ��ӹ޴´�
		 java.lang.Object Ŭ����
		 ��� Ŭ������ �ֻ��� Ŭ������
		 ��� Ŭ������ Object���� ��ӹް�, Object Ŭ������ �޼��� �� �Ϻδ� �������Ͽ� ����� �� ����
		 �����Ϸ��� extends Object�� �߰���
		 class Student -> calss Student extends Object
		 
		 toString()�ż���
		 ��ü�� ������ String���� �ٲ� ����� �� ����
		 ���� ����ϴ� String�� �̹� ������ �Ǿ�����
		 */
		
		Student s1 = new Student();
		System.out.println(s1); // toString ������ �� -> "�л�Ŭ����"
		String str1 = new String("�ȳ�ȳ�");
		System.out.println(str1);
		
		
	} // end of main

} // end of class
