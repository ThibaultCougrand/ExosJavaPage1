package exercices1;

/**
 * Créer un adressesleau de dix chaînes de caractères puis remplir ce adressesleau avec des adresses
 * e-mail. Calculer ensuite, à partir des informations présentes dans le adressesleau, la part de
 * marché de chacun des fournisseurs d’accès.
 * Indice : dans une adresse e-mail, le nom du fournisseur d’accès est la partie située après
 * le caractère @ de l’adresse e-mail.
 * @author thibault
 */

public class Exercice4 {

	public static void main(String[] args) {
		String[] adresses = new String[10];
		int comptGmail = 0, comptOrange = 0, comptHotmail = 0, comptSfr = 0;
		adresses[0] = "aquaman@gmail.com";
		adresses[1] = "alfred@orange.fr";
        adresses[2] = "batman@hotmail.fr";
        adresses[3] = "robin@sfr.fr";
        adresses[4] = "superman@gmail.com";
        adresses[5] = "wonderwoman@sfr.fr";
        adresses[6] = "greenlantern@orange.fr";
        adresses[7] = "spiderman@gmail.com";
        adresses[8] = "antman@orange.fr";
        adresses[9] = "thor@hotmail.fr";
        for (int i = 0; i < adresses.length; i++) {
        	//System.out.println(adresses[i].substring(adresses[i].indexOf("@")));;
        	switch (adresses[i].substring(adresses[i].indexOf("@"), adresses[i].lastIndexOf("."))) {
	        	case "@gmail": comptGmail++;
	        	break;
	        	case "@orange": comptOrange++;
	        	break;
	        	case "@hotmail": comptHotmail++;
	        	break;
	        	case "@sfr": comptSfr++;
	        	break;
        	}
        }
        System.out.println("il y a " + comptGmail + " adresses gmail \nil y a " + comptOrange + " adresses orange \nil y a " + comptHotmail + " adresses hotmail \nil y a " + comptSfr + " adresses SFR");
        

	}

}
