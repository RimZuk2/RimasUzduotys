package com.kcs.example.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatematiniaiDarbai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select = -1;
        while (select != 0) {
            System.out.println("Pasirinkite kokios figuros plota skaiciuopsite:");
            System.out.println("1. Statusis trikampis\n2. Staciakampis\n3. Kvadratas\n4. Apskritimas\n0. Pabaiga");
                select = getCorrect(sc);
                switch (select) {
                    case 1:
                        System.out.println("Status trikampis");
                        statusisTrikampis(sc);
                        break;
                    case 2:
                        System.out.println("Staciakampis");
                        break;
                    case 3:
                        System.out.println("Kvadratas");
                        break;
                    case 4:
                        System.out.println("Apskritimas");
                        break;
                    case 5:
                        System.out.println("End");
                        break;
                    default:
                        System.out.println("end");
                        break;
                }

            }
        }



    private static void statusisTrikampis(Scanner sc) {

        System.out.println("Ivesk sk1: ");
        double pirmassk = getCorrectDouble(sc);
        System.out.println("Ivesk sk2: ");
        double antrassk = getCorrect(sc);
        double plotas = (pirmassk * antrassk) / 2;
        System.out.println("Trikampio plotas:" + plotas);
    }

    private static int getCorrect(Scanner scanner) {
        while (true) {
            try {
                int result = scanner.nextInt();
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius");
                scanner.nextLine();
            }
        }
    }
    private static double getCorrectDouble(Scanner scanner) {
        while (true) {
            try {
                double result = scanner.nextInt();
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius");
                scanner.nextLine();
            }
        }
    }

}
