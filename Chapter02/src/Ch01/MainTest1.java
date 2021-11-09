package Ch01;

public class MainTest1 {
	public static void main(String[] args) {
		
		Order order1 = new Order();
		// 멤버 변수의 특성
		// 값을 넣지 않더라도 초기 값을 가지고 있다
		// int = 0, String(참조형) = null, double = 0.0 등
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		
		//1. order1 값을 초기화해주세요
		order1.buyerId = "주문1";
		order1.orderDate = "2021-10-22";
		order1.orderId = 100;
		order1.productId = 2;
		order1.sellerId = "판매자";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println("====================");
		
		
		UserInfo userInfo1 = new UserInfo();
		
		userInfo1.phoneNumber = "010-1234-5678";
		userInfo1.userAddress = "부산광역시";
		userInfo1.userId = "newUser";
		userInfo1.userName = "새친구";
		userInfo1.userPassword = "newPassword";
		
		System.out.println(userInfo1.phoneNumber);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userPassword);
		
	} //
	
}
