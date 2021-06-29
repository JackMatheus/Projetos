package one.digitalInovation.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
	
	private String nome;
	//link: https://www.youtube.com/watch?v=D4QfCGNq4Mc
	//from bootcampo >> Dev se increve nos bootcapms >> Instancio conteudosIncrito
	private List<Conteudo> conteudosIncritos = new ArrayList<>();
	private List<Conteudo> conteudosConcluidos = new ArrayList<>(); //Já estanciando um array vazio 
	
	//>>Criando o metodo Inscrever, usando polimorfismo pois atende a curso, bootcamp e mentoria ao mesmo tempo
	public void inscrever(Conteudo conteudo) {
		if(conteudosIncritos.contains(conteudo)) {
			System.err.println("Você já se inscreveu neste Curso");
		}else {
		conteudosIncritos.add(conteudo);
		}	
		
	}
	
	public void inscrever (Bootcamp bootcamp) {
		//Alternativa tradicional
		//foreach: o Dev Tem que ter todos os conteudos inscritos, então faço um for para percorrer o conteudo do bootcamp >>  bootcamp.getConteudos()
		for (Conteudo conteudo: bootcamp.getConteudos() ) {
			//metodo inscrever = metodo acima nao preciso repetir, conceito de Sobrecarga, muda a lista de parametro , (Conteudo conteudo) vs (Bootcamp bootcamp) 
			inscrever(conteudo);
		}
		//Alternatina 2 => api stream
		//stream é para mudar uma lista do JAVA ///forEach no metodo stream(parametro conteudo) T:1:23
		//bootcamp.getConteudos().stream().forEach(this::inscrever);
		//Adcionando o Dev no bootcamp // this neste caso é o felipao pq ele chamou o metodo inscrever na MAIN
		bootcamp.getDevs().add(this);
	}
	
	public void progredir() {
		//Olha dentro da sua lista de conteudo
		//conteudosIncritos.stream().findFirst() T:1:30 // Retorna optional de conteudo 
		Optional<Conteudo> conteudo = conteudosIncritos.stream().findFirst();
		if(conteudo.isPresent()) {
			conteudosConcluidos.add(conteudo.get());
			conteudosIncritos.remove(conteudo.get());
			System.err.println("Você já concluiu este conteudo");
			
		}
		
	}
	//T1:36
	public double calcularTotalXp() {
		return conteudosConcluidos.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conteudo> getConteudosIncrito() {
		return conteudosIncritos;
	}
	public void setConteudosIncrito(List<Conteudo> conteudosIncrito) {
		this.conteudosIncritos = conteudosIncrito;
	}
	public List<Conteudo> getConteudosConcluido() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluido(List<Conteudo> conteudosConcluido) {
		this.conteudosConcluidos = conteudosConcluido;
	}

	
}
