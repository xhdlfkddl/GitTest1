package Ch11;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer 활용
		// 내부적으로 가변적인 char[]를 멤버변수로 가짐
		// 문자열을 여러변 연결하거나 변경할 때 사용하면 유용함
		// StringBuffer는 멀티스레드 프로그래밍에서 동기화를 보장함
		// 단일 스레드 프로그램에서는 StringBuilder를 사용하길 권장
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(java));
		System.out.println("===================");
		
		builder.append(android);
		System.out.println(builder);
		// 위와 같은 주소값
		System.out.println(System.identityHashCode(java));
		System.out.println("===================");
		
		// 문제1. append 메서드 사용 3개 주소값 확인
		builder.append("apple");
		System.out.println(builder);
		builder.append("banana");
		System.out.println(builder);
		builder.append("crayon");
		System.out.println(builder);
		System.out.println(System.identityHashCode(java));
		System.out.println("===================");
		
		// 문제 2
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		
	}// end of main

}// end of class
