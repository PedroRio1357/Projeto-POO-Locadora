import java.util.ArrayList;
import java.util.Date;

public class Devolver {

	public Filmes Filmes;
	public Date entrada;
	public String vencimento;
	public double valor;
	public String nome;
	public ArrayList<Devolver> filmesadevolvidos;
	
	public static Devolver ler() {
		Devolver devolver = new Devolver();
		System.out.println("Que filme voc� quer devolver?");
		devolver.nome = Locadora.leitor.nextLine();
		System.out.println("Digite o valor");
		devolver.valor = Locadora.leitor.nextDouble();
		System.out.println("Voc� est� entregando dentro do prazo?");
		devolver.vencimento = Locadora.leitor.nextLine();
		Locadora.leitor.nextLine();
		return devolver;
	}
	
	public void imprimir(){
		System.out.println("Parab�ns, voc� devolveu o filme!");
		System.out.println("O filme que voc� devolveu foi: " + nome);
		System.out.println("O valor do filme � R$" + valor);

	}
	
	public static void main(String[] args) {
		Devolver p = Devolver.ler();p.imprimir();
	}


}
