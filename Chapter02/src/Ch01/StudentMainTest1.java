package Ch01;

// 설계된 학생 클래스를 사용해보는 입장
public class StudentMainTest1 {
	
	// 메인함수(코드의 시작점)
	public static void main(String[] args) {
		
		// 참조 타입을 선언합니다.
		Student s1;
		Student s2;
		
		// 초기화합니다. (heap에 존재하는 상태입니다)
		// instance가 된 상태
		// heap 메모리에 객체를 생성한 뒤 주소값을 s1, s2에 담은 형태 
		s1 = new Student();
		s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
	} // end of main
	
} // end of class
