package Ch05;

public class ForMainTest3 {
	public static void main(String[] args) {
		
		
		// 1부터 9까지 반복
		for(int i = 1; i <=9; i++) {
			
			for(int j = 1; j <= 9; j++) {

			} // end of for2
			
		} // end of for1
		
		// 2중 for문으로 구구단 2~9단까지 출력
		int num = 0;
		
		// 실행순서 1
		for(num = 2; num <=9; num++) {
			// 실행순서 2 
			// 2~9까지 반복함
			// num = 2가 된 상태로 아래의 for문으로 넘어감
			
			// 아래의 for문이 완료되면 num = 3이 된 상태로 for문으로 넘어감(반복) 
			for(int i = 1; i <= 9; i++) {
				// num = 2인 상태를 가지고 i를 1~9까지 반복함
				// 출력이 완료되면 다시 위의 for문으로 올라가게 됨
				System.out.println(num + " * "+ i +" = " + (num * i));
				
			} // end of for2
			
			// 실행순서 3
			System.out.println();
			
		} // end of for1
		
		
	} // end of main
	
} // end of class
