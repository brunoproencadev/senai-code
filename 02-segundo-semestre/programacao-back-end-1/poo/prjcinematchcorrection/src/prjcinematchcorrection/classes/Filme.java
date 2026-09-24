package prjcinematchcorrection.classes;

public class Filme {
	//Attributes
	private String title;
	private Integer releaseYear;
	private Integer durationInMinutes;
	private Genero genero;
	
	//Constructors
	public Filme() {}
	public Filme(String title, Integer releaseYear, Integer durationInMinutes, Genero genero) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.durationInMinutes = durationInMinutes;
		this.genero = genero;
	}
	
	//Getters and Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getDurationInMinutes() {
		return durationInMinutes;
	}
	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "{\n" +
				"	\"title\": \"" + title + "\",\n" +
				"	\"releaseYear\": " + releaseYear + ",\n" + 
				"	\"durationInMinutes\": " + durationInMinutes + ",\n" +
				"	\"genero\":" + genero.toString() + "\n" +
				"}";
	}
	
	
	
}
