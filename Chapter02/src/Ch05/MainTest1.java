package Ch05;

public class MainTest1 {

	public static void main(String[] args) {

		// ���� �����
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		
		// �л������
		Student student1 = new Student("������", 10_000);
		Student student2 = new Student("������", 50_000);
		Student student3 = new Student("����ȣ", 20_000);
		
		// ����ö �����
		Subway sub1 = new Subway(1);
		Subway sub2 = new Subway(2);
		Subway sub3 = new Subway(3);

		// �л� ���� ž��
		student1.takeBus(bus100);
		student2.takeBus(bus200);
		student3.takeBus(bus300);
		
		// �л� �ܾ�Ȯ��
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		
		// ���� ���� Ȯ��
		bus100.showInfo();
		bus200.showInfo();
		bus300.showInfo();
		
		// �л� ����ö ž��
		student1.takeSub(sub1);
		student2.takeSub(sub2);
		student3.takeSub(sub3);
		
		// �л� �ܾ�Ȯ��
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		
		// ����ö ����Ȯ��
		sub1.showInfo();
		sub2.showInfo();
		sub3.showInfo();
		
		/*
		// �л��� ������ ź��
		student1.takeBus(bus100);
		
		// ����â Ȯ��
		student1.showInfo();
		bus100.showInfo();
		
		student2.takeBus(bus100);
		student2.showInfo();
		bus100.showInfo();
		
		
		// student1�� ����ö�� ž�ϴ�
		student1.takeSub(sub1);
		
		student1.showInfo();
		sub1.showInfo();
		*/
		
		}// end of main

} // end of class
