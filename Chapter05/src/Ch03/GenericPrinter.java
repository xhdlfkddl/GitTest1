package Ch03;

public class GenericPrinter <T>{
	
	/*
	 <T extends 클래스> 사용하기
	 상위 클래스의 필요성 
	 */
	
	// T라는 대체 문자를 사용한다. E - element, K - key, V - value
	// 자료형 매개변수(type parameter)
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString (T는 임시 문자열이라서 toString을 사용할 수 없음)
	@Override
	public String toString() {
		// material에 플라스틱이 들어오면 plastic.toString()이 실행되고
		// material에 파우더가 들어오면 powder.toString() 이 실행됨
		return material.toString();
	}
	
}
