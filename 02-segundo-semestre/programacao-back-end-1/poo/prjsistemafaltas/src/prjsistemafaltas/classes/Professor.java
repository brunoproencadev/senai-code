package prjsistemafaltas.classes;

public class Professor extends Usuario{
	
	{
		codigoRegistro = "NIF" + contador;
		contador++;
	}
	
	//Constructors
	public Professor() {}
	public Professor(String nome) {
		super();
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Professor {nome=" + nome 
				+ ", codigoRegistro=" + codigoRegistro 
				+ "}";
	}
}