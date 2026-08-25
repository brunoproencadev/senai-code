package prjsistemafaltas.classes;

public class Usuario {
	//Attributes
	protected String nome;
	protected int idade;
	protected String codigoRegistro;
	protected static int contador;
	
	static {contador = 1050;} 
	
	//Constructors
	public Usuario () {}
	public Usuario(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}