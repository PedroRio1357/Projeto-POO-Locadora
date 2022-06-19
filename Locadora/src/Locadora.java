import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {
	
	public static Scanner leitor = new Scanner(System.in);
	public Gerente gerente;
	public Admin Admin;
	public String nome;
	public String endereco;
	public ArrayList<Cliente> cliente;
	public ArrayList<Filmes> filmes;
	public ArrayList<Alugar> filmesalugados;
	public ArrayList<Devolver> filmesadevolvidos;
}

