
public class Gerente {

	public String email;
	public String senha;
	public String nome;
	
	 public static Gerente ler() {
			Gerente gerente = new Gerente();
			System.out.println("Por favor, digite seu nome:");
			gerente.nome = Locadora.leitor.nextLine();
			System.out.println("Digite seu email:");
			gerente.email = Locadora.leitor.nextLine();
			System.out.println("Digite sua senha:");
			gerente.senha = Locadora.leitor.nextLine();
			Locadora.leitor.nextLine();
			return gerente;
		} 	
	  
	  public void imprimir(){
			System.out.println("Olá gerente,você foi logado com sucesso :)");
			System.out.println("Seus dados são:");
			System.out.println("O seu nome é: " +nome);
			System.out.println("O seu email é: "+email);
			System.out.println("A sua senha é: "+senha);

		}
	  
		public static void main(String[] args) {
			Gerente p = Gerente.ler();p.imprimir();
      //dados pré definidos pelo sistema.
			Gerente c1 = new Gerente();
					c1.nome = "Henrique";
					c1.email = "henrique2012@gmail.com";
					c1.senha = "12345";
		}
}
