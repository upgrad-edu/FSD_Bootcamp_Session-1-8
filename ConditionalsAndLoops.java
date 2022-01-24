package com.upgrad.fsd;

public class ConditionalsAndLoops {
    public static void main(String[] args) {

        int age = 25;
        if (age > 21) {
            System.out.println("Drinking is allowed.");
        } else {
            System.out.println("Drinking is not allowed.");
        }

        int carSpeed = 90;
        if (carSpeed > 70) {
            System.out.println("Overspeeding alert! Please slow down.");
        } else if (carSpeed > 25) {
            System.out.println("You are maintaining a good speed.");
        } else {
            System.out.println("You can speed up a little for better fuel efficiency.");
        }

        int n = 1;
        while (n < 100) {
            System.out.println(n);
            n *= 2;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

    }
}
