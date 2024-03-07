package etagere;

public class Exemplaire {
	private String cote;
	private boolean disponibleEmprunt=true;
	public Exemplaire(String cote) {
		this.cote=cote;
		
	}
	public 	String getCote() {
		return cote;
	}
	public boolean isdisponible() {
		return disponibleEmprunt;
	}
	public void setDisponible(boolean disponibleEmprunt) {
		this.disponibleEmprunt=disponibleEmprunt;
	}
	

}
