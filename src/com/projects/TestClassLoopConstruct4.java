package com.projects;

public class TestClassLoopConstruct4 {
    public static void main(String args[]){
        boolean b = false;
        int i = 1;
        do{
            i++ ;
        } while (b = !b);
        System.out.println( i );
    }
}
