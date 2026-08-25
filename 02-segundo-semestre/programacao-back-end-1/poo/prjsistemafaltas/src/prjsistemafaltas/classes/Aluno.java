package prjsistemafaltas.classes;

public class Aluno extends Usuario{
	//Attributes

	private Integer aulasPresente;
	private Integer nota;
	
	{
		codigoRegistro = "RA" + contador;
		contador++;
	}
	
	//Constructors
	public Aluno() {}
	public Aluno(String nome, int idade, Integer aulasPresente, Integer nota) {
		super(nome, idade);
		this.aulasPresente = aulasPresente;
		this.nota = nota;
	}


	//Getters and Setters
	public Integer getAulasPresente() {
		return aulasPresente;
	}

	public void setAulasPresente(Integer aulasPresente) {
		this.aulasPresente = aulasPresente;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	//Initialization
	{
		nota = 100;
	
	}
	
	@Override
	public String toString() {
		return "Aluno {nome=" + nome 
				+ ", codigoRegistro=" + codigoRegistro 
				+ ", aulasPresente=" + aulasPresente 
				+ ", nota=" + nota
				+ "}";
	}

}
