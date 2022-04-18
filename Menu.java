import java.util.ArrayList;

public class Menu {
	
	public static String principal() {
		System.out.println("Escolha uma opção do menu inicial");
		System.out.println("1) Login");
		System.out.println("2) Se cadastrar como cliente");
		System.out.println("S) Sair");
		String opcao = Locadora.leitor.nextLine(); 
		return opcao;
	}
	
	public static Usuario login(ArrayList<Usuario> usuarios) {
		System.out.println("Informe seus dados de usuário já cadastrados");
		System.out.print("Email:");
		String email = Locadora.leitor.nextLine();
		System.out.print("Senha:");		
		String senha = Locadora.leitor.nextLine();
		for (Usuario usuario : usuarios) {
			if (usuario.getEmail().equals(email) &&
					usuario.getSenha().equals(senha)) {
				return usuario;
			}
		}
		return null;
	}

	public static String gerente() {
		System.out.println("Bem vindo gerente");
		System.out.println("Escolha uma opção do menu");
		System.out.println("1) Cadastrar um novo cliente");
		System.out.println("2) Listar clientes");
		System.out.println("v) Voltar para o menu incial");
		String opcao = Locadora.leitor.nextLine();
		return opcao;
	}
	

}
