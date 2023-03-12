package ch14.ramdamax;

import ch14.ramdamax.MyFunction;

public class MaxRamda {
    public static void main(String[] args) {
//            Object obj = (a,b)-> a > b ? a : b;
//        MyFunction obj = new MyFunction(){
//            public int max(int a, int b){
//                return a>b?a:b;
//            }
//        };
        MyFunction f =(a, b)-> a > b ? a : b;
        int value = f.max(3,5);
        System.out.println("value = " + value);
    }
}