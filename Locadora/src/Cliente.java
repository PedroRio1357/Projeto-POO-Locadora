
public class Cliente {

  public String email;
  public String senha;
  public String nome;
  
  public static Cliente ler() {
		Cliente cliente = new Cliente();
		System.out.println("Por favor, digite seu nome:");
		cliente.nome = Locadora.leitor.nextLine();
		System.out.println("Digite seu email:");
		cliente.email = Locadora.leitor.nextLine();
		System.out.println("Digite sua senha:");
		cliente.senha = Locadora.leitor.nextLine();
		Locadora.leitor.nextLine();
		return cliente;
	} 	
  
  public void imprimir(){
		System.out.println("Você foi logado com sucesso :)");
		System.out.println("Seus dados são:");
		System.out.println("O seu nome é: " +nome);
		System.out.println("O seu email é: "+email);
		System.out.println("A sua senha é: "+senha);

	}
  
	public static void main(String[] args) {
		Cliente p = Cliente.ler();p.imprimir();
		
	}
  
}
