package com.projects;

public class DataList {
    public static void main(String[] args) {
        String[] dataList = {"x","y","z"};
        for(String dataElement: dataList) {
            int innerCounter = 0;
            while (innerCounter < dataList.length) {
                System.out.println(dataElement + "," + innerCounter);
                innerCounter++;
            }
        }
    }

}
