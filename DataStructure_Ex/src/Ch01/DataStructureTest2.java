package Ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest2 {

	public static void main(String[] args) {
		Set set0;

		// ������ ���� �ߺ��� �ȵ�
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);// �ߺ���
		set1.add(2);
		set1.add(3);
		set1.add(3);// �ߺ���
		
		// add�� �� 5�� ������ �ߺ����� ������ 3���� ��µ�
		System.out.println("set1: "+ set1);
		
		// ������ ��
		System.out.println("������ Ȯ��:" + set1.size()); // 3
		
		// ����
		set1.remove(1);
//		set1.clear(); // ��ü ����
		System.out.println(set1); // 2, 3
		
		
		// for���� ����� ���
//		for (int i = 0; i < set1.size(); i++) {
//			System.out.println("set1: "+ i); // �ȵ�
//			System.out.println("set1: "+ set1);
//		}
		
		// while���� ����� ���
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("�� Ȯ��: " + iter.next());
		}
		
		// ���ο� ���� �մ��� Ȯ��
		System.out.println(set1.contains(1)); // 1�� �ֽ��ϱ�? = false
		System.out.println(set1.contains(3)); // 3�� �ֽ��ϱ�? = true
		
		//
		HashSet<Integer> set2 = new HashSet<Integer>();
		// set2 ����� 6���� �Ϸ�
		// �ƴ϶�� �ѹ� �� ����
		boolean flag  = true;
		
		while (flag) {
			set2.add(getRandomNumber());			
			if (set2.size() == 6) {
				flag = false;
			}
		}
	
		System.out.println(set2);
		
	} // end of main
	
	public static int getRandomNumber() {
		Random random = new Random();
		int value = random.nextInt(45) +1;
		return value;
	}
	

}
