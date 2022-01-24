package com.upgrad.fsd;

public class ClassesAndObjects {
    public static void main(String[] args) {

        SampleClass objectOne = new SampleClass();
        objectOne.instanceVariable = 5;

        SampleClass objectTwo = new SampleClass();
        objectTwo.instanceVariable = 50;

        SampleClass.classVariable = 25;

        objectOne.printVariables();
        System.out.println();
        objectTwo.printVariables();

    }
}
