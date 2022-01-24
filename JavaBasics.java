package com.upgrad.fsd;

public class JavaBasics {
    public static void main(String[] args) {

        // This is a single line comment

        /*
            This is a multi-line
            comment!
         */

        // Variables
        byte byte_variable = 120;
        short short_variable = 12345;
        int integer_variable = 123456789;
        long long_variable = 123456789012345678L;

        float float_variable = 1234567.1234567f;
        double double_variable = 1234567890.123456789;
        boolean boolean_variable = true;
        char character_variable = '$';

        // Casting
        double var = integer_variable;
        int int_var = (int) double_variable;

        // Arrays
        int[] integer_array = new int[10];
        int[] another_integer_array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Operators
        int x = 5 + 3;
        int y = 7 / 3;

        boolean condition = x > y;
        boolean flag = boolean_variable || condition;

        int i = 5;
        i++;
        i--;

        int j = -1;
        int k = +5;
    }
}
