

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {
	
	public static Scanner leitor = new Scanner(System.in);
	public Gerente gerente;
	public Admin Admin;
	public static String nome;
	public static String endereco;
	public ArrayList<Cliente> cliente;
	public ArrayList<Filmes> filmes;
	public ArrayList<Alugar> filmesalugados;
	public ArrayList<Devolver> filmesadevolvidos;

public static Locadora ler() {
	Locadora locadora = new Locadora();
	System.out.println("Informe o nome da locadora");
	Locadora.nome = Locadora.leitor.nextLine();
	System.out.println("Informe o endereço da locadora");
	Locadora.endereco = Locadora.leitor.nextLine();
	Locadora.leitor.nextLine();
	return locadora;
} 	

public void imprimir(){
	System.out.println("Locadora " +nome+ " Logada com sucesso!");
	System.out.println("endereço: " +endereco);

}
public static void main(String[] args) {
	Locadora p = Locadora.ler();p.imprimir();
}
}
