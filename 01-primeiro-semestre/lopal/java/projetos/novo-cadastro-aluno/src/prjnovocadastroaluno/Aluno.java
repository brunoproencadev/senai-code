package prjnovocadastroaluno;

public class Aluno {
	String nome;
	Integer idade;
	String curso;
	
	void seApresentar() {
		System.out.println("Olá, meu nome é " 
							+ nome 
							+ ", tenho " 
							+ idade 
							+ " anos e estou cursando " 
							+ curso + ".");
	}
}
