package com.projects;

public class LoadTest {
    public static void main(String[] args) throws Exception {
        LoadTest t = new LoadTest();
        int i = t.getLoads();
        double d = t.getLoad();
        System.out.println( i + d );
    }

    public int getLoads() {
        return 1;
    }

    public double getLoad(){
        return 3.0;
    }
}
