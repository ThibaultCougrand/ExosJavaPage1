package exercices1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice4bis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> adresses = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Veuillez saisir une adresse mail");
			String saisi = sc.nextLine();
			if (saisi.contains("@") && saisi.substring(saisi.indexOf("@")).contains(".")) {
				adresses.add(saisi.substring((saisi.indexOf("@")+1), saisi.indexOf(".")));
			} else {
				System.out.println("ce n'est pas une adresse mail!");
				i--;
			}
		}
		adresses.sort(null);
		String operateur = adresses.get(0);
		int compteur = 0;
		for (int i = 0; i < adresses.size(); i++) {
			if (adresses.get(i).equals(operateur)) {
				compteur++;
			} else {
				System.out.println("Il y a " + compteur + " adresses "+ operateur + ".");
				operateur = adresses.get(i);
				compteur = 1;
			}
		}
		System.out.println("Il y a " + compteur + "adresses "+ operateur + ".");
		sc.close();

	}

}
