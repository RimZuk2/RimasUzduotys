package com.kcs.example.second;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //double atsakymas = skaiciavimas(12,1.45);
        double atsakymas = skaiciavimas(sc);
        System.out.println("Tavo KMI yra: " + atsakymas);

    }
    private static double skaiciavimas(Scanner sc){
        System.out.println("Iveskite savo mase (kg): ");
        double kilogramai = getCorrectDouble(sc);
        System.out.println("Iveskite, koks tavo ugis (m)");
        double ugis = getCorrectDouble(sc);

        return kmi(kilogramai, ugis);
    }


    private static double kmi(double kilo, double ugis) {
        double kmi = kilo / Math.pow(ugis, 2);
        return kmi;
    }

    private static double getCorrectDouble(Scanner scanner) {
        while (true) {
            try {
                double result = scanner.nextDouble();
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius");
                scanner.nextLine();
            }
        }
    }


}
