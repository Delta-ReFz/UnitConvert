package conversion;

import java.util.Scanner;

public class Algorythmes {

    double resp3;
    Affichage reponse;
    Scanner s = new Scanner(System.in);


    public Algorythmes(Affichage reponse) {

        this.reponse = reponse;
    }


    public void converter() {

        if (reponse.resp2.equals("m")) {
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
                if (resp4.equals("m")) {

                    System.out.println(resp3 + "m");
                }
                if (resp4.equals("cm")) {

                    resp3 = resp3 * 100;

                    System.out.println(resp3 + "cm");

                }
                if (resp4.equals("mm")) {

                    resp3 = resp3 * 1000;

                    System.out.println(resp3 + "mm");
                }
            }
        }
        if (reponse.resp2.equals("km")) {

            System.out.println("Enter the number of kilometers you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your kilometers to (km,m,cm,mm)");

                String resp4 = s.nextLine();

                if (resp4.equals("m")) {

                    resp3 = resp3 * 1000;
                    System.out.println(resp3 + "m");
                }
                if (resp4.equals("km")) {

                    System.out.println(resp3 + "km");
                }
                if (resp4.equals("cm")) {

                    resp3 = resp3 * 100000;
                    System.out.println(resp3 + "cm");
                }
                if (resp4.equals("mm")) {

                    resp3 = resp3 * 1000000;
                    System.out.println(resp3 + "mm");
                }
            }

        }
        if (reponse.resp2.equals("cm")) {

            System.out.println("Enter the number of centimeters you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your centimeters to (km,m,cm,mm)");

                String resp4 = s.nextLine();

                if (resp4.equals("m")) {

                    resp3 = resp3 / 100;
                    System.out.println(resp3 + "m");
                }
                if (resp4.equals("km")) {

                    resp3 = resp3 / 100000;
                    System.out.println(resp3 + "km");
                }
                if (resp4.equals("cm")) {

                    System.out.println(resp3 + "cm");
                }
                if (resp4.equals("mm")) {

                    resp3 = resp3 * 10;
                    System.out.println(resp3 + "mm");
                }


            }
        }
        if(reponse.resp2.equals("mm")) {

            System.out.println("Enter the number of millimiters you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();

            if (resp3 >= 0) {

                System.out.println("Decide which units you want to convert your millimeters to (km,m,cm,mm)");

                String resp4 = s.nextLine();

                if (resp4.equals("m")) {

                    resp3 = resp3 / 1000;
                    System.out.println(resp3 + "m");
                }
                if (resp4.equals("km")) {

                    resp3 = resp3 / 1000000;
                    System.out.println(resp3 + "km");
                }
                if (resp4.equals("cm")) {

                    resp3 = resp3 / 10;
                    System.out.println(resp3 + "cm");
                }
                if (resp4.equals("mm")) {

                    System.out.println(resp3 + "mm");
                }
            }


        }
    }
}











