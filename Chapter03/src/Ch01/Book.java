package Ch01;

public class Book {
	
	// �������
	int id;
	String title;
	String author;
	
	// ������ ������� 3���� �Է¹޴� �����ڸ� ������ּ���
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	// �޼��带 ������ּ���
	public void showInfo() {
		System.out.println("å ID: " + id);
		System.out.println("å ����: " + title);
		System.out.println("�۰�: " + author);
		System.out.println();
	}
	
	
}
