package Ch04;

public class IfMainTest {
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		
		// ���ǹ� = ���
		// �־��� ���ǿ� ���� �ٸ� ������ �̷�������� ����
		
//		boolean flag = true;
		boolean flag = false;
		
		// if �� �ܵ� �����
		// if(���ǽ�){���๮}
		// ���ǽ��� '��'�� ��쿡 ���๮�� �����
		// ���ǽ��� '��'�� �ƴϸ� ���๮�� �����������

		if (flag) {
			System.out.println("���ǽ� ����� true�̸� ����˴ϴ�");
		} // end of if
		
		// if else ��
		// if(���ǹ�){���๮}  ������ ���϶� ���๮�� �����
		// else(���ǹ�){���๮} if ������ ���� �ƴϰ� else ������ ���� �� ���๮�� �����
		
		if (flag) {
			System.out.println("ture�̸� ����");
		} else {
			System.out.println("false�̸� ����");
		}
		
		// if - else if - else
		// if(���ǽ�1) { ���๮1 }
		// ���ǽ�1�� '��'�� ��� �����ϰ� ��ü ���ǹ��� ��������
		// else if(���ǽ�2) { ���๮2 }
		// ���ǽ�2�� '��'�� ��� �����ϰ� ��ü ���ǹ��� ��������
		// else { ���๮3 }
		// �� ������ ��� �ش���� �ʴ� ��� ����� (����Ʈ ����)
		// ���๮4;            
		// if-else if-else ���� ������ �����
		// ���� ���ǽ�2�� �����Ǹ� ���๮2 -> ���๮4  ������ �����
		
//		int point = 70;
		int point = 40;
		
		if (point >= 90) {
			System.out.println("A�����Դϴ�");
		} else if (point >= 80) {
			System.out.println("B�����Դϴ�");
		} else if (point >= 70) {
			System.out.println("C�����Դϴ�");
		} else if (point >= 60) {
			System.out.println("D�����Դϴ�");
		} else {
			System.out.println("F�����Դϴ�");
		}
		

		
	} // end of main
	
} // end of class
