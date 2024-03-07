package etagere;

public enum Genre {
	
		R("roman"),RP("roman policier"),SF("science fiction"),BD("bande desiner");
	
	private String nom;
	private Genre(String nom) {
		this.nom=nom;
	}
	public String toString() {
		return nom;
	}

}
