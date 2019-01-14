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

public class Exercice5 {

	public static void main(String[] args) {
		int i = 1;
		boolean verif = true;
		while (verif) {
			//1
			int nb1 = (int) Math.floor(Math.random() * 1001);
			int nb2 = (int) Math.floor(Math.random() * 1001);
			int nb3 = (int) Math.floor(Math.random() * 1001);

			//2
			String nb1s = String.valueOf(nb1);
			String nb2s = String.valueOf(nb2);
			String nb3s = String.valueOf(nb3);

			//3
			//			System.out.println(nb1s.substring(nb1s.length()-1));

			//4
			boolean verif1;
			switch (nb1s.substring(nb1s.length()-1)) {
			case "0": case "2": case "4": case "6": case "8": verif1 = true;
			break;
			default: verif1 = false;
			}

			boolean verif2;
			switch (nb2s.substring(nb2s.length()-1)) {
			case "0": case "2": case "4": case "6": case "8": verif2 = true;
			break;
			default: verif2 = false;
			}

			boolean verif3;
			switch (nb3s.substring(nb3s.length()-1)) {
			case "0": case "2": case "4": case "6": case "8": verif3 = true;
			break;
			default: verif3 = false;
			}

			if (verif1 == true && verif2 == true && verif3 == false) {
				System.out.println("il a trouvé en "+ i +" essai.");
				System.out.println(nb1 + " " + nb2 + " " + nb3);
				verif = false;
			}
			i++;
		}



	}

}
