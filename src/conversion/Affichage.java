package conversion;

import java.util.Scanner;

public class Affichage {

    public String msg1;
    public String resp1;
    public String resp2;

    Scanner s = new Scanner(System.in);

    private Algorythmes algorythmes;

    public void setAlgorythmes(Algorythmes algorythmes) {

        this.algorythmes = algorythmes;
    }

    public void affichage1() {

        msg1 = "Choose your physical quantities (Length, Temperature, Mass)";
        System.out.println(msg1);
        reponse1();
    }

    public void reponse1() {

        resp1 = s.nextLine();
        length();
    }

    public void length() {

        if (resp1.equals("Length")) {
            System.out.println("You have chosen the length, decide which units you want to convert (km,m,cm,mm)");
            resp2 = s.nextLine();
            algorythmes.converter();
        }
    }


}
