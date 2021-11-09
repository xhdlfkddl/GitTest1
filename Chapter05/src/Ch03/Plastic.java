package Ch03;

public class Plastic extends Material{
	
	@Override
	public String toString() {
		//Object 클래스 안에 있는 메서드
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrintinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}
	
}
