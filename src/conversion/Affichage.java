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

        msg1 = "Choose your physical quantities (Length, Area, Force, Currency, Time, Volume, Temperature, Mass)";
        System.out.println(msg1);
        reponse1();
    }

    public void reponse1() {

        resp1 = s.nextLine().toLowerCase();

        switch (resp1) {
            case "length":
                length();
                break;
            case "temperature":
                temperature();
                break;
            case "mass":
                mass();
                break;
            case "volume":
                volume();
                break;
            case "force":
                force();
                break;
            case "time":
                time();
                break;
            case "area":
                area();
                break;
            case "currency":
                currency();
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid quantity.");
                affichage1();
                break;
        }
    }

    public void length() {

            System.out.println("You have chosen the length, decide which units you want to convert (miles,feet,inches,km,m,cm,mm,um,nm,pm)");
            resp2 = s.nextLine().toLowerCase();
            algorythmes.converter();

    }

    public void temperature() {

        System.out.println("You have chosen the temperature, decide which units you want to convert (K or C)");
        resp2 = s.nextLine().toLowerCase();
        algorythmes.converter();
    }

    public void mass() {

        System.out.println("You have chosen the mass, decide which units you want to convert (Kg,g,cg,mg)");
        resp2 = s.nextLine().toLowerCase();
        algorythmes.converter();

    }

    public void volume() {

    }

    public void force() {


    }

    public void time() {


    }

    public void area() {


    }

    public void currency() {


    }



}
