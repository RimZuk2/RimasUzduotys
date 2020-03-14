//package com.kcs.example.third;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//
//public class ReaderFromFile {
//    public static void main(String[] args) {
//        PenktaUzduotis penktaUzduotis = new PenktaUzduotis();
//        File file = new File("cars.txt");
//        BufferedReader bf = new BufferedReader(new FileReader(file));
//        String line;
//        String carName = "";
//        double bestCarAverage = 0;
//        while (line = bf.readLine() != 0) {
//            String[] elements = line.split(" ");
//            double average = penktaUzduotis.average(Double.parseDouble(elements[1]), Double.parseDouble(elements[2]));
//            if (bestCarAverage == 0 || bestCarAverage > average){
//                bestCarAverage == average;
//                carName = elements[0];
//            }
//            System.out.println(elements[0] + " " + average);
//
//        }
//        System.out.println("Optimaliausias automobilis" + carName + " " + bestCarAverage);
//    }
//}
