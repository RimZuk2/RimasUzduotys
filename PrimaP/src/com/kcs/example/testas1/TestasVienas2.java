package com.kcs.example.testas1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestasVienas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestasVienas2 testasVienas = new TestasVienas2();
        System.out.println("Iveskite du skaicius ir zenkla tarp ju:\n(pvz. 2 + 2, 3 - 1 ir t.t.)");
        String eilute = sc.nextLine();
        List<String> trys = new ArrayList<>();
//        List<String> naujas = testasVienas.trysItems(Scanner sc);
        while (eilute != null){
            trys.addAll(new ArrayList(Arrays.asList(eilute.split(" "))));
        }
        for (int i = 0; i<eilute.length(); i++){
            System.out.println(eilute);
        }


        //System.out.println("Eilute: " + eilute);
//    }
//    public static List<String> trysItems (Scanner sc){
//
//        String line;
//
//        return trys;
    }
}
