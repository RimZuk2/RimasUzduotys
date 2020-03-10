package com.kcs.example;

public class FirstEx {
    public static void main(String[] args){
        System.out.println("Labas");
        FirstEx firstEx = new FirstEx();
        System.out.println(firstEx.sum(10, 30));
    }
    private int sum(int num1, int num2){
        return num1 + num2;
    }

}
