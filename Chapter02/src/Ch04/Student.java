package Ch04;

public class Student {
	
	// 생성자 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들어라고 지시하는 것 (강제성이 부여됨)
	
	
	// 멤버변수
	int number;
	String name;
	int grade;

	// 기본생성자 (default constructor)
	// 사용자 정의 생성자가 없는 경우 컴파일러가 알아서 기본생성자를 만들어 줌
	public Student() {
		
	}
	
	// 생성자 만들기 (개발자가 직접 정의 -> 사용자 정의 생성자)
	// 괄호안에 매개변수를 넣어줄 수 있음
	public Student(int num, String name, int grade) {
		number = num;
		// 매개변수 이름과 멤버 변수 이름이 같아면 this. 키워드를 사용하여 구분해주어야함
		// this = 자기자신
		// 매개변수 name이 들어와서 멤버변수의 name에 설정된 것
		this.name = name;
		this.grade = grade;
	}
	
	// 매서드 정의
	public void showInfo() {
		System.out.println(
				name + "학생의 학번은 " + number + "입니다."
				// "\n" = 줄바꿈
						+"\n학년은 "+ grade + "학년입니다." );
	}
	
}
