package Ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest2 {

	public static void main(String[] args) {
		Set set0;

		// 순서가 없고 중복이 안됨
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);// 중복값
		set1.add(2);
		set1.add(3);
		set1.add(3);// 중복값
		
		// add를 총 5번 했지만 중복값을 제외한 3개만 출력됨
		System.out.println("set1: "+ set1);
		
		// 사이즈 값
		System.out.println("사이즈 확인:" + set1.size()); // 3
		
		// 삭제
		set1.remove(1);
//		set1.clear(); // 전체 삭제
		System.out.println(set1); // 2, 3
		
		
		// for문을 사용한 출력
//		for (int i = 0; i < set1.size(); i++) {
//			System.out.println("set1: "+ i); // 안됨
//			System.out.println("set1: "+ set1);
//		}
		
		// while문을 사용한 출력
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인: " + iter.next());
		}
		
		// 내부에 값이 잇는지 확인
		System.out.println(set1.contains(1)); // 1이 있습니까? = false
		System.out.println(set1.contains(3)); // 3이 있습니까? = true
		
		//
		HashSet<Integer> set2 = new HashSet<Integer>();
		// set2 사이즈가 6개면 완료
		// 아니라면 한번 더 동작
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
