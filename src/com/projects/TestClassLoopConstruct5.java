package com.projects;

public class TestClassLoopConstruct5 {
    public static void main(String[] args){
        loop : for(int i = 0; i< 10; i++){
            for (int j = 0; j< 10; j++){
                if ( i+ j > 10 )  break loop;
            }
            System.out.println( "hello");
        }
    }
}
