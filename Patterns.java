package com.upgrad.fsd;

public class Patterns {
    public static void main(String[] args) {
        patternOne(5);
        System.out.println();

        patternTwo(5);
    }

    /*

    *
    **
    ***
    ****
    *****

     */
    public static void patternOne(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    /*

         *
        **
       ***
      ****
     *****

     */
    public static void patternTwo(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
