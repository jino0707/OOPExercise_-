package member.model.vo.Member;

public class Member {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	private String email;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserpwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}
}
