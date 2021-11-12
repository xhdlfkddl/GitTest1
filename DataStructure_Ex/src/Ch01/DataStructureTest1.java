package Ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	String name;
	int grade;
}

public class DataStructureTest1 {
	
	public static void main(String[] args) {
		
		/*
		 프로그램 구현에 필요한 자료구조 데이터스트럭쳐를 구현해 놓은 jdk라이브러리
		 java utill패키지에 구현되어있음
		 개발에 소요되는 시간을 절약하면서 최적화된 알고리즘을 사용할 수 있음
		 여러 구현 클래스와 인터페이스의 활용에 대한 이해가 필요함
		 
		 set계열
		 데이터를 관리할 때 순서가 없고 중복이 불가함
		 
		 list게열
		 순서(index)가 있고 중복이 가능함
		 
		 
		 map계열
		 key와 value로 한쌍이 이루어져있음
		 */
		
		List list0;
		// 순서(index)가 있고 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> member = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();
		
		//선언과 동시에 초기화
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		
		// 값 추가 방법
		list.add(3); // index 0 = 3
		list.add(null); // index 1 = null
		list.add(1, 10); // index 1번째에 10을 삽입 -> null은 index 2로 밀려남
		
		System.out.println("값 확인:" + list); // 3, 10, null
		
		// 값 삭제 방법
		list.remove(2); // index 2의 값을 삭제
		System.out.println("값 삭제확인: " + list);
		
//		list.clear(); // 전체 삭제
		System.out.println("값 삭제확인: " + list);
		
		// 값 출력 방법
		System.out.println("값 출력 방법:" + list.get(1)); // index 1의 값을 출력
		// list에 담긴 아이들을 Integer타입이며 i라는 이름을 가진 변수에 담는다
		for (Integer i : list) {
			System.out.println("for 사용방법: "+ i);
		}
		
		// while 사용방법
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
		// list를 while문으로 출력하려면 Iterator를 사용하여 타입을 바꿔줘야함
		// list타입을 iterator 타입으로 바꿔줌
		Iterator<Integer> iter = list.iterator();
		
		// 다음이 있다면 true / 없다면 false
		while(iter.hasNext()) {
			// 값 가져오기 = next()
			System.out.println("while 사용방법: "+ iter.next());
		}
		
		// 값 검색방법
		System.out.println(list.contains(1)); // list에 1이라는 값이 있습니까? = false
		System.out.println(list.contains(10)); // list에 10이라는 값이 있습니까? = true

		// 값이 있으면 인덱스의 번호를 반환, 없다면 -1을 반환하도록
		System.out.println(list.indexOf(10)); // list에 10이라는 값이 몇번째 index에 있나요? = 1
		System.out.println(list.indexOf(300)); // list에 300이라는 값이 몇번째 index에 있나요? = -1(없음)
		System.out.println(list.indexOf(3)); // 0
		
		
		// 문제 1
		ArrayList<String> names = new ArrayList<String>();
		
		// 스캐너 사용
		// 이름을 입력하면 names 리스트에 저장
		// 0번을 눌러 종료하면 이름들을 출력
		boolean input = true;
		while(input) {
			System.out.println("이름을 입력해주세요");
			
			Scanner sc = new Scanner(System.in);
			String myName = sc.nextLine();
			if (myName.equals("0")) {
				System.out.println("입력받은 이름: " + names);
				input = false;
			} else {
				names.add(myName);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
