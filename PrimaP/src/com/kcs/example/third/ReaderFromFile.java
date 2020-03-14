package com.kcs.example.third;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderFromFile {
    public static void main(String[] args) {
        PenktaUzduotis penktaUzduotis = new PenktaUzduotis();
        File file = new File("cars.txt");
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String line;
        String carName = "";
        double bestCarAverage = 0;
        while (line = bf.readLine() != 0){
            String[] elements = line.split(" ");


        }

    }
}
