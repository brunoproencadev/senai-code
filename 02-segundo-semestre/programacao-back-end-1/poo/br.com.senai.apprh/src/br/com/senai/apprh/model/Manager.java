package br.com.senai.apprh.model;

import br.com.senai.apprh.model.enums.ModeloTrabalho;

public class Manager extends Worker {
	private Double bonus;
	
	public Manager(String name, Double baseSalary, ModeloTrabalho modeloTrabalho, Double bonus) {
		super(name, baseSalary, modeloTrabalho);
		this.bonus = bonus;
	}

	@Override
	public double calcularSalarioTotal() {
		return this.baseSalary + bonus + modeloTrabalho.getAssistance();
	}

	@Override
	public String getCargo() {
		return "Manager";
	}

}