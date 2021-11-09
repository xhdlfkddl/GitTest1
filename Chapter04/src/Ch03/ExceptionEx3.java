package Ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

class MyException {
	String fileName;
	
	public MyException(String fileName) {
		this.fileName = fileName;
	}
	
	// throws 란
	// 사용자가 직접 예외처리 하도록 시키는 것
	
	public String readFile() throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		return dbType;
	}
}

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		// 객체생성
		MyException exception = new MyException("a.txt");
		
		// IOException 발생 가능성
		// 사용하는 입장에서 직접 예외처리를 해야한다.
		try {
			String temp = exception.readFile();
			System.out.println(temp);
		} catch (IOException e) {
			System.out.println("파일이 없습니다. 파일을 확인해주세요.");
		} 
		
		// 스캐너
		try {
			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();
		} catch (Exception e) {
			System.out.println("예외발생");
		} finally {
			
		}
		
		
		
	}
	
}
