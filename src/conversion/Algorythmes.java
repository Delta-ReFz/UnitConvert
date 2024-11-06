package conversion;

import java.util.Scanner;

public class Algorythmes {

    double resp3;
    Affichage reponse;
    Scanner s = new Scanner(System.in);

    Affichage affichage;

    public Algorythmes(Affichage reponse) {

        this.reponse = reponse;
    }

    public void conversion() {

        affichage.length();
    }


    public  void converter() {

        if (affichage.resp2.equals("m")) {
            System.out.println("Enter the number of meters you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your meters to (km,m,cm,mm)");

                String resp4 = s.nextLine();

                if (resp4.equals("km")) {

                    resp3 = resp3 / 1000;

                    System.out.println(resp3 + "km");
                }
            }
        }
    }
}











