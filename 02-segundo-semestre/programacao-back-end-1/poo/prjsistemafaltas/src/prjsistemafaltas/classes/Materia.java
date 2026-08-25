package prjsistemafaltas.classes;

import prjsistmafaltas.enums.NomeMateria;

public class Materia {
	
	//Attributes
	private NomeMateria nomeMateria;
	private Integer totalAulas;
	private Professor professor;
	private Aluno aluno;
	private static final Double FALTAS_MAXIMAS;
	
	static {
		FALTAS_MAXIMAS = 0.25;
	}

	//Constructors
	public Materia() {}
	public Materia(NomeMateria nomeMateria, Integer totalAulas, Professor professor, Aluno aluno) {
		super();
		this.nomeMateria = nomeMateria;
		this.totalAulas = totalAulas;
		this.professor = professor;
		this.aluno = aluno;
	}


	//Getters and Setters
	public NomeMateria getNomeMateria() {
		return nomeMateria;
	}
	public void setNomeMateria(NomeMateria nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	public Integer getTotalAulas() {
		return totalAulas;
	}
	public void setTotalAulas(Integer totalAulas) {
		this.totalAulas = totalAulas;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public static Double getFaltasMaximas() {
		return FALTAS_MAXIMAS;
	}
	
	@Override
	public String toString() {
		return "Materia {nomeMateria=" + nomeMateria 
				+ ", totalAulas=" + totalAulas 
				+ ", professor=" + professor
				+ ", aluno=" + aluno 
				+ "}";
	}
	
	public void apresentar() {
		System.out.println("Matéria: " + nomeMateria 
				+ "\nAulas lecionadas: " + totalAulas 
				+ "\nProfessor: " + professor.getNome() 
				+ "\nAluno: " + aluno.getNome()
				+ "\nTotal de faltas: " + (totalAulas - aluno.getAulasPresente()));
	}

}