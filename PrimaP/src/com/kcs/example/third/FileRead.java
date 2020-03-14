package com.kcs.example.third;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("cars.txt"));
            String line;
            while ((line = bf.readLine()) != null){
                String[] elements = line.split(" ");
                System.out.println(elements[0]);
                System.out.println(elements[1]);
                System.out.println(elements[2]);
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Failo nuskaityti nepavyko");
        }


    }
}
