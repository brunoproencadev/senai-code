package prjcinematchcorrection.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prjcinematchcorrection.classes.Filme;
import prjcinematchcorrection.classes.Genero;
import prjcinematchcorrection.classes.Usuario;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe seu email: ");
		String email = scanner.nextLine();
		
		Usuario usuario = new Usuario(nome, email);
		List<Genero> listaGeneros = new ArrayList<>();
		int option = -1;
		while (option != 0) {
			
			System.out.println("Escolha a opção: ");
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			case 1:
				System.out.println("\n--------Adicionar filmes--------");
				System.out.println("Título: ");
				String titulo = scanner.nextLine();
				System.out.println("Ano de lançamento: ");
				int ano = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Duração (em minutos): ");
				int duracao = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("\n-------- Gêneros --------");
				System.out.println("1. Usar um existente");
				System.out.println("2. Criar um novo");
				System.out.println("Opção: ");
				int opcaoGenero = scanner.nextInt();
				scanner.nextLine();
				
				Genero generoSelecionado = null;
				
				if(opcaoGenero == 1 ) {
					
				} else if (opcaoGenero == 2) {
					
				} else {
					System.out.println("Opção de gênero inválida");
				}
				
				Filme novoFilme = new Filme(titulo, ano, duracao, generoSelecionado);
				usuario.adicionarFilme(novoFilme);
				System.out.println("Filme foi adicionado");
				break;
			case 2:
				List<Filme> filmes = usuario.getCatalogo();
				for (int i = 0; i < filmes.size(); i++) {
					System.out.println(i + ". " + filmes.get(i).getTitle());
				}
				System.out.println("Informe o número do filme que você deseja excluir: ");
				int escolha = scanner.nextInt();
				scanner.nextLine();
				break;
			case 3:
				System.out.println("\n--------Catálogo de filmes--------");
				System.out.println(usuario.toString());
				break;
			default:
				System.out.println("Opção inválida! \n");
			}
		}
		scanner.close();
	}
}