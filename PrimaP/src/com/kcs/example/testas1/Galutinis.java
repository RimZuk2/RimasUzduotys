package com.kcs.example.testas1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Galutinis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius ir zenkla tarp ju: ");
        String line = sc.nextLine();
        String[] elements = line.split(" ");
        double sk1 = getCorrectDouble(elements[0]);
        char veiksmas = elements[1].charAt(0);
        double sk2 = getCorrectDouble(elements[2]);
        switch (veiksmas) {
            case '+':
                skSuma(sk1, sk2);
                break;
            case '-':
                skAtimtis(sk1, sk2);
                break;
        }
    }

    private static void skSuma(double sk1, double sk2) {
        double suma = sk1 + sk2;
        System.out.println("Skaiciu suma: " + suma);
    }

    private static void skAtimtis(double sk1, double sk2) {
        double atimtis = sk1 - sk2;
        System.out.println("Skaiciu atimtis: " + atimtis);
    }

    private static double getCorrectDouble(String sk1) {
        while (true) {
            try {
                double result = Double.parseDouble(sk1);
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius");
            }
        }

    }
}
