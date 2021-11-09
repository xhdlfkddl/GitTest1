package Ch03;

public class Powder extends Material {
	
	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}

	@Override
	public void doPrintinting() {
		System.out.println("파우더 재료로 출력합니다.");
	}
	
}
