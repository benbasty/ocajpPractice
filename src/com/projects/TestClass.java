package com.projects;

public class TestClass {
    public static void main(String args[]){
        A[] a, a1;
        B[] b;
        a = new A[10]; a1  = a;
        b =  new B[20];
        a = b;  // 1
        // a becomes a = new B[20]
        // the assignment is done from a subclass reference to a superclass
        // reference.
        b = (B[]) a;  // 2
        // casting here is done because a superclass reference is assigned
        // to a subclass reference variable. And this works at runtime
        // because the object referenced to by a is actually of an array of B.
        b = (B[]) a1; // 3
        // no mistakes but this fails because the actual object
        // is not an array of B but is an array of A.
    }
    class A { } // A is superclass
    class B extends A { } // B is subclass
}
