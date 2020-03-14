package com.kcs.example.third;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("exaple.txt"));
        bw.write("Pirmas bandymas");
        bw.flush();
        bw.close();
    }

}
