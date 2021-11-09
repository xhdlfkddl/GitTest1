package Ch02;

import java.util.Scanner;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		MyComponents mc = new MyComponents();
		
		System.out.println("글자를 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
		
		mc.textField.setText(userInput);
		
		
		
	}
}
