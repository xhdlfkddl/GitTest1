package Ch03;

public class TExtendsClass {
	
	public static void main(String[] args) {
		
		//<T extends 클래스> 사용하기
		// T 자료형의 범위를 제한할 수 있음
		// 제한하지않으면 자료형으로 아무 클래스나 올 수 있음
		
		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		System.out.println("-------------------------");
		
		// Water는 Material을 상속받지 않았기 때문에 사용불가
		// GenericPrinter2<Water> printer2 = new GenericPrinter2<Water>();
		
	}
	
}
