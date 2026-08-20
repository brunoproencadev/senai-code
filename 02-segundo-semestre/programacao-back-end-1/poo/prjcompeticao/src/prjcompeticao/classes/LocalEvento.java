package prjcompeticao.classes;

public class LocalEvento {
	//Attributes
	private String nomeLocal;
	private String enderecoCompleto;
	private Integer capacidadeMaxima;
	
	//Constructors
	public LocalEvento() {}
	public LocalEvento(String nomeLocal, String enderecoCompleto, Integer capacidadeMaxima) {
		super();
		this.nomeLocal = nomeLocal;
		this.enderecoCompleto = enderecoCompleto;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	//Getters and Setters
	public String getNomeLocal() {
		return nomeLocal;
	}
	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}
	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}
	public Integer getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(Integer capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	@Override
	public String toString() {
		return "LocalEvento {nomeLocal=" + nomeLocal 
				+ ", enderecoCompleto=" + enderecoCompleto 
				+ ", capacidadeMaxima="
				+ capacidadeMaxima 
				+ "}";
	}
}
