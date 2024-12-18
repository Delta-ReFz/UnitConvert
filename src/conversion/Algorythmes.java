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

        convertm();
        convertkm();
        convertcm();
        convertmm();
        convertK();
        convertC();
        convertum();
        convertnm();
        convertpm();

    }

    public void convertK() {

        if (reponse.resp2.equals("K")) {
            System.out.println("Enter the number of Kelvin you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your Kelvins to (C)");

                String resp4 = s.nextLine().toLowerCase();

                if (resp4.equals("c")) {

                    resp3 = resp3 - 273.15;

                    System.out.println(resp3 + "Celsius");
                }

            }
        }

    }

    public void convertC() {

        if (reponse.resp2.equals("C")) {
            System.out.println("Enter the number of Celsius you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your Celsius to (K)");

                String resp4 = s.nextLine().toLowerCase();

                if (resp4.equals("C")) {

                    resp3 = resp3 + 273.15;

                    System.out.println(resp3 + "Kelvin");
                }

            }
        }

    }

    public void convertm() {

        if (reponse.resp2.equals("m")) {
            System.out.println("Enter the number of meters you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your meters to (km,m,cm,mm)");

                String resp4 = s.nextLine().toLowerCase();

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
    }

    public void convertkm() {

        if (reponse.resp2.equals("km")) {

            System.out.println("Enter the number of kilometers you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your kilometers to (km,m,cm,mm)");

                String resp4 = s.nextLine().toLowerCase();

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

    }

    public void convertcm() {

        if (reponse.resp2.equals("cm")) {

            System.out.println("Enter the number of centimeters you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();
            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your centimeters to (km,m,cm,mm)");

                String resp4 = s.nextLine().toLowerCase();

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
    }

    public void convertmm() {

        if(reponse.resp2.equals("mm")) {

            System.out.println("Enter the number of millimiters you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();

            if (resp3 >= 0) {

                System.out.println("Decide which units you want to convert your millimeters to (km,m,cm,mm,um,nm,pm)");

                String resp4 = s.nextLine().toLowerCase();

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

                if (resp4.equals("um")) {

                    resp3 *= 1000;
                    System.out.println(resp3 + "um");
                }

                if (resp4.equals("nm")) {

                    resp3 *= 1000000;
                    System.out.println(resp3 + "nm");
                }
            }


        }
    }

    public void convertum() {

        if (reponse.resp2.equals("um")) {
            System.out.println("Enter the number of micrometers you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();

            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your micrometers to (km, m, cm, mm, um, nm, pm)");

                String resp4 = s.nextLine().toLowerCase();

                if (resp4.equals("m")) {
                    resp3 = resp3 / 1_000_000;
                    System.out.println(resp3 + "m");
                }
                if (resp4.equals("km")) {
                    resp3 = resp3 / 1_000_000_000;
                    System.out.println(resp3 + "km");
                }
                if (resp4.equals("cm")) {
                    resp3 = resp3 / 10_000;
                    System.out.println(resp3 + "cm");
                }
                if (resp4.equals("mm")) {
                    resp3 = resp3 / 1_000;
                    System.out.println(resp3 + "mm");
                }
                if (resp4.equals("um")) {
                    System.out.println(resp3 + "um");
                }
                if (resp4.equals("nm")) {
                    resp3 *= 1_000;
                    System.out.println(resp3 + "nm");
                }
                if (resp4.equals("pm")) {
                    resp3 *= 1_000_000;
                    System.out.println(resp3 + "pm");
                }
            }
        }

    }

    public void convertnm() {

        if (reponse.resp2.equals("nm")) {
            System.out.println("Enter the number of nanometers you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();

            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your nanometers to (km, m, cm, mm, um, nm, pm)");

                String resp4 = s.nextLine().toLowerCase();

                if (resp4.equals("m")) {
                    resp3 = resp3 / 1_000_000_000;
                    System.out.println(resp3 + "m");
                }
                if (resp4.equals("km")) {
                    resp3 = resp3 / 1_000_000_000_000L;
                    System.out.println(resp3 + "km");
                }
                if (resp4.equals("cm")) {
                    resp3 = resp3 / 10_000_000;
                    System.out.println(resp3 + "cm");
                }
                if (resp4.equals("mm")) {
                    resp3 = resp3 / 1_000_000;
                    System.out.println(resp3 + "mm");
                }
                if (resp4.equals("um")) {
                    resp3 = resp3 / 1_000;
                    System.out.println(resp3 + "um");
                }
                if (resp4.equals("nm")) {
                    System.out.println(resp3 + "nm");
                }
                if (resp4.equals("pm")) {
                    resp3 *= 1_000;
                    System.out.println(resp3 + "pm");
                }
            }
        }

    }

    public void convertpm() {

        if (reponse.resp2.equals("pm")) {
            System.out.println("Enter the number of picometers you want to convert:");
            resp3 = s.nextDouble();
            s.nextLine();

            if (resp3 >= 0) {
                System.out.println("Decide which units you want to convert your picometers to (km, m, cm, mm, um, nm, pm)");

                String resp4 = s.nextLine().toLowerCase();

                if (resp4.equals("m")) {
                    resp3 = resp3 / 1_000_000_000_000L;
                    System.out.println(resp3 + "m");
                }
                if (resp4.equals("km")) {
                    resp3 = resp3 / 1_000_000_000_000_000L;
                    System.out.println(resp3 + "km");
                }
                if (resp4.equals("cm")) {
                    resp3 = resp3 / 10_000_000_000L;
                    System.out.println(resp3 + "cm");
                }
                if (resp4.equals("mm")) {
                    resp3 = resp3 / 1_000_000_000L;
                    System.out.println(resp3 + "mm");
                }
                if (resp4.equals("um")) {
                    resp3 = resp3 / 1_000_000;
                    System.out.println(resp3 + "um");
                }
                if (resp4.equals("nm")) {
                    resp3 = resp3 / 1_000;
                    System.out.println(resp3 + "nm");
                }
                if (resp4.equals("pm")) {
                    System.out.println(resp3 + "pm");
                }
            }
        }

    }

}











