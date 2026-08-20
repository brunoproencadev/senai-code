package prjcompeticao.classes;

import java.util.Date;

public class Competicao {
	//Attributes
	private String nome;
	private Date data;
	private LocalEvento localEvento;
	private ModalidadeEsportiva modalidadeEsportiva;
	private Atleta atleta;
	private Resultado resultado;
	private String status;
	
	//Constructors
	public Competicao() {}
    public Competicao(String nome, LocalEvento localEvento) {
        this.nome = nome;
        this.localEvento = localEvento;
    }

	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public LocalEvento getCidadeSede() {
		return localEvento;
	}
	public void setCidadeSede(LocalEvento localEvento) {
		this.localEvento = localEvento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalEvento getLocalEvento() {
		return localEvento;
	}
	public void setLocalEvento(LocalEvento localEvento) {
		this.localEvento = localEvento;
	}
	public ModalidadeEsportiva getModalidadeEsportiva() {
		return modalidadeEsportiva;
	}
	public void setModalidadeEsportiva(ModalidadeEsportiva modalidadeEsportiva) {
		this.modalidadeEsportiva = modalidadeEsportiva;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "Competicao {nome=" + nome 
				+ ", data=" + data 
				+ ", cidadeSede=" + localEvento 
				+ ", status=" + status
				+ "}";
	}
	
}