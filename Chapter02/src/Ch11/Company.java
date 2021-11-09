package Ch11;

public class Company {
	/*
	 �̱��� �����̶�?
	 ���α׷����� �ν��Ͻ��� �� �� ���� �����Ǿ�� �ϴ� ��� ����ϴ� ������ ����
	 static����, �ż��带 Ȱ���Ͽ� ������ �� ����
	 */
	 
	// 1. �����ڸ� private���� �����
	private Company() {
		
	}
	
	// 2. static ������ Ȱ���ؼ� ���ο��� ��ü�� �����Ѵ�.
	// ���� ����� ���ÿ� ��ü�� ������ ��
	private static Company instance = new Company();
	
	// 3. �ܺο��� ������ �ν��Ͻ��� ������ �� �ִ� public method�� ����
	public static Company getInstance() {
		// ������ڵ�
		return instance;
	}
	
	
	
	
}
