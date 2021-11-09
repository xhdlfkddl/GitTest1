package Ch12;

public class MainTest1 {
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "데미안", "헤르만 헤세");
		Book book2 = new Book(2, "데미안", "헤르만 헤세");
		
		System.out.println(book1 == book2);
		
		boolean result = "a".equals("a");
		System.out.println(result);
		System.out.println("a" == "a");
		
		// equals 메서드를 재정의했음 (book 클래스 안에서)
		// 원래 equals 메서드는 주소값을 비교하는 것
		if (book1.equals(book2)) {
			System.out.println("같은 책입니다.");
		} else {
			System.out.println("다른 책입니다.");
		}
	}
}
