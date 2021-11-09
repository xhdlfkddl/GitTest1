package Ch02;

public class FunctionMainTest2 {
	public static void main(String[] args) {
		
		// �Լ� ����ϴ� ���(��� ���߱�)
		int num1 = 10;
		int num2 = 20;
		
		double total = addNum(42.123, 10.5);
		System.out.println("total: " + total); // total: 52.623
		
		sayHello("�ȳ��ϼ���?"); // �ȳ��ϼ���?
		
		// �Ű������� ���� �Լ��̱� ������ ��ȣ �ȿ� �ƹ��͵� ������ �ȵ�
		int sum  = calcSum();
		System.out.println("sum: " + sum); // sum: 5050
		
		int intAddResult = intAdd(1, 2, 3);
		System.out.println(intAddResult);
		
		double doubleAddResult = doubleAdd(3.14, 4.14);
		System.out.println(doubleAddResult);
		
		String article = "����";
		printArticle(article);
		
	} // end of main
	
	// 1. ��ȯ ���� ���� �Լ� �����ϱ�
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 2. �Ű������� ���� �Լ� ����� -> ��ȯ�� ����
	public static int calcSum() {
		
		// ��������(���������� �����ϴ� ����) ����/�ʱ�ȭ
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
		} // end of for
		return sum;
		
	} // end of calcSum
	
	// 3. ��ȯ���� �����ϸ鼭 �Ű������� �޴� �Լ� �����
	public static double addNum(double n1, double n2) {
		
		double result = 0.0;
		result = n1 + n2;
		
		return result;
	}
	
	// �Լ��� ����� ���ô�
	// 1. return�� int, �Ű����� n1, n2, n3 �̸� -> intAdd
	public static int intAdd(int n1, int n2, int n3) {
		int intAddResut;
		
		intAddResut = n1 + n2 + n3;
		
		return intAddResut;
	}
	
	// 2. return�� double, �Ű����� d1, d2 �̸�-> doubleAdd
	public static double doubleAdd(double d1, double d2) {
		double doubleAddResult;
		
		doubleAddResult = d1 + d2;
		
		return doubleAddResult;
	}
	
	// 3. return�� ����, �Ű����� String article �̸� -> printArticle
	public static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	
} // end of class
