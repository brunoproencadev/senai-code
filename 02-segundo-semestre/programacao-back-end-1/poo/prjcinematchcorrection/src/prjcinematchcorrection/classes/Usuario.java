package prjcinematchcorrection.classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	//Attributes
	private String name;
	private String email;
	private List<Filme> catalogo;
	
	//Constructors
	public Usuario(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.catalogo = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Filme> getCatalogo() {
		return catalogo;
	}

	@Override
	public String toString() {
		return "{\n" + 
				"	\"name\": \"" + name + "\",\n" +
				"	\"email\": \"" + email + "\",\n" +
				"	\"catalogo\": " + catalogo.toString() +
				"}";
	}
	
	public void adicionarFilme(Filme filme) {
		catalogo.add(filme);
	}
	
	
}