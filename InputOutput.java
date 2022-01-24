package com.upgrad.fsd;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Please enter your weight: ");
        double weight = input.nextDouble();

        System.out.println("Hi " + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your weight is : " + weight + ".");
    }
}
