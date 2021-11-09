package Ch04;

public class SubwayMainTest {
	public static void main(String[] args) {
		
		// subway
		Subway s1 = new Subway(1);
		Subway s2 = new Subway(2);
		Subway s3 = new Subway(3);
		
		// take
		s1.take(1500);
		s2.take(1000);
		s3.take(800);
		
		//showInfo
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		
		
	} // end of main
} // end of class
