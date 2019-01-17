package exercices1;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Générer un nombre aléatoire compris entre 0 et 1000. Demander ensuite à l’utilisateur de
deviner le nombre choisi par l’ordinateur. Il doit saisir un nombre compris entre 0 et 1000
lui aussi. Comparer le nombre saisi avec celui choisi par l’ordinateur et afficher sur la
console « c’est plus » ou « c’est moins » selon le cas. Recommencer jusqu’à ce que
l’utilisateur trouve le bon nombre. Afficher alors le nombre d’essais nécessaires pour
trouver la bonne réponse.
 * @author thibault
 *
 */
public class Exercice6et7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb = (int) (Math.random() * 1001);
		int count = 0;
		LocalTime lancement = LocalTime.now();
		System.out.println("Veuillez saisir un nombre entre 0 et 1000");
		boolean verif = true;
		while (verif) {
//			System.out.println(nb);
			int saisi = sc.nextInt();
			if (saisi >= 0 && saisi <= 1000) {
				if (saisi > nb) {
					System.out.println("C'est moins !");
				}
				else if (saisi < nb) {
					System.out.println("C'est plus !");
				}
				else {
					System.out.println("Bravo ! Le nombre était bien : " + nb);
					verif = false;
				}
			}
			else {
				System.out.println("Le chiffre à trouver se situe entre 0 et 1000 !");
			}
			count++;
		}
		LocalTime fin = LocalTime.now();
		Duration chrono = Duration.between(lancement, fin);
		long minutes = chrono.toMinutes();
		long secondes = chrono.getSeconds() - minutes*60;
		String timer = minutes + " minutes et " + secondes + " secondes";
		System.out.println("Vous avez trouvé en "+count+" essais! et en " + timer);
		sc.close();
	}
}
