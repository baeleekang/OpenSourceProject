// 로그인 생성자

package Bookmanager;

public class LoginBean {
	private String id;
	private String pw;
	
	public LoginBean(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
