package Ch09;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		NumberPrinter numberprinter1 = new NumberPrinter(1);
		NumberPrinter numberprinter2 = new NumberPrinter(2);
		NumberPrinter numberprinter3 = new NumberPrinter(3);
		
		//
		numberprinter3.printWaitNum(); // 1
		numberprinter3.printWaitNum(); // 2
		numberprinter3.printWaitNum(); // 3
		
		System.out.println("=====================");
		// 
		numberprinter1.printWaitNum();
		numberprinter1.printWaitNum();
		numberprinter1.printWaitNum();
		
		System.out.println("=====================");
		//
		numberprinter2.printWaitNum();
		numberprinter2.printWaitNum();
		numberprinter2.printWaitNum();
		
		
	} // end of main
} // end of class
