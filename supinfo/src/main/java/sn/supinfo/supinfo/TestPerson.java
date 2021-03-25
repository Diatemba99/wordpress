package sn.supinfo.supinfo;

public class TestPerson {

	public static void main(String[] args) {
	
		Personne p1 = new Personne();
		
		p1.setPrenom("IDE");
		p1.setNom("DIOP");
		p1.setAge(52);
		p1.setAdresse("SICAP");
		p1.setTelephone("77 885 96 74");
		
		Personne p2 = new Personne("Mamadou", "Ndiaye",55, "Bissau","77 545 10 20");
		
		Personne p3 = new Personne("Mamadou", "Ndiaye");
		
		
		//Affichage à l'aide de la methode ToString
		System.out.println(p1);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(p2);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(p3);

		
		
		/*Affichage sans la methode ToString
		 * System.out.println(p1.afficher());
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(p2.afficher());
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(p3.afficher());*/
		
		
		/*
		 * Avant de privatiser la variable
		p.prenom="JavaCoder";
		p.nom="Eclipse";
		p.adresse="Pikine";
		p.telephone= "77 854 74 96";
		p.age = 25;
		System.out.println(p.prenom + "\n" + p.nom + "\n" + p.adresse + "\n" + p.telephone + "\n" + p.age);
		*/
	}

}
