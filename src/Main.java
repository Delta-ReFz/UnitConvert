import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Affichage affichage = new Affichage();
        Affichage reponse = new Affichage();
        Algorythmes convert = new Algorythmes(reponse);

        Scanner s = new Scanner(System.in);

        affichage.affichage1();
        reponse.reponse1();

        convert.conversion();

    }


}
