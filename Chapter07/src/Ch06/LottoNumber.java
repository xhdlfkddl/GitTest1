package Ch06;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {
	
	static final int LOTTO_NUM_SIZE = 6;
	
	// 로또번호를 생성하는 기능
	public int[] getLottoNumber () {
		// 번호를 담는 공간 생성
		int[] numbers = new int[LOTTO_NUM_SIZE];
		
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			// 0~44까지 숫자 랜덤으로 생성 
			// 0은 필요 없으니 +1
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				 if(numbers[j] == numbers[i]) {
					 numbers[j] = numbers[i] +1;
 				 }
			}	 
		}
		
		// 배열정렬
		// 매개변수로 정렬할 배열이름
		Arrays.sort(numbers);
		
		return numbers;
	}
	
	//테스트 코드
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber();
		int[] nums = lottoNumber.getLottoNumber();
		
		for (int i : nums) {
			System.out.print(i + "\t");
		}
	}
	
}
