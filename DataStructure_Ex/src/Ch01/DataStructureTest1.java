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
		 ���α׷� ������ �ʿ��� �ڷᱸ�� �����ͽ�Ʈ���ĸ� ������ ���� jdk���̺귯��
		 java utill��Ű���� �����Ǿ�����
		 ���߿� �ҿ�Ǵ� �ð��� �����ϸ鼭 ����ȭ�� �˰����� ����� �� ����
		 ���� ���� Ŭ������ �������̽��� Ȱ�뿡 ���� ���ذ� �ʿ���
		 
		 set�迭
		 �����͸� ������ �� ������ ���� �ߺ��� �Ұ���
		 
		 list�Կ�
		 ����(index)�� �ְ� �ߺ��� ������
		 
		 
		 map�迭
		 key�� value�� �ѽ��� �̷��������
		 */
		
		List list0;
		// ����(index)�� �ְ� �ߺ��� �����ϴ�.
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> member = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<>();
		
		//����� ���ÿ� �ʱ�ȭ
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		
		// �� �߰� ���
		list.add(3); // index 0 = 3
		list.add(null); // index 1 = null
		list.add(1, 10); // index 1��°�� 10�� ���� -> null�� index 2�� �з���
		
		System.out.println("�� Ȯ��:" + list); // 3, 10, null
		
		// �� ���� ���
		list.remove(2); // index 2�� ���� ����
		System.out.println("�� ����Ȯ��: " + list);
		
//		list.clear(); // ��ü ����
		System.out.println("�� ����Ȯ��: " + list);
		
		// �� ��� ���
		System.out.println("�� ��� ���:" + list.get(1)); // index 1�� ���� ���
		// list�� ��� ���̵��� IntegerŸ���̸� i��� �̸��� ���� ������ ��´�
		for (Integer i : list) {
			System.out.println("for �����: "+ i);
		}
		
		// while �����
		// ��� ��ȸ(�ݺ���) �÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ� ��
		// list�� while������ ����Ϸ��� Iterator�� ����Ͽ� Ÿ���� �ٲ������
		// listŸ���� iterator Ÿ������ �ٲ���
		Iterator<Integer> iter = list.iterator();
		
		// ������ �ִٸ� true / ���ٸ� false
		while(iter.hasNext()) {
			// �� �������� = next()
			System.out.println("while �����: "+ iter.next());
		}
		
		// �� �˻����
		System.out.println(list.contains(1)); // list�� 1�̶�� ���� �ֽ��ϱ�? = false
		System.out.println(list.contains(10)); // list�� 10�̶�� ���� �ֽ��ϱ�? = true

		// ���� ������ �ε����� ��ȣ�� ��ȯ, ���ٸ� -1�� ��ȯ�ϵ���
		System.out.println(list.indexOf(10)); // list�� 10�̶�� ���� ���° index�� �ֳ���? = 1
		System.out.println(list.indexOf(300)); // list�� 300�̶�� ���� ���° index�� �ֳ���? = -1(����)
		System.out.println(list.indexOf(3)); // 0
		
		
		// ���� 1
		ArrayList<String> names = new ArrayList<String>();
		
		// ��ĳ�� ���
		// �̸��� �Է��ϸ� names ����Ʈ�� ����
		// 0���� ���� �����ϸ� �̸����� ���
		boolean input = true;
		while(input) {
			System.out.println("�̸��� �Է����ּ���");
			
			Scanner sc = new Scanner(System.in);
			String myName = sc.nextLine();
			if (myName.equals("0")) {
				System.out.println("�Է¹��� �̸�: " + names);
				input = false;
			} else {
				names.add(myName);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
