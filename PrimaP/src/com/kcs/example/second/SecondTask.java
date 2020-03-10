package com.kcs.example.second;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        String text = "KOL EINU ŠUNIE LOK".replaceAll(" ", "");
        boolean isPolindrome = true;
        for(int i = 0; i<text.length(); i++){
            char first = text.charAt(i);
            char last = text.charAt(text.length() - i -1);
            if(first != last){
                isPolindrome = false;
                break;
            }
        }
        if(isPolindrome){
            System.out.println("Polindromas");
        }else{
            System.out.println("Ne Polindromas");
        }
    }
}
