package Ch03;

import Ch02.Plastic;
import Ch02.Powder;

public class GenericPrinterTest {
	
	public static void main(String[] args) {
		
		//���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// ����� �� �ڷ����� �־��ָ� �˴ϴ�.
		// �����: T ��� ����� �� � �ڷ����� ������� �������ָ� �ȴ�.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		
		// ���ֱ�
		genericPrinter1.setMaterial(powder);
		
		// ��� ������
		Powder tempPowder = genericPrinter1.getMaterial();
		System.out.println(tempPowder);
		
		System.out.println("-----------------------------");
		
		// ���� 1. �ö�ƽ���� ���׸� Ŭ������ ����, ��� ���� �� ��Ḧ �������ô�.
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		genericPrinter2.setMaterial(plastic);
		Plastic tempPlastic = genericPrinter2.getMaterial();
		System.out.println(tempPlastic);
		
		System.out.println("-----------------------------");

		//GenericPrinter toString();
		System.out.println(genericPrinter1);
		System.out.println(genericPrinter2);
		
	}
	
}
