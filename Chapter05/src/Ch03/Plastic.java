package Ch03;

public class Plastic extends Material{
	
	@Override
	public String toString() {
		//Object Ŭ���� �ȿ� �ִ� �޼���
		return "���� Plastic �Դϴ�.";
	}

	@Override
	public void doPrintinting() {
		System.out.println("�ö�ƽ ���� ����մϴ�.");
	}
	
}
