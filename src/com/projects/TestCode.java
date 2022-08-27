package com.projects;

public class TestCode {
    public static void main(String[] args) {
//        String[] dataList = {"x", "y", "z"};
//        for (String dataElement : dataList) {
//            int innerCounter = 0;
//            while (innerCounter < dataList.length) {
//                System.out.println(dataElement + ", " + innerCounter);
//                innerCounter++;
//            }
//
//        }
//        int sum = 0;
//        for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
//        {
//            sum = sum+ i + j;
//        }
//        System.out.println("Sum = " + sum);
//        int count = 0, sum = 0;
//        do{
//            if(count % 3 == 0) continue;
//            sum+=count;
//        }
//        while(count++ < 11);
//        System.out.println(sum);
//        int[][] ab = { {1, 2, 3}, {4, 5} };
//        for(int i=0; i<ab.length; i++){
//            for(int j=0; j<ab[i].length; j++){
//                System.out.print(ab[i][j]+" ");
//                if(ab[i][j] == 2){
//                    break;
//                }
//            }
//            continue;
//        }

//        for (int i = 0; i < 10; i++) System.out.print(i + " ");  //1
//        for (int i = 10; i > 0; i--) System.out.print(i + " ");  //2
//        int i = 20;                  //3
//        System.out.print(i + " ");   //4
//        int c = 0;
//        A: for(int i = 0; i < 2; i++){
//            B: for(int j = 0; j < 2; j++){
//                C: for(int k = 0; k < 3; k++){
//                    c++;
//                    if(k>j) break;
//                }
//            }
//        }
//        System.out.println(c);
//        int c = 0;
//        JACK: while (c < 8){
//            JILL: System.out.println(c);
//            if (c > 3) break JILL; else c++;
//        }
//        String[] sa = {"a", "b", "c"};
//        for(String s :  sa){
//            if("b".equals(s)) continue;
//            System.out.println(s);
//            if("b".equals(s)) break;
//            System.out.println(s+" again");
//        }
//        int x = 10;
//        do{
//            x--;
//            System.out.println(x);  // 1
//        }while(x<10);
//        int i = 0;
//        for (i=1 ;  i<5  ; i++) continue;  //(1)
//        for (i=0 ;       ; i++) break;       //(2)
//        for (    ; i<5?false:true ;    );     //(3)
        int k = 2;
        do{
            System.out.println(k);
        }while(--k>0);
    }
}
