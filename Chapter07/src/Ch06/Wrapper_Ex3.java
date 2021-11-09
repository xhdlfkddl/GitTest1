package Ch06;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" --> String 타입으로 변환
		byte b = Byte.parseByte(str); // 문자열을 byte로 변환
		int i = Integer.parseInt(str); // 문자열을 Integer로 변환
		short s = Short.parseShort(str); // 문자열을 short로 변환
		long l = Long.parseLong(str); // 문자열을 long으로 변환

		System.out.println("문자열 byte 값 변환: " + b);
		System.out.println("문자열 int 값 변환: " + i);
		System.out.println("문자열 short 값 변환: " + s);
		System.out.println("문자열 long 값 변환: " + l);
		
		//
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		//
		boolean bool = Boolean.parseBoolean(str3);

		System.out.println("bool = " + bool);
		
		
		// 문제 1
		String str10 = "1001";
		String str11 = "2001";
		
		// str10과 str11을 덧셈
		int i1 = Integer.parseInt(str10);
		int i2 = Integer.parseInt(str11);
		
		System.out.println("1001 + 2001 =" + (i1 + i2));
		
		// str10과 str11을 곱셈
		System.out.println("1001 * 2001 =" + (i1 * i2));
		

	}

}
