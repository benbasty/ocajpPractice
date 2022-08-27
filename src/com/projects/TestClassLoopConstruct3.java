package com.projects;

public class TestClassLoopConstruct3 {
    public void loopTest(int x){
        loop: for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                System.out.println(i);
                if (x == 0) {  continue loop;  }
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        TestClassLoopConstruct3 tcl = new TestClassLoopConstruct3();
        tcl.loopTest(0);
    }
}
