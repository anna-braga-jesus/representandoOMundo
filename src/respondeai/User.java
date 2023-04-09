package respondeai;

public class User {
    int age;
    String name;
    Adress adress = new Adress();
    private String email;
    private String password;

    public String getEmail() {
		return this.email;
	}
    public String getPassword() {
		return this.password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    public void setPassword(String password) {
		this.password = password;
	}
}
