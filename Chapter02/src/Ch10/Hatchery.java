package Ch10;

public class Hatchery {
	
	// static변수 사용
	public static int zerglingCount = 0;
	
	// 멤버변수 설계
	private int hatcheryId;
	private String name;
	
	// 생성자 설계
	public Hatchery(int id) {
		this.hatcheryId = id;
		this.name = "햇처리";
	}
	
	// 저글링을 생산하는 메서드를 만들어주세요 
	public Zergling createZergling() {
		System.out.println("저글링을 생산합니다.");
		zerglingCount++;
		return new Zergling("저글링");
	}
	
	
}
