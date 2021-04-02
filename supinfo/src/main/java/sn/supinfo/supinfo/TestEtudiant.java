package sn.supinfo.supinfo;

public class TestEtudiant {

	public static void main(String[] args) 
	{
        Etudiant e1 = new Etudiant();
		
		e1.setPrenom("IDE");
		e1.setNom("DIOP");
		e1.setAge(52);
		e1.setAdresse("SICAP");
		e1.setTelephone("77 885 96 74");
		
		Etudiant e2 = new Etudiant("Mamadou", "Ndiaye",55, "Bissau","77 545 10 20");
		
		Etudiant e3 = new Etudiant("Mamadou", "Ndiaye");
		
		
		//Affichage à l'aide de la methode ToString
		System.out.println(e1);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(e2);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(e3);
		
	}
}
