package Ch01;

public class CharacterTest {
	public static void main(String[] args) {
		
		char ch1 = 'A'; // ���� �� 65�� ����Ǿ�����
		System.out.println(ch1); // ���ڵ� �Ǿ� A�� ��µ�
		System.out.println((int)ch1); // ���ڵ� �Ǳ� ���� �� = 65�� ��µ�
		
		char ch2 = 66; // 'A' , 'C'
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((int)ch3);
		
		// ������ �� - ������ ���� �Ұ���
//		char ch4 = -68;
		
		// ����
		// 1. ��, ��, ��, ��, ��  --> ���� �������� ���ΰ���?
		char a1 = '��';
		char a2 = '��';
		char a3 = '��';
		char a4 = '��';
		char a5 = '��';
		
		// ��� 1
		System.out.println("�ȳ��ϼ��� ��������?");
		System.out.println((int)a1);
		System.out.println((int)a2);
		System.out.println((int)a3);
		System.out.println((int)a4);
		System.out.println((int)a5);
		
		// ��� 2
		System.out.println((int)'��');
		System.out.println((int)'��');
		System.out.println((int)'��');
		System.out.println((int)'��');
		System.out.println((int)'��');
		
	} // end of main
	
} // end of class
