package Ch07;

// extends Computer�� �ϰԵǸ� ������ �߻���
// DeskTop�� �߻�Ŭ������ �������
// Computer�� �ִ� �߻�޼��带 Override(������)�Ͽ� �Ϲ� �޼���� ������ �ϴ���
public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("ȭ���� ǥ�õ˴ϴ�.");
	}

	@Override
	public void typing() {
		System.out.println("Ű����� Ÿ�����մϴ�.");
	}

}
