package Ch03;

public class instance {
	// 인스턴스(instance)
	// 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어놓은 코드 상태 (설계도면)입니다.
	// 실제 클래스 기반으로 생성된 객체는 각각 다른 멤버 변수 값을 가지게 됩니다.
	// 가령, 학생의 클래스에서 생성된 각각의 인스턴스는 각각 다른 이름, 학번, 학년 등의 값을 가지게 됩니다.
	// new 키워드를 사용하여 인스턴스 생성
	
	// 힙 메모리
	// 생성된 인스턴스는 동적 메모리(heap memory)에 할당됨
	// c, c++언어에서 사용한 동적메모리를 프로그래머가 해체 시켜야함
	// 자바에서 Gabage Collector가 주기적으로 사용하지 않는 메모리를 수거
	// 하나의 클래스로부터 여러 개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됨
	
	// stack에 담기는것은 주소 값
	
	// 참조변수, 참조 값
	
	// 용어정리
	// 객체 : 객체지향 프로그램의 대상, 생성된 인스턴스
	// 클래스 : 객체를 프로그래밍 하기위해 코드로 정의해놓은 상태
	// 인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상태
	// 멤버변수 : 클래스의 속성, 상태, 특성
	// 메서드 : 멤버변수를 이용하여 클래스의 기능을 구현한 함수
	// 참조변수 :  메모리에 생성된 인스턴스를 가르키는 변수
	// Student s1 = new Student();
	// s1 = 참조변수
	// new Student(); = 참조 값
	// 참조 값 : 생성된 인스턴스의 메모리 주소 값
	
	// 함수와 메서드의 차이
	// 메서드는 함수의 일종
	// 함수라는 것은 어떤 기능을 수행하는 것
	// 함수는 독립적으로 수행 가능
	// 메서드는 객체의 동작에 맞게 기능을 수행할 수 있도록 하는 것임
	
}
