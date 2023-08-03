package com.lakshay;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner input = new Scanner(System.in);
        float num1;
        num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum is "+ sum);
    }
}
