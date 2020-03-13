package com.kcs.example.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PenktaUzduotis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PenktaUzduotis penktaUzduotis = new PenktaUzduotis();
        System.out.println("Nuvaziuotas atstumas: ");
        double atstumas = penktaUzduotis.getValue(sc);
        System.out.println("Kuros sanaudos: ");
        double sanaudos = penktaUzduotis.getValue(sc);
        System.out.println("Vidurkis yra: " + penktaUzduotis.average(atstumas, sanaudos));
    }
    protected double average(double km, double kuroSanaudos){
        return  (kuroSanaudos*100)/km;
    }
    private double getValue(Scanner sc){
        Double value = null;
        while (value == null){
            try {
                value = sc.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Neteisinga reiksme");
                sc.nextLine();
            }
        }return value;
    }
}
