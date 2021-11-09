package Ch09;

public class NumberPrinter {
	/*
	 static

	 공통으로 사용하는 변수가 필요한 경우
	 카드 회사에서 카드를 새로 발급할 때마다 새로운 카드 번호를 부여
	 회사에 사람이 입사할 때마다 새로운 사번을 부여
	 은행에서 대기표를 뽑을 경우(2대 이상)
	 
	 
	 */
	
	private int id;
	private static int waitNumber = 1;
	
	public NumberPrinter(int id) {
		this.id = id;
	}
	
	// 번호표를 찍어주세요
	public void printWaitNum() {
		System.out.println(id + "번 기기의 대기 순번은 " + waitNumber + "번 입니다.");
		waitNumber++;
	}
	
}
