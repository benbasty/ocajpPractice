package com.projects;

public class AX {
    static int[] x = new int[0]; //returns null
    static{
        x[0] = 10; // throw error
    }
    public static void main(String[] args){
        AX ax = new AX();
    }

    // Exception in thread "main" java.lang.ExceptionInInitializerError
    //Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    //	at com.projects.AX.<clinit>(AX.java:6)

    // CAUSE
    //If you try to throw a checked exception from a static block to the outside,
    // the code will not compile.

    //An instance block is allowed to throw a checked exception
    // but only if that exception is declared in the throws clause
    // of all the constructors of the class.
}
