import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Affichage affichage = new Affichage();
        Affichage reponse = new Affichage();

        Scanner s = new Scanner(System.in);

        double resp3 = 0;

        affichage.affichage1();
        reponse.reponse1();

        if(reponse.resp1.equals("length")) {
            System.out.println("You have chosen the length, decide which units you want to convert (km,m,cm,mm)");

            String resp2 = s.nextLine();

            if(resp2.equals("m")) {

                System.out.println("Enter the number of meters you want to convert:");

                resp3 = s.nextInt();
                s.nextLine();

                if(resp3 >= 0) {

                    System.out.println("Decide which units you want to convert your meters to (km,m,cm,mm)");

                    String resp4 = s.nextLine();

                    if(resp4.equals("km")) {

                        resp3 = resp3 /1000;

                        System.out.println(resp3 + "km");
                    }
                }
            }
        }

        else {
            System.out.println("you chose something else");
        }
    }
}
