package Ch01;

public class MainTest1 {
	public static void main(String[] args) {
		
		Order order1 = new Order();
		// ��� ������ Ư��
		// ���� ���� �ʴ��� �ʱ� ���� ������ �ִ�
		// int = 0, String(������) = null, double = 0.0 ��
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		
		//1. order1 ���� �ʱ�ȭ���ּ���
		order1.buyerId = "�ֹ�1";
		order1.orderDate = "2021-10-22";
		order1.orderId = 100;
		order1.productId = 2;
		order1.sellerId = "�Ǹ���";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println("====================");
		
		
		UserInfo userInfo1 = new UserInfo();
		
		userInfo1.phoneNumber = "010-1234-5678";
		userInfo1.userAddress = "�λ걤����";
		userInfo1.userId = "newUser";
		userInfo1.userName = "��ģ��";
		userInfo1.userPassword = "newPassword";
		
		System.out.println(userInfo1.phoneNumber);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userPassword);
		
	} //
	
}
