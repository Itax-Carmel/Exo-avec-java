import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Exercices sur les boucles avec JAVA
    /*1. Ecrire un programme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.*/
    public static void dixEntierSuivant (){
      System.out.println("Veuillez saisir le nombre de depart: ");
      int numberUser = scanner.nextInt();
      for(int i = numberUser + 1; i <= numberUser + 10; i++){
       System.out.println(i);
      }
    }
    /*
    System.out.println("Veuillez saisir un nombre pour calculer sa factorielle: ");
    int numberUser = scanner.nextInt();
    int factorielle = 1;
    for(int i = 1; i <= 10; i++){
      factorielle = numberUser * i;
      System.out.println(numberUser + " * " + i + " = " + factorielle);
    }
    //System.out.println(numberUser + "! = " + factorielle);
    /*int add = 0;
    for(int i = 1; i <= numberUser; i++){
      add = add + i;
    }
    System.out.println("L'add des entiers jusqu'à " + numberUser + " = " + add);
    /*
    System.out.println("Veuillez saisir le nombre de depart: ");
    int numberUser = scanner.nextInt();
    for(int i = numberUser + 1; i <= numberUser + 10; i++){
      System.out.println(i);
    }
    /*
    System.out.println("Veuillez saisir le num2: ");
    int num2 = scanner.nextInt();
    int result = num1 + num2;
    System.out.println("Le résultat de " + num1 + " + " + num2 + " = " + result);*/
    scanner.close();
  }
}