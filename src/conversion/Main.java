package conversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Affichage affichage = new Affichage();
        Algorythmes convert = new Algorythmes(affichage);

        Scanner s = new Scanner(System.in);

        affichage.setAlgorythmes(convert);

        affichage.affichage1();
        affichage.reponse1();

        convert.conversion();

    }


}
