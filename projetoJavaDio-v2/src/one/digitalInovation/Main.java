package one.digitalInovation;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import one.digitalInovation.dominio.Bootcamp;
import one.digitalInovation.dominio.Conteudo;
import one.digitalInovation.dominio.Curso;
import one.digitalInovation.dominio.Dev;
import one.digitalInovation.dominio.Mentoria;

public class Main {
	
		public static void main(String[] args) {
		
		//link: https://www.youtube.com/watch?v=D4QfCGNq4Mc
		Curso cursoJAVA = new Curso();
		cursoJAVA.setTitulo("Java B�sico");
		cursoJAVA.setDescricao("Aprenda os conceitos b�sicos de JAVA");
		cursoJAVA.setCargaHoraria(8);
		
		Curso cursoDotNet = new Curso();
		cursoDotNet.setTitulo(".NET");
		cursoDotNet.setDescricao("Aprenda os conceitos b�sicos de DotNet");
		cursoDotNet.setCargaHoraria(8);
		
		Curso cursoJavaAvancado = new Curso();
		cursoJavaAvancado.setTitulo("Java B�sico");
		cursoJavaAvancado.setDescricao("Aprenda os conceitos avan�ado de JAVA");
		cursoJavaAvancado.setCargaHoraria(8);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Aprendendo Orienta��o a Objetos com JAVA");
		mentoria.setDescricao("Imers�o dos pilares da Orienta��o Objeto");
		mentoria.setData(LocalDateTime.now().plusDays(1));
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("GTF START#2 JAVA");
		bootcamp.setInicio(LocalDateTime.now());
		bootcamp.setFim(bootcamp.getInicio().plusDays(45));
		//Conteudo � uma lista de conteudos    /Armazenando dados no meu array // T 1:10
		List<Conteudo> conteudosBootcamp = Arrays.asList(mentoria);
		bootcamp.setConteudos(conteudosBootcamp);
		
		Dev felipao = new Dev();
		felipao.setNome("Felipao");
		//Implementando um m�todo inscrever >> na classe DEV >>
		felipao.inscrever(cursoDotNet);
		felipao.inscrever(bootcamp);
		felipao.progredir();
		felipao.progredir();
		
		Dev jackson = new Dev();
		jackson.setNome("Jackson");
		//Implementando um m�todo progredir >> na classe DEV >>
		jackson.inscrever(cursoDotNet);
		felipao.inscrever(bootcamp);
		jackson.progredir();
		jackson.progredir();
		jackson.progredir();
		jackson.progredir();
		jackson.progredir();
		

		System.out.println(String.format("XP Felip�o: %.2f", felipao.calcularTotalXp()));
		System.out.println(String.format("XP Jackson: %.2f", jackson.calcularTotalXp()));
		
		List<Dev> ranking = Arrays.asList(felipao, jackson).stream()
								  .sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
								  .collect(Collectors.toList());
		
		for (Dev dev : ranking) {
			System.out.println(dev.getNome());
		}	
		
	}
}
