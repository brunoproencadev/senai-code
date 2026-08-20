package prjcompeticao.classes;

import java.time.LocalDate;

public class Atleta {
	//Attributes
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private static String registroFederacao;
    private static Integer contador;

    static { contador = 1099; }
    {
        registroFederacao = "RF" + contador;
        contador++;
    }

    //Constructors
    public Atleta() {}
    public Atleta(String nomeCompleto, LocalDate dataNascimento, String nacionalidade) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    //Getters and Setters
    public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public static void setRegistroFederacao(String registroFederacao) {
		Atleta.registroFederacao = registroFederacao;
	}
	public LocalDate getDataNascimento() { 
    	return dataNascimento; 
	}
    public String getNomeCompleto() { 
    	return nomeCompleto; 
	}
    public static String getRegistroFederacao() { 
    	return registroFederacao; 
	}
	
    @Override
	public String toString() {
		return "Atleta {nomeCompleto=" + nomeCompleto 
				+ ", dataNascimento=" + dataNascimento 
				+ ", nacionalidade="
				+ nacionalidade 
				+ "}";
	}
}