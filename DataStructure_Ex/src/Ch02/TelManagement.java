package Ch02;

import java.util.HashMap;
import java.util.Scanner;

public class TelManagement {
	
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;
		
		String name, address, telephone;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		name = sc.next();
		System.out.println("주소: ");
		address = sc.next();
		System.out.println("전화번호: ");
		telephone = sc.next();
		
		phone = new Phone(name, address, telephone);
		
		map.put(phone.name, phone);
		System.out.println(phone.name + "님의 정보가 저장되었습니다.");
		System.out.println("-----------------------");
	}
	
	// 삭제
	public static void delete(HashMap<String, Phone> map) {
		// key값은 입력받아서 사용
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 삭제할 대상의 이름을 입력해주세요.");
		name = sc.next();
		
		if (map.containsKey(name)) {
			map.remove(name);
			System.out.println(name + "의 정보가 삭제되었습니다.");
		} else {
			System.out.println("등록되지 않은 정보입니다.");
		}
		
		System.out.println("-----------------------");
	}
	
	// 찾기
	public static void search(HashMap<String, Phone> map) {
		// key값을 입력받아 찾은 뒤 화면에 출력
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으시는 대상의 이름을 입력해주세요");
		name = sc.next();
		
		if (map.containsKey(name)) {
			System.out.println(map.get(name));
			
		}
		
		System.out.println("-----------------------");
	}
	
	// 전체보기
	public static void showInfo(HashMap<String, Phone> map) {
		// 반복문을 이용 전체 정보를 출력하는 기능을 구현
		System.out.println("저장된 정보를 출력합니다.");
		for (String key : map.keySet()) {
			System.out.println("이름: " + key + ", " +map.get(key));
		}
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Phone> map = new HashMap<String, Phone>();
		// 메서드 이용해보기
//		insert(map);
//		search(map);
//		delete(map);
//		showInfo(map);
		
		int menu;
		boolean start = true;

		System.out.println("--------------------");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(start) {

			System.out.println("0.추가 | 1.삭제 | 2.찾기 | 3.전체보기 | 4.종료");
			menu = sc.nextInt();
			
			switch (menu) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				System.out.println("프로그램 종료");
				start = false;
				break;
				//return을 사용하면 while문이 멈춤
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		
		}
		
		
		
		
	}

}
