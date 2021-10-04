package br.com.projetoBecaEveris;

public class Login {

	private String user = "Roberto";
	private String password = "123";
	
	public Login(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public boolean logadoOuNao(String loga){
		if(this.user == loga) {
			System.out.println("OK!!");
			return  true;
		}
		else {
			System.out.println("Infelizmente não deu.");
		return false;
		}
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
