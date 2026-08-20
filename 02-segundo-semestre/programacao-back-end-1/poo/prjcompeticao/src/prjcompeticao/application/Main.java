package prjcompeticao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import prjcompeticao.classes.Atleta;
import prjcompeticao.classes.Competicao;
import prjcompeticao.classes.LocalEvento;
import prjcompeticao.classes.ModalidadeEsportiva;

public class Main {
    public static void main(String[] args) {
         var scanner = new Scanner(System.in);
         var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         
         Competicao competicao = new Competicao();
         
         //Competition
         System.out.print("Informe o nome da competição: ");
         competicao.setNome(scanner.nextLine());
         
         System.out.print("Informe o local do evento: ");
         competicao.setLocalEvento(new LocalEvento(scanner.nextLine(), null, null));

         //Modality
         System.out.print("Informe a modalidade esportiva: ");
         competicao.setModalidadeEsportiva(new ModalidadeEsportiva(scanner.nextLine(), null, null, null));

         //Athlete
         System.out.print("\nInforme o nome do atleta: ");
         String nome = scanner.nextLine();

         LocalDate dataNascimento = null;
         try {
             System.out.print("Informe a data de nascimento do atleta (dd/mm/aaaa): ");
             dataNascimento = LocalDate.parse(scanner.nextLine(), formatter);
         } catch (DateTimeParseException e) {
             System.out.println("[AVISO] Data inválida. O cadastro prosseguirá sem a data.");
         }

         System.out.print("Informe a nacionalidade do atleta: ");
         String nacionalidade = scanner.nextLine();
        
         competicao.setAtleta(new Atleta(nome, dataNascimento, nacionalidade));

         //Output
         System.out.println("\n=== DADOS CADASTRADOS ===");
         System.out.println("Competição: " + competicao.getNome());
         System.out.println("Local: "      + competicao.getLocalEvento().getNomeLocal());
         System.out.println("Modalidade: " + competicao.getModalidadeEsportiva().getNome());
         System.out.println("Atleta: "     + competicao.getAtleta().getNomeCompleto());
         
         if (competicao.getAtleta().getDataNascimento() != null) {
             System.out.println("Nascimento: " + competicao.getAtleta().getDataNascimento().format(formatter));
         }
         System.out.println("Registro: "   + Atleta.getRegistroFederacao());
         
         scanner.close();
    }
}