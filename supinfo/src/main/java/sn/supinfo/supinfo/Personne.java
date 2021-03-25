package sn.supinfo.supinfo;

public class Personne 
{
	private	String prenom;
	private String nom;
	private String adresse;
	private String email;
	private String telephone;
	
	//constructer un
	public Personne (){	}
	
	//constructer deux
	public Personne (String prenom, String nom, int age, String tel, String adresse)
	{
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = tel;
		this.age = age;
	}
	
	//Constructer trois
	public Personne(String prenom, String nom)
	{
		this.prenom = prenom;
		this.nom = nom;
		
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
	
	/*public  void afficher() 
	{
		System.out.println("I'm Person Class");
	}*/
	
	//Creation de la methode pour afficher le contenu des Constructeurs
	
	public String afficher()
	{
		return ("Prénom: " + prenom + "\nNom: " + nom + "\nAge:" + age + "\nAdresse" + adresse + "\nTéléphone: " + telephone);
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", email=" + email
				+ ", telephone=" + telephone + ", age=" + age + ", getPrenom()=" + getPrenom() + ", getNom()="
				+ getNom() + ", getAdresse()=" + getAdresse() + ", getEmail()=" + getEmail() + ", getTelephone()="
				+ getTelephone() + ", getAge()=" + getAge() + ", afficher()=" + afficher() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
