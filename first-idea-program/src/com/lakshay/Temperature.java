package com.lakshay;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter temp in c");
        float tempc , tempf;
        tempc = x.nextFloat();
        tempf = (tempc * 9/5) +32;
        System.out.println("temp in f is " + tempf);

   }
}
