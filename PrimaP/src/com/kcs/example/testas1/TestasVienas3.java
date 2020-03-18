package com.kcs.example.testas1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestasVienas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestasVienas3 testasVienas = new TestasVienas3();
        System.out.println("Iveskite du skaicius ir zenkla tarp ju:\n(pvz. 2 + 2, 3 - 1 ir t.t.)");
        String eilutes = sc.nextLine();
        List<String> trys = new ArrayList<>();
        while (eilutes != null) {
            String[] items = eilutes.split(" ");
            System.out.println("items" + items);
            System.out.println("eilutes" + eilutes);
            trys.add(eilutes);
        }
        System.out.println(trys);


    }

}
