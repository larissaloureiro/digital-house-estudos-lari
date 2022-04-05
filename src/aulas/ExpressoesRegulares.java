package aulas;

public class ExpressoesRegulares {

	private String email;

	
	public ExpressoesRegulares (String email) {
		if (email == null || ! email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			System.out.println("Email inv�lido.");
		} else {
			System.out.println("Email v�lido.");
		}
		this.email = email;
	}
	
	
	public String getEmail() {
		return email;
	}
	

}
