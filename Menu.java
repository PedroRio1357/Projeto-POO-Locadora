import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static Scanner adm = new Scanner(System.in);

	public static String principal() {
		System.out.println("Escolha uma opção do menu inicial");
		System.out.println("1) Login.");
		System.out.println("2) Se cadastrar.");
		System.out.println("3) Ver lista de itens.");
		System.out.println("4) Ver lista de itens ordenada (Categorizada).");
		System.out.println("S) Sair");
		String opcao = adm.nextLine();
		return opcao;
	}

	public static Cliente login(ArrayList<Cliente> cliente) {
		System.out.println("Informe seus dados de usuário já cadastrado");
		System.out.print("Email:");
		String email = adm.nextLine();
		System.out.print("Senha:");
		String senha = adm.nextLine();
		for (Cliente usuario : cliente) {
			if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
				return usuario;
			}
		}
		return null;
	}

	public static String admin() {
		System.out.println("Bem vindo Admin!");
		System.out.println("Escolha uma opção do menu");
		System.out.println("1) Cadastrar um novo item");
		System.out.println("2) Listar clientes");
		System.out.println("3) Mostrar Itens.");
		System.out.println("v) Voltar para o menu incial");
		String opcao = adm.nextLine();
		return opcao;
	}
}


