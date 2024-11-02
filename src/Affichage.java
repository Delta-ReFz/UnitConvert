import java.util.Scanner;

public class Affichage {

    public String msg1;
    public String resp1;

    Scanner s = new Scanner(System.in);

    public void affichage1() {

        msg1 = "Choose your physical quantities (length, temperature)";
        System.out.println(msg1);

    }

    public void reponse1() {

        resp1 = s.nextLine();
    }


}
