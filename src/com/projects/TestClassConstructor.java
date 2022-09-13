package com.projects;

public class TestClassConstructor {
    long l1;
    public void TestClassm(long pLong) { l1 = pLong ; }  //(1)
    public static void main(String args[]){
        TestClassConstructor a, b ;
        a = new TestClassConstructor();  //(2)
        //b = new TestClassConstructor(5);  //(3)
    }
}
