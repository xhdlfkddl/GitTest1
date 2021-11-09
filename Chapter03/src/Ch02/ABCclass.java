package Ch02;

// 누군가가 A라는 클래스를 만들었다고 가정
class A{
	int number1;
	int number2;
	int number3;
}

// A클래스에서 기능을 보강할 것이 있다고 판단, B라는 클래스 생성
class B{
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
}

// A클래스를 상속받는 C라는 클래스 생성(B클래스 처럼 일일이 가져오지 않아도 됨)
class C extends A {
	int number4;
	int number5;
	// number4, 5 만 작성해도 B클래스와 같은 행동을 한 것
	
}

public class ABCclass {
	
	public static void main(String[] args) {
		
	/*
	 상속
	 
	 클래스 상속
	 새로운 클래스를 정의할 때 이미 구현된 클래스를 상속(interface) 받아서 속성이나 기능을 확장하여 클래스를 구현함
	 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할 때 기존 클래스를 상속함
	 
	 상위클래서 A / 하위 클래스 B = A클래스가 B클래스에게 상속한다 = B클래스가 A클래스를 상속받는다
	 
	 상속하는 클래스: 상위클래스, parent class, super class
	 상속받는 클래스 : 하위클래스, child class, subclass
	 
	 상속을 구현하는 경우
	 상위클래스는 하위클래스 보다 더 일반적인 개념과 기능을 가짐
	 하위클래스는 상위 클래스 보다 더 구체적인 개념과 기능을 가짐
	 하위클래스가 상위 클래스의 속성과 기능 확장(extends) 한다는 의미
	 */
		
		C c = new C();
	
	
	
	}
}
