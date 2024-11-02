import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String msg1 = "Choose your physical quantities:";
        System.out.println(msg1);

        Scanner s = new Scanner(System.in);

        String resp1 = s.nextLine();

        if(resp1.equals("length")) {
            System.out.println("you have chosen the length, decide which units you want to convert to: ");

            String resp2 = s.nextLine();

            if(resp2.equals("m")) {

                System.out.println("Chose the unit you want to convert your meters into: ");

                int resp3 = s.nextInt();

                if(resp3 >= 0) {

                    System.out.println("Decide which units you want to convert to:");

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
