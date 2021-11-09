package Ch01;

public class WarriorMainTest {
	
	
	// 설계된 클래스를 사용하는 쪽 코딩
	public static void main(String[] args) {
		
		// 메인 메소드 안의 변수는 '지역변수'라고 함
		int height;
		
		// new 라는 영역을 사용해야 메모리에 등록되어 실존하는 데이터가 됨
		// 이제야 '객체'가 된 것 = instance
		// 실제 값이 담긴 것이 아닌 '주소값'이 생성된것
		Warrior w1 = new Warrior();
		
		w1.height 	= 200;
		w1.power 	= 100;
		w1.name 	= "전사1";
		w1.color 	= "초록색";
		
		System.out.println(w1.height);
		System.out.println(w1.power);
		System.out.println(w1.name);
		System.out.println(w1.color);
		System.out.println();
		
		Warrior w2 = new Warrior();
		
		w2.height	= 100;
		w2.power	= 50;
		w2.name	= "작은전사1";
		w2.color	= "빨간색";
		
		System.out.println(w2.height);
		System.out.println(w2.power);
		System.out.println(w2.name);
		System.out.println(w2.color);
		System.out.println();
		
		
		
		
		
		
	} //end of main
	
} // end of class
