package one.digitalInovation.dominio;

//>>Classe PAI abstrata não pode ser instanciada em outras
public abstract class Conteudo {
	//>>Classe protected >>só os filhos podem acessar
	protected static final double XP_PADRAO = 10.0;
	
	private String titulo;
	private String descricao;

	//Criando um metodo abstrato T1:00>> exportanto >> obriga a implementar nas classes filhas
	public abstract double calcularXp(); 
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
