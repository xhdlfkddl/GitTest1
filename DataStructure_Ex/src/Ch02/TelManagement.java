package Ch02;

import java.util.HashMap;
import java.util.Scanner;

public class TelManagement {
	
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;
		
		String name, address, telephone;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�: ");
		name = sc.next();
		System.out.println("�ּ�: ");
		address = sc.next();
		System.out.println("��ȭ��ȣ: ");
		telephone = sc.next();
		
		phone = new Phone(name, address, telephone);
		
		map.put(phone.name, phone);
		System.out.println(phone.name + "���� ������ ����Ǿ����ϴ�.");
		System.out.println("-----------------------");
	}
	
	// ����
	public static void delete(HashMap<String, Phone> map) {
		// key���� �Է¹޾Ƽ� ���
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ����� �̸��� �Է����ּ���.");
		name = sc.next();
		
		if (map.containsKey(name)) {
			map.remove(name);
			System.out.println(name + "�� ������ �����Ǿ����ϴ�.");
		} else {
			System.out.println("��ϵ��� ���� �����Դϴ�.");
		}
		
		System.out.println("-----------------------");
	}
	
	// ã��
	public static void search(HashMap<String, Phone> map) {
		// key���� �Է¹޾� ã�� �� ȭ�鿡 ���
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ã���ô� ����� �̸��� �Է����ּ���");
		name = sc.next();
		
		if (map.containsKey(name)) {
			System.out.println(map.get(name));
			
		}
		
		System.out.println("-----------------------");
	}
	
	// ��ü����
	public static void showInfo(HashMap<String, Phone> map) {
		// �ݺ����� �̿� ��ü ������ ����ϴ� ����� ����
		System.out.println("����� ������ ����մϴ�.");
		for (String key : map.keySet()) {
			System.out.println("�̸�: " + key + ", " +map.get(key));
		}
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Phone> map = new HashMap<String, Phone>();
		// �޼��� �̿��غ���
//		insert(map);
//		search(map);
//		delete(map);
//		showInfo(map);
		
		int menu;
		boolean start = true;

		System.out.println("--------------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(start) {

			System.out.println("0.�߰� | 1.���� | 2.ã�� | 3.��ü���� | 4.����");
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
				System.out.println("���α׷� ����");
				start = false;
				break;
				//return�� ����ϸ� while���� ����
			default :
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���");
			}
		
		}
		
		
		
		
	}

}
