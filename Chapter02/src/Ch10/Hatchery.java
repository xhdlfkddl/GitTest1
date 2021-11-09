package Ch10;

public class Hatchery {
	
	// static���� ���
	public static int zerglingCount = 0;
	
	// ������� ����
	private int hatcheryId;
	private String name;
	
	// ������ ����
	public Hatchery(int id) {
		this.hatcheryId = id;
		this.name = "��ó��";
	}
	
	// ���۸��� �����ϴ� �޼��带 ������ּ��� 
	public Zergling createZergling() {
		System.out.println("���۸��� �����մϴ�.");
		zerglingCount++;
		return new Zergling("���۸�");
	}
	
	
}
