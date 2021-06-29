package one.digitalInovation.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo{
	

	private LocalDateTime data;
	
	@Override
	//Criando um metodo >> exportanto >> obriga a implementar nas classes filhas
		public double calcularXp() {
		return XP_PADRAO;
	} 
	

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	}
	
	
	
