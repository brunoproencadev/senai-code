package prjsenaimusic.application;

import java.util.Scanner;

import prjsenaimusic.classes.AudioMedia;
import prjsenaimusic.classes.Playlist;
import prjsenaimusic.classes.PodcastEpisode;
import prjsenaimusic.classes.Song;
import prjsenaimusic.classes.User;
import prjsenaimusic.enums.MusicGenre;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SISTEMA DE MÚSICA SENAI ---");
        
        System.out.print("Digite seu nome de usuário: ");
        String name = scanner.nextLine();
        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();
        User user = new User(name, email);

        System.out.print("Digite o título da sua nova Playlist: ");
        String playlistTitle = scanner.nextLine();
        Playlist playlist = new Playlist(playlistTitle);
        user.setMyPlaylist(playlist);

        String continueLoop = "s";
        while (continueLoop.equalsIgnoreCase("s")) {
            System.out.println("\nO que deseja adicionar? (Digite 'musica' ou 'podcast')");
            System.out.print("Escolha: ");
            String choice = scanner.nextLine().trim();

            if (!choice.equalsIgnoreCase("musica") && !choice.equalsIgnoreCase("podcast")) {
                System.out.println("Opção inválida! Por favor, digite 'musica' ou 'podcast'.");
                continue;
            }

            System.out.print("Título da Mídia: ");
            String title = scanner.nextLine();
            System.out.print("Duração (em segundos): ");
            int duration = scanner.nextInt();
            System.out.print("Ano de Lançamento: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Limpeza de Buffer

            AudioMedia newMedia = null;

            // Criação retorna para a Main
            if (choice.equalsIgnoreCase("musica")) {
                System.out.print("Nome da Banda/Artista: ");
                String artist = scanner.nextLine();
                System.out.print("Álbum: ");
                String album = scanner.nextLine();
                
                newMedia = new Song(title, duration, year, artist, album, MusicGenre.ROCK);
                
            } else if (choice.equalsIgnoreCase("podcast")) {
                System.out.print("Nome do Programa: ");
                String show = scanner.nextLine();
                System.out.print("Nome do Convidado: ");
                String guest = scanner.nextLine();
                
                newMedia = new PodcastEpisode(title, duration, year, show, guest);
            }

            if (newMedia != null) {
                playlist.addMedia(newMedia);
                System.out.println("Mídia adicionada com sucesso!");
            }

            System.out.print("\nDeseja adicionar mais mídias? (S/N): ");
            continueLoop = scanner.nextLine();
        }

        // CONSOLIDAÇÃO DOS DADOS
        System.out.println("\n==================================");
        System.out.println("       RESUMO DA PLAYLIST         ");
        System.out.println("==================================");
        
        Playlist userPlaylist = user.getMyPlaylist();
        
        for (AudioMedia media : userPlaylist.getItems()) {
            System.out.println("Playlist: " + userPlaylist.getTitle());
            System.out.println("Usuário: " + user.getUsername());
            System.out.println("Título da Mídia: " + media.getTitle());
            System.out.println("Duração: " + media.getDurationInSeconds() + " segundos");
            System.out.println("Tipo: " + media.getType());
            System.out.println("----------------------------------");
        }

        scanner.close();
    }
}