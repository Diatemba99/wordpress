package sn.supinfo.supinfo;

public class Etudiant {

	private String nom;
	private String prenom;
	private String telephone;
	private String adresse;
	private String dateNaissance;
	
	

	//constructer un
	public Etudiant (){	}
	
	//constructer deux
		public Etudiant (String nom, String prenom, String telephone, String adresse,  String  dateNaissance)
		{
			this.nom = prenom;
			this.prenom = nom;
			this.telephone = telephone;
			this.adresse = adresse;
			this.dateNaissance = dateNaissance;
		}
		
		//Constructer trois
		public Etudiant(String prenom, String nom)
		{
			this.prenom = prenom;
			this.nom = nom;
			
		}
	
	
		
	//Starting getters and Setters	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", adresse=" + adresse
				+ ", dateNaissance=" + dateNaissance + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getTelephone()=" + getTelephone() + ", getAdresse()=" + getAdresse() + ", getDateNaissance()="
				+ getDateNaissance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

}
