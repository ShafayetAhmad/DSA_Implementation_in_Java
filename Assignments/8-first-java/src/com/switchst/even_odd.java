package com.switchst;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
