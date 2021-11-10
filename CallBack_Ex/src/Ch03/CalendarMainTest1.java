package Ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest1 {
	
	public static void main(String[] args) {
		
		// Calendar�� ��¥ ���� �ν��Ͻ��Դϴ�.
		// �޷��̳� �ð� ��� ���� �� �� ���� ����ϴ� �ν��Ͻ� ��ü�Դϴ�.
		
		// �̱��� �������� ����� �־ new�� ����� �� ����
		// new�� ����Ͽ� ����� �Ǹ� ���� �ٸ��� ������ �� �ֱ� ����
		// ex) ��¥, �ð��� �ٸ��� ���� �� ����
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());// 1636527933390
		
		// ���� �����ϱ� ������ ������ ���� ����� �� �ִ�.
		// ��¥�� ��ȯ ��� ����
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		// ���� �ð��� ���� ���� format �������� ��ȯ
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date); // 2021.11.10 16:10:37
		
	}
	
	
}
