package Ch11;

public class StrnigTest1 {
	
	public static void main(String[] args) {
	
		// String ������
		
		// heap �޸𸮿� �ν��Ͻ��� �����Ǵ� ���
		String str1 = new String("ABC");
		
		// data, static, constant pool ������ ��ġ�Ѵ�.
		String str2 = "ABC";
		// -> �޸𸮿� �ö󰡴� ��ġ�� �ٸ���.
		
		String str3 = "ABC";
		
		// �Ȱ��� ABC�������� ��ġ�ϴ� ��(�ּҰ�)�� �ٸ��� ������
		System.out.println(str1 == str2); // false
		System.out.println("=================");
		
		System.out.println(str2 == str3); // true
		System.out.println("=================");
		
		// ���� �ٸ� �ּҰ��̱� ����
		String str4 = new String("ABC");
		String str5 = new String("ABC");
		
		System.out.println(str4 == str5);
		System.out.println("=================");
		
		String str6 = "ABC";
		String str7 = "ABC";
		
		System.out.println(str6 == str7);
		
		// ���
		// �� �޸𸮴� ������ �� ���� �ٸ� �ּҰ��� ��������,
		// ��� Ǯ(constant pool)�� ������ ���ڿ��� ��� ���� �ּҰ��� ������.(���� ���ڿ��� ���)
		
		
	} // end of main
	
} // end of class
