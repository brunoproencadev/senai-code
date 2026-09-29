package br.com.senai.apprh.model;

import br.com.senai.apprh.model.enums.ModeloTrabalho;

public class Supervisor extends Worker {
	
	public Supervisor(String name, Double baseSalary, ModeloTrabalho modeloTrabalho) {
		super(name, baseSalary, modeloTrabalho);
	}

	@Override
	public double calcularSalarioTotal() {
		return baseSalary + 1500 + modeloTrabalho.getAssistance();
	}

	@Override
	public String getCargo() {
		return "Supervisor";
	}

}
