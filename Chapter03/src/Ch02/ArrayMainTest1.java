package Ch02;

import java.util.ArrayList;

import Ch01.Book;

public class ArrayMainTest1 {
	
	public static void main(String[] args) {	
	/*
	 ArrayList
	 ������ �迭 ����� ��� ����� �迭�� ���̸� ���ϰ� ����� ������ �迭�� ���̺��� Ŀ���� �迭�� ���Ҵ��ϰ� �����ؾ�����
	 �迭�� ��Ҹ� �߰��ϰų� �����ϸ� �ٸ� ��ҵ��� �̵��� ���� ������ �ؾ���
	 ArrayList�� ��ü �迭�� �� �� ȿ�������� �����ϱ� ���� �ڹٿ��� �������ִ� Ŭ����
	 �̹� ���� �޼������ ������ �˰������� �����Ǿ��־� �� �޼����� ������� ������ �����ϰ� ����� �� ���� 
	 
	 add ��� �ϳ��� �迭�� �߰��մϴ�.
	 size �迭�� �߰��� ��� ��ü ������ ��ȯ�մϴ�,
	 get �迭�� index ��ġ�� �ִ� ��� ���� ��ȯ�մϴ�
	 remove �迭�� index ��ġ�� �ִ� ��� ���� �����ϰ� �� ���� ��ȯ�մϴ�
	 isEmpty  ����� ����ִ��� Ȯ���մϴ�.
	 */
	 
		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ�� �ڿ���");
		Book book2 = new Book(2, "Ŭ����UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ ���� �Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������� �����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "���� �϶�");
		
		// ArrayList ����
		
		
		// �����͸� ���� ���� �����
		// ����!! ArrayList�� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<Book> shoppingCart = new ArrayList<>();
		
		// �߰� ���1
		// ������ �߰��ϱ�
		shoppingCart.add(book1); // index �� = 0
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		shoppingCart.add(book4);
		
		System.out.println(shoppingCart.size());
		
		// ȭ�鿡 ���
		// ���̸� �������� �޼���� size()
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		
		System.out.println("-------------------------------------");
		
		// �߰����2
		shoppingCart.add(2, book5); //index���� 2�� ���� book5�� �ִ´�
		// �����Ǵ� ���� �ƴ϶� �� ĭ�� �з� �����
		
		// for�� 2��° ���
		// shoppingCart = �迭 = �ݺ��� ���� ��� = �迭�� ���̸�ŭ �ݺ��ϰ� ��
		// �ݺ��� ���� Book Ÿ���̸� book�̶�� �̸��� ������ ������ ���� ��
		// ó������ �ܼ� �ݺ��ϴ� ���� foreach�� ����
		// �ݺ� �� ������ ���� for ���� ����
		for (Book b : shoppingCart) {
			b.showInfo();
		}
		
		System.out.println("--------------------------------------");
		
		// �����ϱ�
		shoppingCart.remove(0); // index 0��°�� �����͸� ����
		
		//foreach
		for(Book book : shoppingCart) {
			book.showInfo();
		}
		
		System.out.println("--------------------------------------");
		
		// ��ü ����
		// shoppingCart.clear();
		
		// �����ϱ�
		// �����ʰ� �ش� index���� �ִ� �����͸� ����
		shoppingCart.set(2, book1);
		
		for(Book b : shoppingCart) {
			b.showInfo();
		}
		
		// C R U D
		// Create, Read, Update, Delete
		
		
		
	} //
}
