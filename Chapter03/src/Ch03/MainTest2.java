package Ch03;

class Cal{
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int multyply(int n1, int n2) {
		return n1 *n2;
	}
}

class Cal2 extends Cal{
	
	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	/*
	// override (�θ� �ִ� �޼��带 �ʿ信 ���� �������Ͽ� ����ϴ� ����)
	// Cal1���� �������� ���ϱ� ������ �����Ͽ� �Է°��� 0�̶�� 
	// ȭ�鿡 "0�� �Է�����������" ��� �޼����� ��µǵ��� �ϱ�
	// �ڽ� Ŭ�������� �������� �޼��常 ����Ǹ�, �θ� Ŭ������ �޼���� ��� ������
	@Override
	public int multyply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0�� �Է����� ������");
		}
		return n1 * n2;
		
	}
	*/
	
	// �ڵ� �ϼ�
	@Override
	public int multyply(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0�� �Է�����������");
		}
		// this.name = name�� ���
		// super = �θ�Ŭ���� ������ ���� multyply��� �޼��带 �����϶�� ��
		// super�� ��������ʴ´ٸ�
		// ���� multyply�� �ڵ尡 1000���̶�� 1000���� ��� �Ű� �������
		return super.multyply(n1, n2);
	}
	
}

public class MainTest2 {
	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multyply(10, 0));
	}
}
