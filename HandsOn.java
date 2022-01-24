package com.upgrad.fsd;

public class HandsOn {
    public static void main(String[] args) {

        System.out.println(isPrime(23));

        patternThree(3);

        System.out.println(celsiusToFahreinheit(100));

        printFiboSeries(10);

        printCurrency("GBP");

    }

    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void patternThree(int n) {

        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num);
            }

            System.out.println();
            num++;
        }

        num = n - 1;
        for(int i = 1; i <= n-1; i++) {
            for(int j = n - i; j > 0; j--) {
                System.out.print(num);
            }

            System.out.println();
            num--;
        }
    }

    public static double celsiusToFahreinheit(double c) {
        // C / 5 = (F - 32) / 9
        double ans = c / 5.0;
        ans *= 9;
        ans += 32;

        return ans;
    }

    public static void printFiboSeries(int n) {
        if (n >= 1)
            System.out.println(0);

        if (n >= 2)
            System.out.println(1);

        int counter = 2, a = 0, b = 1;

        while (counter != n) {
            int temp = a + b;
            System.out.println(temp);
            counter++;

            a = b;
            b = temp;
        }
    }

    public static void printCurrency(String currencyCode) {
        switch (currencyCode) {
            case "INR":
                System.out.println("Indian National Rupee");
                break;
            case "USD":
                System.out.println("United States Dollar");
                break;
            case "GBP":
                System.out.println("Pound Sterling");
                break;
            case "AUD":
                System.out.println("Australian Dollar");
                break;
            case "CAD":
                System.out.println("Canadian Dollar");
                break;
            default:
                System.out.println("Unrecognised!");
        }
    }


}
