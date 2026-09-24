package prjcinematchcorrection.classes;

public class Genero {
	//Attributes
	private String name;
	private String description;
	
	//Constructors
	public Genero() {}
	public Genero(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "{\n" 
				+ "	\"nome\":\"" + name 
				+ "\",\n"
				+ "	\"descricao\": \"" + description + "\"\n"
				+ "}";
	}

}