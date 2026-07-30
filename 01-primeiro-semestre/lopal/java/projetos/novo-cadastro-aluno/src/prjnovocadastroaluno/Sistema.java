package prjnovocadastroaluno;

public class Sistema {
	public static void main (String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "João";
		aluno1.idade = 20;
		aluno1.curso = "Engenharia de Software";
		
		aluno1.seApresentar();
	}
}