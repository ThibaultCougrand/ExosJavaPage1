package exercices1;

/**
 * Écrire un programme permettant de lire le nom et le prénom d'un étudiant, ensuite
 * transforme le nom en majuscule, la première lettre du prénom en majuscule et le reste en
 * minuscule.
 * @author thibault
 */

public class Exercice2 {

	public static void main(String[] args) {
		String nom = "cougrand";
		String prenom = "thibault";
		System.out.println(nom.toUpperCase() + "\n" + prenom.substring(0,1).toUpperCase()+prenom.substring(1).toLowerCase());

	}

}
