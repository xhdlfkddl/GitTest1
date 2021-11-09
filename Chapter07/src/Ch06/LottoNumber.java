package Ch06;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {
	
	static final int LOTTO_NUM_SIZE = 6;
	
	// �ζǹ�ȣ�� �����ϴ� ���
	public int[] getLottoNumber () {
		// ��ȣ�� ��� ���� ����
		int[] numbers = new int[LOTTO_NUM_SIZE];
		
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			// 0~44���� ���� �������� ���� 
			// 0�� �ʿ� ������ +1
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				 if(numbers[j] == numbers[i]) {
					 numbers[j] = numbers[i] +1;
 				 }
			}	 
		}
		
		// �迭����
		// �Ű������� ������ �迭�̸�
		Arrays.sort(numbers);
		
		return numbers;
	}
	
	//�׽�Ʈ �ڵ�
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber();
		int[] nums = lottoNumber.getLottoNumber();
		
		for (int i : nums) {
			System.out.print(i + "\t");
		}
	}
	
}
