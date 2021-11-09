package Ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {
	
	public static void main(String[] args) {

		//
		FileInputStream fis;
		
		try {
			//FileNotFoundException�� �߻��� �� �ֽ��ϴ�.
			fis = new FileInputStream("a.txt");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			
		// Exception�� ���� ó�� �� �ֻ��� Ŭ������
		} catch (Exception e) { 
			System.out.println("����ó��");
			return; // return���� �־ finally�� �����, finally �ϴ��� ��ɹ��� �����������
		// try���� ����Ǹ� �ݵ�� �����
		} finally {
			System.out.println("�ݵ�� ����˴ϴ�.");
		}
		
		System.out.println("������ ���ᰡ �����ʾҽ��ϴ�.");
		
	} // end of main
	
} // end of class
