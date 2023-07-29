import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Exercices sur les boucles avec JAVA
    dixEntierSuivant(scanner);
    factorielle(scanner);
    
    scanner.close();  
  }
  /*1. Ecrire un programme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.*/
  static void dixEntierSuivant (Scanner scanner){
    System.out.println("Veuillez saisir le nombre de depart: ");
    int numberUser = scanner.nextInt();
    for(int i = numberUser + 1; i <= numberUser + 10; i++){
      System.out.println(i);
    }
  }
  /*2. Ecrire un programme qui calcule le factoriel d’un entier saisi au clavier.*/
  static void factorielle (Scanner scanner){
    System.out.println("Veuillez saisir un nombre pour trouver sa factorielle: ");
    int numberUser = scanner.nextInt();
    int factorielle = 1;
    for(int i = 1; i <= numberUser; i++){
      factorielle = factorielle * i;
    }
    System.out.println(numberUser + "! = " + factorielle);
  }
}
