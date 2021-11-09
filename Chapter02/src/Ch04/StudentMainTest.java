package Ch04;

public class StudentMainTest {
	
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 생성자는 모양을 맞춰주어야 함
		Student s1 = new Student(23, "최익현", 3);
		
		System.out.println(s1.number); // 23
		System.out.println(s1.name); // 최익현
		System.out.println(s1.grade); // 3
		
		s1.showInfo(); // 학생의 학번은 23입니다.
		
		System.out.println("=================");
		
		// 기본 생성자로 객체 생성해보기
		Student s2 = new Student();
		
		s2.number = 20;
		s2.name = "최형배";
		s2.grade = 1;
		
		System.out.println(s2.number);
		System.out.println(s2.name); 
		System.out.println(s2.grade); 
		
		
		
	} // end of main
	
} // end of class
