package Ch09;

public interface RemoteController {
	
	/*
	 �������̽�
	 ������ ���� �ƹ��͵� ���� �ر׸��� �ִ� �⺻ ���赵
	 �������, �Ϲ� �޼��带 ���� �� ���� ���� �߻�޼���� ������� ��������� ���� �� �ִ�.
	 �߻�Ŭ���� ���� �߻�ȭ�� �� ����
	 �������̽��� ǥ��, ���, ��Ģ��
	 ��� �޼��尡 �߻� �޼���� ���� public abstract
	 ��� ������ ����� ����� public static final
	 
	 �����
	 class ��� Interface��� Ű���带 ���
	 class�� ���� public�̳� default�� ����� �� �ִ�.
	 
	 �������
	 ��� ��������� public static final�̾�� �Ѵ�.
	 ��� �޼���� �߻� Ŭ�����̾�� �ϰ�, public abstract Ű���� ��������
	*/
	
	public static final int SERIAL_NUMBER= 1000; //���
	// �߻�޼��� = ������� ��Ҹ� ����� ����
	public abstract void turnOn();
	void turnOff(); // = public abstract void turnOff();
	
}
