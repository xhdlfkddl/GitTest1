package Ch11;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		// 한 번 생성된 String은 불변(immutable)
		
		// String을 연결하면 기존의 String에 연결되는 것이 아니고
		// 새로운 문자열이 생성되는 것
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		// String 타입 변수가 담긴 heap 메모리의 주소
		System.out.println(System.identityHashCode(java));// 366712642
		
		// java = java + android;
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));// 1829164700
		
	}// end of main
	
}// end of class
