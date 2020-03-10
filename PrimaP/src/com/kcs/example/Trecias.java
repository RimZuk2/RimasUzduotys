package com.kcs.example;

import java.util.Scanner;

public class Trecias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Trecias example = new Trecias();
        String name;

        do {
            System.out.println("Ivesti zodi arba pabaiga");
            name = sc.nextLine();
            example.printMEven(name);
        } while (!name.toLowerCase().equals("pabaiga"));
    }

    private void printMEven(String name) {
        if (name.toLowerCase().equals("pabaiga")) {
            return;
        }
        if (name.length() % 2 == 0) {
            System.out.println((name + "yra lyginis" + name.length()));
        } else {
            System.out.println((name + "yra nelyginis" + name.length()));
        }
    }

    private static int getNumbOfLeter(String name, char letter) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char l = name.charAt(i);
            if (l == letter) {
                count++;
            }
        }
        return count;
    }
}
