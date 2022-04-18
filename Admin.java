
public class Admin {

	public String email;
	public String senha;
	public String nome;
	

public static Admin ler() {
	Admin admin = new Admin();
	System.out.println("Iniciando cadastro de Administrador");
	System.out.println("Informe o seu nome");
	admin.nome = Locadora.leitor.nextLine();
	System.out.println("Informe seu email");
	admin.email = Locadora.leitor.nextLine();
	System.out.println("Informe a senha");
	admin.senha = Locadora.leitor.nextLine();
	return admin;
}

public void imprimir() {
	System.out.println("Bem vindo" +nome);
	System.out.println("de Email: "+email);
	System.out.println("Sua senha Ã©: "+senha);
}

public static void main(String[] args) {
	Admin p = Admin.ler();p.imprimir();
  
	Admin c1 = new Admin();//não está funcionando
  
	c1.nome = "adm1";
	c1.email = "Admin@gmail.com";
	c1.senha = "admin12334";
}

}
