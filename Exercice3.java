package exercices1;

/**
 * 1.Déclarer les deux tableaux ci-dessus:
 * 2.Créer une fonction permettant d’afficher les éléments de chaque tableau ligne par ligne.
 * 3.Créer un programme de Test (main).
 * @author thibault
 */

public class Exercice3 {
	public static void affiche(int[][] tableau2D) {
		for (int i = 0; i < tableau2D.length; i++) {
			for (int j = 0; j < tableau2D[i].length; j++) {
				System.out.print(tableau2D[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int matrice1[][] = {{2,4,5},{3,33,35}};
		int matrice2[][] = {{3},{3,4,5},{3,5},{3,1,0}};
		affiche(matrice1);
		affiche(matrice2);
	}
}
