package dbConcept04.DTO;

public class MemberDTO implements IMemberDTO{
	String email, name, pw, confirmPassword;
	@Override
	public void setEmail(String email) {
		this.email = email;
		
	}

	@Override
	public void setPassword(String password) {
		this.pw = password;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void setRegisterDate(String registerDate) {
		this.confirmPassword = registerDate;
		
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return pw;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getRegisterDate() {
		// TODO Auto-generated method stub
		return confirmPassword;
	}

}
