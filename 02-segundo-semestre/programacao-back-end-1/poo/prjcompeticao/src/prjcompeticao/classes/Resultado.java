package prjcompeticao.classes;

public class Resultado {
	//Attributes
	private Integer posicao;
	private Integer pontuacao;
	private Atleta atleta;
	private ModalidadeEsportiva modalidadeEsportiva;
	private Competicao competicao;
	
	//Constructors
	public Resultado() {}
	public Resultado(Integer posicao, Integer pontuacao, Atleta atleta, ModalidadeEsportiva modalidadeEsportiva,
			Competicao competicao) {
		super();
		this.posicao = posicao;
		this.pontuacao = pontuacao;
		this.atleta = atleta;
		this.modalidadeEsportiva = modalidadeEsportiva;
		this.competicao = competicao;
	}
	
	//Getters and Setters
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	public Atleta getAtleta() {
		return atleta;
	}
	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}
	public ModalidadeEsportiva getModalidadeEsportiva() {
		return modalidadeEsportiva;
	}
	public void setModalidadeEsportiva(ModalidadeEsportiva modalidadeEsportiva) {
		this.modalidadeEsportiva = modalidadeEsportiva;
	}
	public Competicao getCompeticao() {
		return competicao;
	}
	public void setCompeticao(Competicao competicao) {
		this.competicao = competicao;
	}
	@Override
	public String toString() {
		return "Resultado {posicao=" + posicao 
				+ ", pontuacao=" + pontuacao 
				+ ", atleta=" + atleta
				+ ", modalidadeEsportiva=" + modalidadeEsportiva 
				+ ", competicao=" + competicao 
				+ "}";
	}
}
