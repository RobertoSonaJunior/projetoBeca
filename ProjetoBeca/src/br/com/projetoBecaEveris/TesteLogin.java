package br.com.projetoBecaEveris;

public class TesteLogin {

	public static void main(String[] args) {

		Login usuario = new Login("Roberto", "Senha123");
		
		//boolean log = logadoOuNao(usuario);
		System.out.println(usuario.getPassword());
		
		
		
	}

}
