package br.com.senai.apprh.model;

import br.com.senai.apprh.model.enums.ModeloTrabalho;

public abstract class Worker {
	
	protected String name;
	protected Double baseSalary;
	protected ModeloTrabalho modeloTrabalho;
	
	public Worker() {}
	public Worker(String name, Double baseSalary, ModeloTrabalho modeloTrabalho) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.modeloTrabalho = modeloTrabalho;
	}

	public String getName() {
		return this.name;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public ModeloTrabalho getModeloTrabalho() {
		return modeloTrabalho;
	}
	// Sobrecarga
	public void aplicarAumento(Double valor) {
		this.baseSalary += valor;
	}
	public void aplicarAumento(Double valor, boolean isPercentual) {
		if(isPercentual) {
			this.baseSalary += this.baseSalary * (valor/100);
		} else {aplicarAumento(valor);}
	}
	
	public abstract double calcularSalarioTotal();
	public abstract String getCargo();
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", baseSalary=" + baseSalary + ", modeloTrabalho=" + modeloTrabalho + "]";
	}
	
}