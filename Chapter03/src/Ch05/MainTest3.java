package Ch05;

public class MainTest3 {
	public static void main(String[] args) {
		//������ : �迭(�ڷᱸ��)���迡���� ��밡��
		//�ϳ��� ������ ������ �����͸� ������ �����ϱ� ���� ���
		
		//1. �ٳ���
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();
		
		// �ٳ��� Ÿ���� ������ 2�� ���� �� �ִ� �迭 ����
		Banana[] bananaBucket = new Banana[2];
		bananaBucket[0] = banana1;
		bananaBucket[1] = banana2;
		
		//for each ���� ��� showInfo�� ���
		for(Banana bana : bananaBucket) {
			bana.showInfo();
		}
		
		//2. ������
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		
		Peach[] peachBucket = new Peach[2];
		peachBucket[0] = peach1;
		peachBucket[1] = peach2;
		
		for(Peach peach : peachBucket) {
			peach.showInfo();
		}
		
		//3. �������� ���
		Fruit[] fruitBucket = new Fruit[4];
		fruitBucket[0] = banana1;
		fruitBucket[1] = banana2;
		fruitBucket[2] = peach1;
		fruitBucket[3] = peach2;
		
		for(Fruit fruit : fruitBucket) {
			fruit.showInfo();
		}
		
	}
}
