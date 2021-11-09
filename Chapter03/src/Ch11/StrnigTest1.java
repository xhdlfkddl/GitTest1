package Ch11;

public class StrnigTest1 {
	
	public static void main(String[] args) {
	
		// String 선언방식
		
		// heap 메모리에 인스턴스로 생성되는 경우
		String str1 = new String("ABC");
		
		// data, static, constant pool 영역에 위치한다.
		String str2 = "ABC";
		// -> 메모리에 올라가는 위치가 다르다.
		
		String str3 = "ABC";
		
		// 똑같은 ABC값이지만 위치하는 곳(주소값)이 다르기 때문에
		System.out.println(str1 == str2); // false
		System.out.println("=================");
		
		System.out.println(str2 == str3); // true
		System.out.println("=================");
		
		// 각자 다른 주소값이기 때문
		String str4 = new String("ABC");
		String str5 = new String("ABC");
		
		System.out.println(str4 == str5);
		System.out.println("=================");
		
		String str6 = "ABC";
		String str7 = "ABC";
		
		System.out.println(str6 == str7);
		
		// 결론
		// 힙 메모리는 생성될 때 마다 다른 주소값을 가지지만,
		// 상수 풀(constant pool)에 생성된 문자열은 모두 같은 주소값을 가진다.(같은 문자열일 경우)
		
		
	} // end of main
	
} // end of class
