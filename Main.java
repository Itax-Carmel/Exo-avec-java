import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Je fais appel aux méthodes ici
    // Exercices sur les boucles avec JAVA
    /*
     * dixEntierSuivant(scanner);
     * factorielle(scanner);
     * sommeDUneChaineDEntier(scanner);
     * tableDeMultiplication(scanner);
     */

    // Exercices sur les tableaux avec JAVA
    // displayArray(scanner);
    diagonalDUneMatrice(scanner);

    scanner.close();
  }

  /*
   * 1. Ecrire un programme qui demande un nombre de départ, et qui ensuite
   * affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le
   * nombre 17, le programme affichera les nombres de 18 à 27.
   */
  static void dixEntierSuivant(Scanner scanner) {
    System.out.println("Veuillez saisir le nombre de depart et le programme va vous donner les 10 entiers suivant: ");
    int numberUser = scanner.nextInt();
    for (int i = numberUser + 1; i <= numberUser + 10; i++) {
      System.out.println(i);
    }
  }

  /*
   * 2. Ecrire un programme qui calcule le factoriel d’un entier saisi au clavier.
   */
  static void factorielle(Scanner scanner) {
    System.out.println("Veuillez saisir un nombre pour trouver sa factorielle: ");
    int numberUser = scanner.nextInt();
    int factorielle = 1;
    for (int i = 1; i <= numberUser; i++) {
      factorielle = factorielle * i;
    }
    System.out.println(numberUser + "! = " + factorielle);
  }

  /*
   * 3. Ecrire un programme qui demande un nombre de départ, et qui calcule la
   * somme des entiers jusqu’à ce nombre. Par exemple, si l’on entre 5, le
   * programme doit calculer : 1 + 2 + 3 + 4 + 5 = 15 NB : on souhaite afficher
   * uniquement le résultat, pas la décomposition du calcul.
   */
  static void sommeDUneChaineDEntier(Scanner scanner) {
    System.out.println(
        "Veuillez saisir le nombre de depart, et le programme va faire la somme des entiers de 1 jusqu'au nombre que vous allez saisir: ");
    int numberUser = scanner.nextInt();
    int result = 0;
    for (int i = 0; i <= numberUser; i++) {
      result = result + i;
    }
    System.out.println("Le résultat est: " + result);
  }

  /*
   * 4. Ecrire un programme qui demande un nombre de départ, et qui ensuite écrit
   * la table de multiplication de ce nombre jusqu’à 10.
   */
  static void tableDeMultiplication(Scanner scanner) {
    System.out
        .println("Veuillez saisir un nombre, et le programme va donner la table de multiplication à 10 de ce nombre ");
    int numberUser = scanner.nextInt();
    int result = 1;
    for (int i = 0; i <= 10; i++) {
      result = numberUser * i;
      System.out.println(numberUser + " * " + i + " = " + result);
    }
  }

  /// --------------Les tableaux en JAVA
  /*
   * Exercice 1 : Écrivez un programme qui demande à l’utilisateur de saisir les
   * élements dans un tableau de 5 élements et affichez ensuite les éléments de ce
   * tableau.
   */
  static void displayArray(Scanner scanner) {
    // System.out.println("Veuillez saisir un nombre, et le programme va donner la
    // table de multiplication à 10 de ce nombre ");
    int array[] = new int[5];
    for (int i = 0; i < array.length; i++) {
      System.out.println("Veuillez saisir les éléments du tableau. " + (i + 1) + " :");
      array[i] = scanner.nextInt();
    }
    /*
     * System.out.println("Les éléments du tableau sont: ");
     * for (int i = 0; i < array.length; i++) {
     * System.out.println(array[i] + " ");
     * }
     */

    /*
     * Exercice 2 : Complétez l’exercice 1 en demandant à l’utilisateur de saisir
     * une valeur et vérifiez si cette valeur existe dans le tableau.
     */
    /*
     * System.out.println(
     * "Veuillez de nouveau saisir n'importe quelle valeur, et le programme va vérifier si la nouvelle valeur entrée se trouve dans le tableau"
     * );
     * int toVerify = scanner.nextInt();
     * for (int i = 0; i < array.length; i++) {
     * if (array[i] == toVerify) {
     * System.out.println(toVerify + " se trouve bel et bien dans le tableau");
     * break;
     * } else {
     * System.out.println(toVerify + " ne se trouve pas dans le tableau");
     * break;
     * }
     * }
     */

    /*
     * Exercice 3 : Complétez l’exercice 2 en affichant la somme de tous les
     * élements du tableau.
     */
    int addArray = 0;
    System.out.println("Le résultat de la somme des éléments du tableau est: ");
    for (int i = 0; i < array.length; i++) {
      addArray = addArray + array[i];
    }
    System.out.println(addArray);
    /*
     * Exercice 4 : Complétez l’execice 3, en affichant la moyenne des élements du
     * tableau
     */
    System.out.println("La moyenne du tableau est: " + (addArray / array.length));
  }

  /*
   * Exercice 5 : Ecrivez un programme qui demande à l’utilisateur de saisir les
   * élements d’un tableau de 4 lignes et 4 colonnes, puis affiche les élements de
   * la diagonal.
   */
  static void diagonalDUneMatrice(Scanner scanner) {
    int diagonal = 0;
    int array[][] = new int[4][4];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.println("Veuillez saisir l'élément de la ligne " + (i + 1) + " et de la colonne " + (j + 1) + " :");
        array[i][j] = scanner.nextInt();
      }
    }
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (i == j) {
          diagonal += array[i][j];
        }
      }
    }
    System.out.println("La somme des éléments de la diagonale de la matrice carrée est: " + diagonal);
  }
}
