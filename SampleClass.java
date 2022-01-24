package com.upgrad.fsd;

/**
 *  This is a sample class
 */
public class SampleClass {

   public int instanceVariable;

   public static int classVariable;

   public void printVariables() {
       System.out.println("instanceVariable: " + instanceVariable);
       System.out.println("classVariable: " + classVariable);
   }

   private void privateMethod() {
       System.out.println("This is private!");
   }


}
