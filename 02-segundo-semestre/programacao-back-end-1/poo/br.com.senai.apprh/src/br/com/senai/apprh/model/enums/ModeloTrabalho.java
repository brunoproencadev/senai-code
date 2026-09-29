package br.com.senai.apprh.model.enums;

public enum  ModeloTrabalho {
	PRESENCIAL(0.0, "Trabalho 100% presencial"),
	HIBRIDO(300.0, "Trabalho híbrido com ajuda de custo e deslocamento"),
	REMOTO(150.0, "Trabalho remoto com auxilio internet");
	
	private Double assistance;
	private String description;
	
	private ModeloTrabalho(Double assistance, String description) {
		this.assistance = assistance;
		this.description = description;
	}

	public Double getAssistance() {
		return assistance;
	}

	public String getDescription() {
		return description;
	}
	
}