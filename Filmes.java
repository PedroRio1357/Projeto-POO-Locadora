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
		System.out.println("Digite o(os) g�nero(s) do filme:");
		filmes.genero = Locadora.leitor.nextLine();
		System.out.println("Digite a descri��o do filme:");
		filmes.descricao = Locadora.leitor.nextLine();
		System.out.println("Digite o valor que deseja cobrar pelo filme:");
		filmes.valor = Locadora.leitor.nextDouble();
		Locadora.leitor.nextLine();
		return filmes;
		

	}
	public void imprimir(){
		System.out.println("Solicita��o registrada, basta esperar aprova��o do Admin :)");
		System.out.println("O nome do filme �:" +nome);
		System.out.println("O genero do filme �: "+genero);
		System.out.println("A descricao do filme �: "+descricao);
		System.out.println("O valor do filme � R$: "+valor);

	}
	
	
	public static void main(String[] args) {
		Filmes p = Filmes.ler(); p.imprimir();
	}

}



