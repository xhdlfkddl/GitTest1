package Ch03;

public class MainTest3 {
	public static void main(String[] args) {
		
		// �ڵ����� �����Ͽ� showInfo�� ȣ�����ּ���.
		Car car1 = new Car("������", 1200);
		car1.showInfo();
		
		// �ش� �ڵ����� ������ ������ ����غ�����
		car1.engine = new Engine("7����", 300);
		car1.engine.showInfo();
		// �����ڿ� �־ ��
		
		
	} // end of main
} // end of class
