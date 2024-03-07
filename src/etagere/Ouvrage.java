package etagere;

public class Ouvrage {
	private String titre;
	private Genre genre;
	private String auteur;
	private String editeur;
	private int annee;
	private String isbn;
	public Ouvrage(String titre,Genre genre,String auteur,String editeur,int annee,String isbn) {
		this.titre=titre;
		this.genre=genre;
		this.auteur=auteur;
		this.editeur=editeur;
		this.annee=annee;
		this.isbn=isbn;
		
	}
	private Exemplaire[] exemplaires=new Exemplaire[50];
	private int nbExemplaire=0;
	public String getTitre() {
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public Genre getGenre() {
		return genre;
		
	}
	public String getEditeur() {
		return editeur;
	}
	public int getAnnee() {
		return annee;
	}
	public String getIsbn() {
		return isbn;
	}
	public String ajouterExemplaire() {
		if(nbExemplaire>=50) {
			System.out.println("pas assez de place");
			return null;
		}
		Exemplaire exemplaire=new Exemplaire(cote);
		exemplaire[nbExemplaire]=exemplaires;
		nbExemplaire++;
		return exemplaire;
		
	}
}
