package Ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ�� �ڿ���");
		Book book2 = new Book(2, "Ŭ����UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ ���� �Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������� �����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "���� �϶�");
		
		// ����
		// 1. �迭�� �̿��Ͽ� shoppingCart ������ ��ü�� ��ƺ��ô�.
		Book[] shoppingCart = new Book[5];
		
		// 2. ������ å�� ��ٱ��Ͽ� ��ƺ��ô�.(3��)
		shoppingCart[0] = book2;
		shoppingCart[1] = book1;
		shoppingCart[2] = book4;
		
		// 3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ����غ��ô�.
		/*
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		*/
		
		// 4. ����
		shoppingCart[0] = book5;
		
		// 5. �ε��� 1��°�� book3
		shoppingCart[0] = book2;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		shoppingCart[3] = book5;
		// ������ �߰��Ϸ��� ���� �ε��� ������ ó���ؾ���
		
		
		// ���� -> ������ ����ִ� ���� ����
		// 3��° �ε����� �����ּ���
		shoppingCart[3] = null;
		
		for (int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
			}
		}
		
		
	} //end of main
	
} // end of class
