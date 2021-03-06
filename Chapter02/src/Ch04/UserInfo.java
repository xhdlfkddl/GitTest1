package Ch04;

public class UserInfo {
	
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String phoneNumber;

	// alt + shift + s = 우클릭
	// 단축키 O
	public UserInfo(String userId) {
		super();
		this.userId = userId;
	}

	public UserInfo(String userId, String userPassword) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}


	
	
	
	
	/*
	// 같은 이름의 생성자를 여러 개 만드는 것을 "생성자 오버로딩" 이라고 함
	// 중요!! 생성자는 객체가 생성될 때 처음 실행되는 코드입니다.
	
	// 1. 기본 생성자를 만들어주세요
	public UserInfo() {
		
	}
	
	// 2. userId 만 받는 생성자를 만들어주세요
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// 3. userId, userPassword 만 받는 생성자를 만들어주세요
	public UserInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	// 4. userId, userPassword, userName만 받는 생성자를 만들어주세요.
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	// 5. userId, userPassword, userName, userAddress만 받는 생성자를 만들어주세요.
	public UserInfo(String userId, String userPassword, String userName, String userAddress) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	// 6. userId, userPassword, userName, userAddress, phoneNumber만 받는 생성자를 만들어주세요.
	public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	*/

}
