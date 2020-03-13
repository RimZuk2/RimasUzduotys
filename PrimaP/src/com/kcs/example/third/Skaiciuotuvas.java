package com.kcs.example.third;

import java.util.Scanner;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        Skaiciavimas skaiciavimas = new Skaiciavimas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite veiksmus: ");
        String line = sc.nextLine();
        //System.out.println(veiksmas);
        String[] elements = line.split(" ");
        double sk1 = Double.parseDouble(elements[0]);
        char veiksmas = elements[1].charAt(0);
        double sk2 = Double.parseDouble(elements[2]);
        switch (veiksmas) {
            case '+':
                skaiciavimas.skSuma(sk1, sk2);
                break;
            case '-':
                skaiciavimas.skMinus(sk1, sk2);
                break;
            case '/':
                skaiciavimas.skDalyba(sk1, sk2);
                break;
        }
    }
}

class Skaiciavimas {

    public void skSuma(double sk1, double sk2) {
        double suma = sk1 + sk2;
        System.out.println("Skaiciu suma: " + suma);
    }
    public void skMinus(double sk1, double sk2) {
        double atimtis = sk1 - sk2;
        System.out.println("Skaiciu atimtis: " + atimtis);
    }
    public void skDalyba(double sk1, double sk2) {
        if(sk2 != 0){
            double dalyba = sk1 / sk2;
            System.out.println("Skaiciu dalyba: " + dalyba);
        }else{
            System.out.println("Dalyba is 0 negalima");
        }
    }

}


