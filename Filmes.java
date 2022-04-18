import java.util.Date;

public class Filmes {
	
	public String nome;
	public String genero;
	public String classificacao;
	public Double valor;
	public Date ano;
	public String descricao;
	
	public static Filmes ler() {
		Filmes filmes = new Filmes();
		System.out.println("Por favor, cadastre um filme.");
		System.out.println("Digite o nome do filme:");
		filmes.nome = Locadora.leitor.nextLine();
		System.out.println("Digite o(os) gï¿½nero(s) do filme:");
		filmes.genero = Locadora.leitor.nextLine();
		System.out.println("Digite a descriï¿½ï¿½o do filme:");
		filmes.descricao = Locadora.leitor.nextLine();
		System.out.println("Digite o valor que deseja cobrar pelo filme:");
		filmes.valor = Locadora.leitor.nextDouble();
		Locadora.leitor.nextLine();
		return filmes;
		

	}
	public void imprimir(){
		System.out.println("Solicitaï¿½ï¿½o registrada, basta esperar aprovaï¿½ï¿½o do Admin :)");
		System.out.println("O nome do filme ï¿½:" +nome);
		System.out.println("O genero do filme ï¿½: "+genero);
		System.out.println("A descricao do filme ï¿½: "+descricao);
		System.out.println("O valor do filme ï¿½ R$: "+valor);

	}
	
	
	public static void main(String[] args) {
		Filmes p = Filmes.ler(); p.imprimir();
	}

}
