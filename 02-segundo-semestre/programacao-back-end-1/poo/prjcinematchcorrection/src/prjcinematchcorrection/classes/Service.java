package prjcinematchcorrection.classes;

import java.util.List;
import java.util.Scanner;

public class Service {
	
	public void showMenu() {
		System.out.println("--------------------");
		System.out.println("		CINEMATCH");
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("1. Adicionar filme");
		System.out.println("2. Excluir filme");
		System.out.println("3. Listar filme");
		System.out.println("0. Sair");
		System.out.println("--------------------");
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public Genero buscarGeneroPorNome(List<Genero> generos, String name) {
		for(int i = 0; i < generos.size(); i++) {
			Genero g = generos.get(i);
			if (g.equals(name)) {
				return g;
			}
		}
		return null;
	}

	public Genero listarESelecionarGenero(List<Genero> listaGeneros, Scanner scanner) {
		
			System.out.println("\n-------- Gêneros Disponíveis --------");
			for(int i = 0; i < listaGeneros.size(); i++) {
				System.out.println("- " + listaGeneros.get(i).getName() 
						+ " (" + listaGeneros.get(i).getDescription() + ");");
			}
			System.out.println("\nDigite o nome do gênero desejado: ");
			String nomeEscolhido = scanner.nextLine();
			
			Genero generoEscolhido = buscarGeneroPorNome(listaGeneros, nomeEscolhido);
			
			if (generoEscolhido == null) {
				return generoEscolhido;
			}
			
			System.out.println("Gênero não encontrado!")
			return null;
	}
	 
	public Genero CriarNovoGenero(List<Genero> listaGeneros, Scanner scanner) {
		System.out.println("\n-------- Cadastro de Gênero --------");
		System.out.println("Nome do gênero: ");
		String nomeNovoGenero = scanner.nextLine();
		System.out.println("Descrição do gênero: ");
		String descricaoNovoGenero = scanner.nextLine();
		
		Genero generoNovo = new Genero(nomeNovoGenero, descricaoNovoGenero);
		listaGeneros.add(generoNovo);
		System.out.println("Gênero cadastrado com sucesso!");
		
		return generoNovo;
	}
}