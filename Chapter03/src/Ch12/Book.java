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
	
	//toString �޼��� ������
	@Override
	public String toString() {
		return "[" +bookId + "," + title + "," + author + "]";
	}
	
	// equals �޼��� ������
	@Override
	public boolean equals(Object obj) {
		// �Ű����� Ÿ���� Book�̶��
		if (obj instanceof Book) {
			// �ٿ�ĳ����
			Book tempBook = (Book)obj;
			// ���� ����
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
		
		Book book1= new Book(1, "���̾�", "������");
		System.out.println(book1); // toString�� ���������� �ʾҴٸ� �ּҰ��� ����
		
		
	} // end of main
	
}
