package Ch05;

public class MainTest3 {
	public static void main(String[] args) {
		//다형성 : 배열(자료구조)관계에서도 사용가능
		//하나의 변수에 연관된 데이터를 통으로 관리하기 위해 사용
		
		//1. 바나나
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();
		
		// 바나나 타입의 변수를 2개 담을 수 있는 배열 생성
		Banana[] bananaBucket = new Banana[2];
		bananaBucket[0] = banana1;
		bananaBucket[1] = banana2;
		
		//for each 문을 사용 showInfo를 출력
		for(Banana bana : bananaBucket) {
			bana.showInfo();
		}
		
		//2. 복숭아
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		
		Peach[] peachBucket = new Peach[2];
		peachBucket[0] = peach1;
		peachBucket[1] = peach2;
		
		for(Peach peach : peachBucket) {
			peach.showInfo();
		}
		
		//3. 다형성을 사용
		Fruit[] fruitBucket = new Fruit[4];
		fruitBucket[0] = banana1;
		fruitBucket[1] = banana2;
		fruitBucket[2] = peach1;
		fruitBucket[3] = peach2;
		
		for(Fruit fruit : fruitBucket) {
			fruit.showInfo();
		}
		
	}
}
