package Ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MbcNews implements WriteArticle{

	public String getDate() {
		DateFormat date = new SimpleDateFormat("yyyy.MM.dd");
		return date.format(Calendar.getInstance().getTime());
	}
	
	
	@Override
	public void printArticle(String article) {
		// 
		System.out.println("***MBC News***");
		System.out.println();
		System.out.println("[�ܵ�]" + article);
		System.out.println();
		System.out.println("�ۼ�����: " + getDate());
		
	}
	
}
