package Ch08;

public class MainTest1 {
	
	public static void main(String[] args) {
	
		// ������ �� �޼ҵ���� �˾Ƽ� �׿� �°� ��µ�
		
		Car aiCar = new AiCar();
		aiCar.run();
//		�õ��� �մϴ�.
//		���� �����մϴ�.
//		�ڵ����� ������ ������ �ٲߴϴ�.
//		������ ����ϴ�.
//		�õ��� ���ϴ�.
		
		Car manualCar = new ManualCar();
		manualCar.run();
//		�õ��� �մϴ�.
//		����� ������ �մϴ�.
//		����� ������ �����մϴ�.
//		�극��ũ�� ��Ƽ� �����մϴ�.
//		�õ��� ���ϴ�.
		
	}
	
}
