package com.projects;

public class InitTest {
    public InitTest(){
        s1 = sM1("1"); //1
    }
    static String s1 = sM1("a"); //a
    String s3 = sM1("2"); // 2
    {
        s1 = sM1("3"); //3
    }
    static{
        s1 = sM1("b"); //b
    }
    static String s2 = sM1("c"); //c
    String s4 = sM1("4"); //4
    public static void main(String args[]){
        InitTest it = new InitTest();
    }
    private static String sM1(String s){
        System.out.println(s);  return s;
    }
    //print static first, then local variables, then instance methods
}
