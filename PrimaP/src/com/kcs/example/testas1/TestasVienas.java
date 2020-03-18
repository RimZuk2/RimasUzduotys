//package com.kcs.example.testas1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class TestasVienas {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        TestasVienas testasVienas = new TestasVienas();
//        System.out.println("Iveskite du skaicius ir zenkla tarp ju:\n(pvz. 2 + 2, 3 - 1 ir t.t.)");
//        String eilutes = sc.nextLine();
//        trysItems(String eilutes);
//
//
//        System.out.println("Eilute: " + eilutes);
//    }
//    public static List<String> trysItems (String eilute){
//        List<String> trys = new ArrayList<>();
//        while (eilute != null){
//           String[] items = eilute.split(" ");
//           trys.add(eilute);
//        }
//        return trys;
//    }
//}
