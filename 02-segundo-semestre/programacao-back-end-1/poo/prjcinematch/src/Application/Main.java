package Application;

import java.util.Scanner;

import Classes.Genre;
import Classes.Media;
import Classes.Movie;
import Classes.User;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("Admin", "admin@cinematch.com");
        char option = ' ';

        while (option != 'S') {
            System.out.println("\n===== CineMatch =====");
            System.out.println("A - Adicionar filme");
            System.out.println("E - Excluir filme");
            System.out.println("L - Listar filmes");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine().toUpperCase();
            
            if (input.isEmpty()) {
                option = ' ';
            } else {
                option = input.charAt(0);
            }

            switch (option) {
                case 'A':
                    System.out.println("\n--- Novo Filme ---");
                    System.out.print("Título: ");
                    String title = scanner.nextLine();

                    while (title.trim().isEmpty()) {
                        System.out.print("O título não pode ser vazio. Digite o título: ");
                        title = scanner.nextLine();
                    }

                    System.out.print("Ano de lançamento: ");
                    int year = 0;
                    try {
                        year = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                    }

                    System.out.print("Duração (em minutos): ");
                    int duration = 0;
                    try {
                        duration = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                    }

                    System.out.print("Gênero do filme: ");
                    String genreName = scanner.nextLine();

                    System.out.print("Descrição do gênero: ");
                    String genreDescription = scanner.nextLine();

                    Genre genre = new Genre(genreName, genreDescription);
                    Movie movie = new Movie(title, year, duration, genre);

                    user.addMovie(movie);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 'E':
                    if (user.getMovies().isEmpty()) {
                        System.out.println("\nO catálogo está vazio.");
                    } else {
                        System.out.println("\n--- Lista de Filmes ---");
                        user.displayInfo();
                        System.out.println("-----------------------");
                        
                        for (int i = 0; i < user.getMovies().size(); i++) {
                            Media media = user.getMovies().get(i);
                            media.displayDetails(i);
                        }

                        System.out.print("\nDigite o número do filme que deseja excluir: ");
                        int index;
                        try {
                            index = Integer.parseInt(scanner.nextLine()) - 1;
                        } catch (NumberFormatException e) {
                            index = -1;
                        }

                        if (user.removeMovie(index)) {
                            System.out.println("Filme excluído com sucesso!");
                        } else {
                            System.out.println("Erro: Filme não existe na lista ou opção inválida.");
                        }
                    }
                    break;

                case 'L':
                    if (user.getMovies().isEmpty()) {
                        System.out.println("\nO catálogo está vazio.");
                    } else {
                        System.out.println("\n--- Lista de Filmes ---");
                        user.displayInfo();
                        System.out.println("-----------------------");
                        
                        for (int i = 0; i < user.getMovies().size(); i++) {
                            Media media = user.getMovies().get(i);
                            media.displayDetails(i);
                        }
                    }
                    break;

                case 'S':
                    System.out.println("Encerrando o CineMatch...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        
        scanner.close();
    }
}