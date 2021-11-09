package Ch03;

public class GenericPrinter <T>{
	
	/*
	 <T extends Ŭ����> ����ϱ�
	 ���� Ŭ������ �ʿ伺 
	 */
	
	// T��� ��ü ���ڸ� ����Ѵ�. E - element, K - key, V - value
	// �ڷ��� �Ű�����(type parameter)
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString (T�� �ӽ� ���ڿ��̶� toString�� ����� �� ����)
	@Override
	public String toString() {
		// material�� �ö�ƽ�� ������ plastic.toString()�� ����ǰ�
		// material�� �Ŀ���� ������ powder.toString() �� �����
		return material.toString();
	}
	
}
