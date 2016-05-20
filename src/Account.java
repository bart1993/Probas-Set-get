import java.util.Scanner;

import static java.lang.System.out;


public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void display() {
        // Use stringbuilder here
        out.print(getName());
        out.print(" (");
        out.print(getAddress());
        out.print(") imeet $");
        out.print(getBalance() +"," +  " ");
        out.print(procenty());
        out.println();
        out.println();
    }

    /*
    float f = 0.00029121415
    float d = 0.0003
    pres = 0.00001
    (f - d) < pres
     */
    private double procenty() {
        double g;
        if (balance > 1000) {
            g = 0.05;
            System.out.println("Vasha stavka 5%,");
        } else {
            g = 0.02;
            System.out.println("Vasha stavka 2%");
        }
        g = balance * g;
        out.print("Procent za mesyac " );
        return g ;
    }

public void vizovPerevoda(){
    perevodSredstv();

}



    private double perevodSredstv() {
        double otnyt;

        Scanner keyboard = new Scanner(System.in);
        char reply;
        do {
            out.print("Vi xotite perevesti dengi? (y/n)");

            reply =
                    keyboard.findWithinHorizon(".", 0).charAt(0);

        } while (reply != 'y' && reply != 'n');

        if (reply == 'y') {
            Scanner summa = new Scanner(System.in);
            System.out.println("Kakyu summu vi xotite perevesti?");
            double summad = summa.nextDouble();
            otnyt = getBalance() - summad;
            if (otnyt < 0){
                System.out.println("Nedostatochno sredst");
            } else {
                setBalance(otnyt);
            }



        } else {
            out.println("Otmena");
        }

        return 0;


    }
}

