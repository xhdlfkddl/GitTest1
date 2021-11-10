package Ch03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest1 {
	
	public static void main(String[] args) {
		
		// Calendar란 날짜 관련 인스턴스입니다.
		// 달력이나 시간 계산 등을 할 때 많이 사용하는 인스턴스 객체입니다.
		
		// 싱글톤 패턴으로 만들어 있어서 new를 사용할 수 없음
		// new를 사용하여 만들게 되면 각자 다르게 동작할 수 있기 때문
		// ex) 날짜, 시간이 다르게 나올 수 있음
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());// 1636527933390
		
		// 보기 불편하기 때문에 형식을 만들어서 사용할 수 있다.
		// 날짜로 변환 방법 지정
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		// 현재 시간을 내가 정한 format 형식으로 변환
		String date = dateFormat.format(calendar.getTimeInMillis());
		System.out.println(date); // 2021.11.10 16:10:37
		
	}
	
	
}
