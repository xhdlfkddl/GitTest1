package Ch01;

public class Book {
	
	// 멤버변수
	int id;
	String title;
	String author;
	
	// 생성자 멤버변수 3개를 입력받는 생성자를 만들어주세요
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	// 메서드를 만들어주세요
	public void showInfo() {
		System.out.println("책 ID: " + id);
		System.out.println("책 제목: " + title);
		System.out.println("작가: " + author);
		System.out.println();
	}
	
	
}
