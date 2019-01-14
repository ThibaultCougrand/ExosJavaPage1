package exercices1;

/**
 * Générer trois nombres aléatoires compris entre 0 et 1000, puis vérifier si vous avez deux
 * nombres pairs suivis par un nombre impair. Si ce n’est pas le cas, recommencer jusqu’à
 * ce vous ayez la combinaison pair, pair, impair. Afficher ensuite le nombre d’essais
 * nécessaires pour obtenir cette combinaison.
 * Indice : la classe Math propose la méthode statique random qui génère un nombre
 * aléatoire compris entre 0 et 1.
 * Exemple : double nb=Math.random();
 * @author thibault
 */
public class Exercice5bis {

	public static void main(String[] args) {
		int i = 0;
		boolean verif = true;
		while (verif) {
			int nb1 = (int) Math.floor(Math.random() * 1001);
			int nb2 = (int) Math.floor(Math.random() * 1001);
			int nb3 = (int) Math.floor(Math.random() * 1001);
			if (nb1%2 == 0 && nb2%2 == 0 && nb3%2 == 1) {
				System.out.println("il à trouvé en "+ i +" essai.");
				System.out.println(nb1 + " " + nb2 + " " + nb3);
				verif = false;
			}
			i++;
		}
		

	}

}
