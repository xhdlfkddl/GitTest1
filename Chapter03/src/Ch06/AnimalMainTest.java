package Ch06;

public class AnimalMainTest {
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		
		// ��������� �θ�Ŭ�������� ���캸��
		// �޼���� �ڽ�Ŭ�������� ���캸�� ��
		// human Ŭ�������� move �޼��带 �ּ�ó���� �� �����ϰ� �Ǹ�
		// animal Ŭ�������� �ۼ��� move �޼��尡 �����
		hAnimal.move();
		System.out.println("----------------------");
		tAnimal.move();
		
	}
}
