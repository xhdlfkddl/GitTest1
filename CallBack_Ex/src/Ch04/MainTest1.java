package Ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		Activity1 activity1 = new Activity1("����ȭ��");
		
		Activity2 activity2 = new Activity2("����ȭ��");
		activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);
	}

}
