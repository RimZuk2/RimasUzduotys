package com.kcs.example;

import java.util.Scanner;

public class VardasSimboliai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite varda:");
        String vardas = sc.nextLine();
        System.out.println("Ivestas vardas " + vardas + " ilgis yra " + vardas.length());
    }
}
