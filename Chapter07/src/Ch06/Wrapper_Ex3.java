package Ch06;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" --> String Ÿ������ ��ȯ
		byte b = Byte.parseByte(str); // ���ڿ��� byte�� ��ȯ
		int i = Integer.parseInt(str); // ���ڿ��� Integer�� ��ȯ
		short s = Short.parseShort(str); // ���ڿ��� short�� ��ȯ
		long l = Long.parseLong(str); // ���ڿ��� long���� ��ȯ

		System.out.println("���ڿ� byte �� ��ȯ: " + b);
		System.out.println("���ڿ� int �� ��ȯ: " + i);
		System.out.println("���ڿ� short �� ��ȯ: " + s);
		System.out.println("���ڿ� long �� ��ȯ: " + l);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		//
		boolean bool = Boolean.parseBoolean(str3);

		System.out.println("bool = " + bool);
		
		
		// ���� 1
		String str10 = "1001";
		String str11 = "2001";
		
		// str10�� str11�� ����
		int i1 = Integer.parseInt(str10);
		int i2 = Integer.parseInt(str11);
		
		System.out.println("1001 + 2001 =" + (i1 + i2));
		
		// str10�� str11�� ����
		System.out.println("1001 * 2001 =" + (i1 * i2));
		

	}

}
