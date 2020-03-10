package com.kcs.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu:");
        try {
            int result = sc.nextInt();
            if (result % 2 == 0) {
                System.out.println("Ivestas skaicius yra lyginis " + result);
            } else {
                System.out.println("Ivestas skaicius yra nelyginis: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Blogas kodas");
        }
    }
}





