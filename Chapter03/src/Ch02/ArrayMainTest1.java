package Ch02;

import java.util.ArrayList;

import Ch01.Book;

public class ArrayMainTest1 {
	
	public static void main(String[] args) {	
	/*
	 ArrayList
	 기존의 배열 선언과 사용 방식은 배열의 길이를 정하고 요소의 개수가 배열의 길이보다 커지면 배열을 재할당하고 복사해야했음
	 배열의 요소를 추가하거나 삭제하면 다른 요소들의 이동에 대한 구현을 해야함
	 ArrayList는 객체 배열을 좀 더 효율적으로 관리하기 위해 자바에서 제공해주는 클래스
	 이미 많은 메서드들이 최적의 알고리즘으로 구현되어있어 각 메서드의 사용방법만 익히면 유용하게 사용할 수 있음 
	 
	 add 요소 하나를 배열에 추가합니다.
	 size 배열에 추가된 요소 전체 개수를 반환합니다,
	 get 배열의 index 위치에 있는 요소 값을 반환합니다
	 remove 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환합니다
	 isEmpty  배렬이 비어있는지 확인합니다.
	 */
	 
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로 코엘료");
		Book book2 = new Book(2, "클러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화 꽃이 피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로 리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발 하라리");
		
		// ArrayList 선언
		
		
		// 데이터를 담을 공간 만들기
		// 주의!! ArrayList는 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다.
		ArrayList<Book> shoppingCart = new ArrayList<>();
		
		// 추가 방법1
		// 데이터 추가하기
		shoppingCart.add(book1); // index 값 = 0
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		shoppingCart.add(book4);
		
		System.out.println(shoppingCart.size());
		
		// 화면에 출력
		// 길이를 가져오는 메서드는 size()
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		
		System.out.println("-------------------------------------");
		
		// 추가방법2
		shoppingCart.add(2, book5); //index값이 2인 곳에 book5를 넣는다
		// 삭제되는 것이 아니라 한 칸씩 밀려 저장됨
		
		// for문 2번째 방법
		// shoppingCart = 배열 = 반복을 돌릴 대상 = 배열의 길이만큼 반복하게 됨
		// 반복한 것이 Book 타입이며 book이라는 이름을 가지는 변수에 담기게 됨
		// 처음부터 단순 반복하는 것은 foreach가 적합
		// 반복 후 가공할 때는 for 문이 적합
		for (Book b : shoppingCart) {
			b.showInfo();
		}
		
		System.out.println("--------------------------------------");
		
		// 삭제하기
		shoppingCart.remove(0); // index 0번째인 데이터를 삭제
		
		//foreach
		for(Book book : shoppingCart) {
			book.showInfo();
		}
		
		System.out.println("--------------------------------------");
		
		// 전체 삭제
		// shoppingCart.clear();
		
		// 수정하기
		// 밀지않고 해당 index값에 있는 데이터를 수정
		shoppingCart.set(2, book1);
		
		for(Book b : shoppingCart) {
			b.showInfo();
		}
		
		// C R U D
		// Create, Read, Update, Delete
		
		
		
	} //
}
