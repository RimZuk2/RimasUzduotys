package com.kcs.example.second;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    private static void ivedimas(Scanner sc) {
        System.out.println("Iveskite savo mase (kg): ");
        System.out.println("Iveskite, koks tavo ugis (m)");
    }

    private static double skaiciavimas(double kilo, double ugis) {
        double kmi = kilo / Math.pow(ugis, 2);
        return kmi;
    }


}
