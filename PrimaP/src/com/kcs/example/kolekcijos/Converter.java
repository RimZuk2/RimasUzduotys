package com.kcs.example.kolekcijos;

import java.io.*;
import java.util.*;

class AJConverter {
    private static final String TARPAS = "tarpas";
    private static final String EMTY = " ";
}


    public class Converter {
        public static void main(String[] args) {
            Map<String, String> code = readCode(true);
            StringBuilder sb = new StringBuilder();
            for (String item : readLetter()) {
                String translation = code.get(item);
                if ("tarpas".equals(translation)) {
                    translation = " ";
                }
                sb.append(translation);
            }
            System.out.println("Isverstas laiskas: ");
            System.out.println(sb.toString());

            encryptText();

        }

        private static void encryptText() {
            Map<String, String> code = readCode(false);
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            String line = sc.nextLine();

            for (int i = 0; i < line.length(); i++) {
                String item = String.valueOf(line.charAt(i));
                if (" ".equals(item)) {
                    item = "tarpas";
                }
                String decrypt = code.get(item);
                sb.append(decrypt).append(" ");
            }
            String result = sb.toString().trim();

            writeToFile(result);
        }

        private static void writeToFile(String text) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("encrypted.txt"));
                bw.write(text);
                bw.flush();
            } catch (IOException e) {
                System.out.println("Cannot write to file");
            }

        }

        private static Map<String, String> readCode(boolean isEncodeKey) {
            Map<String, String> code = new HashMap<>();
            try {
                BufferedReader bf = new BufferedReader(new FileReader("code.txt"));
                String line;
                while ((line = bf.readLine()) != null) {
                    String[] items = line.split(" ");
                    if (items.length == 2) {
                        code.put(isEncodeKey ? items[0] : items[1], isEncodeKey ? items[1] : items[0]);
                    }
                }
            } catch (IOException e) {
                System.out.println("Cannot read code");
            }
            return code;
        }

        private static List<String> readLetter() {
            List<String> letters = new ArrayList<>();
            try {
                BufferedReader bf = new BufferedReader(new FileReader("laiskas.txt"));
                String line;
                while ((line = bf.readLine()) != null) {
                    letters.addAll(Arrays.asList(line.split(" ")));
                }
            } catch (IOException e) {
                System.out.println("Cannot read letter file!");
                ;
            }
            return letters;
        }
    }

