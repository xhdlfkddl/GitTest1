package Ch05;

public class BreakTest {
	public static void main(String[] args) {
		
		// 예약어 break;
		// 중간에 멈추는 break
		
		for(int i = 1; i < 11; i++) {
			
			System.out.println(i);
			
			// 다중 for문에서 사용 시
			// 가장 가까운 for문만 break 하게 됨
			
			// 7로 나누었을 때 나머지 연산의 결과가 0이면 break
			if(( i % 7 ) == 0) {
				break;
			}
			
		} //end of for
		
		
	} // end of main
	
} // end of class
