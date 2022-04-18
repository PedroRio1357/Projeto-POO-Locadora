
public class Usuario {
	
	@SuppressWarnings("unused")
	private String email;
	private String senha;
	private String nome;
	private Locadora locadora;
	
	public Usuario(String email, String nome, String senha) {
		this.email = email;
		this.nome = nome;
		this.senha =senha;		
	}
	
	public void setEmail(String email, String senha) {
		if (this.senha.equals(senha)) {
			this.email = email;
		}
	}
	
	public void setSenha(String senhaAtual, String senhaNova) {
		if (this.senha.equals(senhaAtual)) {
			this.senha = senhaAtual;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Locadora getLocadora() {
		return locadora;
	}

	public void setLocadora(Locadora locadora) {
		this.locadora = locadora;
	}


public Object getEmail() {
	// TODO Auto-generated method stub
	return null;
}

public Object getSenha() {
	// TODO Auto-generated method stub
	return null;
}
	public void main(String[] args) {
		
		//aqui no usuario c está um erro.
		Usuario c1 = new Usuario();
		
		c1.nome = "Henrique";
		c1.email = "henrique2012@gmail.com";
		c1.senha = "12345";
		
	}

}
