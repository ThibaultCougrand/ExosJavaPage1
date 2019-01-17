package exercices1;


/**
 * Écrire un programme qui récupère deux entiers sur la "ligne de commande" et qui en
 * affiche la somme en fenêtre console, comme dans cet exemple :
 * 23 + 25 = 48
 * On vérifiera que les arguments fournis sont formés uniquement de chiffres, dans le cas
 * contraire, le programme s’interrompra.
 * @author thibault
 */

public class Exercice1 {

	public static void main(String[] args) {
		try {
			int nb1 = Integer.parseInt(args[0]);
			int nb2 = Integer.parseInt(args[1]);
			System.out.println(nb1 + " + " + nb2 + " = " + (nb1+nb2));
		} catch (NumberFormatException e){
			
			System.err.println("Il faut saisir des chiffres."  + e.getMessage());
		}
		
		System.out.println("je continue ");
	}

}
