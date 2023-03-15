package dbConcept04.DTO;

public class RegisterRequest implements IRegisterRequest{

	String email, name, pw, confirmPassword;
	
	@Override
	public String getEmail() {
	
		return email;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getPassword() {
		
		return pw;
	}

	@Override
	public String getConfirmPassword() {
		
		return confirmPassword;
	}

	@Override
	public void setPassword(String password) {
		this.pw = password;
		
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
		
	}

}
