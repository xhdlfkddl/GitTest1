package Ch08;

public class Person {
	/*
	this ��
	1. �ν��Ͻ�(��ü)���� �ڽ��� �޸𸮸� ����Ų��.
	2. �����ڿ��� �� �ٸ� �����ڸ� ȣ���� �� ����� �� �ִ�.
	3. �ڽ��� �ּ�(������, �ּҰ�)�� ��ȯ��ų �� �ִ�.
	 */
	
	String name; 
	int age;
	
	public Person(String name, int age) {
		// 1. �ڱ� �ڽ��� ����Ű�� this
		this.name = name;
		this.age = age;
	}
	
	// �⺻������
	// name = null, age = 0
	public Person() {
		// �⺻ �����ڿ��� �̹� ��������ִ� �ٸ� �����ڸ� ȣ��
		// this.name = "�̸�����";
		// this.age = 1;
		this("�̸�����", 1);
	}
	
	// �ڽ��� �ּҰ�(������)�� ��ȯ��ų �� �ִ�.
	// ���������� ����� �� �� �ִ�.
	public Person getPerson() {
		return this;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name + " ����: " + age);
	}
	
	//main
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("ȫ�浿");
		//person1.showInfo(); // �̸�����, 1
		
		// �������� �޾Ƽ� �ٸ� �ν��Ͻ� ������ �ּҸ� �Ҵ��غ���.
		// ���ο� new�� ������������
		// ���� �ּ� ���� ����Ű�� ����
		Person person2 = person1.getPerson();
		//person2.showInfo(); // �̸�����, 1
		person2.setName("�̼���");
		
		System.out.println(person1); // Ch08.Person@15db9742
		System.out.println(person2); // Ch08.Person@15db9742
		
		person1.showInfo();
		person2.showInfo();
		
	}
	
}
