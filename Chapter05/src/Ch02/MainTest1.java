package Ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 1. threeDPrinter -> ��ü����
		// setter �޼��带 ����� �� Powder
		
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial());
		
		System.out.println("---------------------------------");
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		
		System.out.println("---------------------------------");
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		printer3.setMaterial(powder);
		System.out.println(printer3.getMaterial());
				
		// ������ ThreeDPrinter3�� ��Ḧ �������ּ���
		Powder temp1 = (Powder)printer3.getMaterial();
		
		// ����
		System.out.println(printer3); // �ּҰ� -> toString�� ������ �ϸ� �ش� String ���� ����
		
	}
	
}
