package Ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로 코엘료");
		Book book2 = new Book(2, "클러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화 꽃이 피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로 리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발 하라리");
		
		// 문제
		// 1. 배열을 이용하여 shoppingCart 변수에 객체를 담아봅시다.
		Book[] shoppingCart = new Book[5];
		
		// 2. 사고싶은 책을 장바구니에 담아봅시다.(3개)
		shoppingCart[0] = book2;
		shoppingCart[1] = book1;
		shoppingCart[2] = book4;
		
		// 3. 장바구니에 담은 정보를 화면에 출력해봅시다.
		/*
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		*/
		
		// 4. 수정
		shoppingCart[0] = book5;
		
		// 5. 인덱스 1번째에 book3
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;
		// 베열에 추가하려면 직접 인덱스 연산을 처리해야함
		
		
		// 삭제 -> 베열에 담겨있는 값을 제거
		// 3번째 인덱스를 지워주세요
		shoppingCart[3] = null;
		
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		
		
	} //end of main
	
} // end of class
