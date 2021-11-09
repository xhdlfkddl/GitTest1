package Ch12;

public class Book {
	
	private int bookId;
	private String title;
	private String author;
	
	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	//toString 메서드 재정의
	@Override
	public String toString() {
		return "[" +bookId + "," + title + "," + author + "]";
	}
	
	// equals 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		// 매개변수 타입이 Book이라면
		if (obj instanceof Book) {
			// 다운캐스팅
			Book tempBook = (Book)obj;
			// 논리적 설계
			if (this.title == tempBook.title 
					&& this.author == tempBook.author) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Book book1= new Book(1, "데미안", "최익현");
		System.out.println(book1); // toString을 재정의하지 않았다면 주소값이 나옴
		
		
	} // end of main
	
}
