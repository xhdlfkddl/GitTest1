package Ch03;

public class TExtendsClass {
	
	public static void main(String[] args) {
		
		//<T extends Ŭ����> ����ϱ�
		// T �ڷ����� ������ ������ �� ����
		// �������������� �ڷ������� �ƹ� Ŭ������ �� �� ����
		
		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		System.out.println("-------------------------");
		
		// Water�� Material�� ��ӹ��� �ʾұ� ������ ���Ұ�
		// GenericPrinter2<Water> printer2 = new GenericPrinter2<Water>();
		
	}
	
}
