package com.xhh.Array;

/**
 * 数组基础
 * luokai
 * 2018/11/28 0028 下午 4:44
 */
public class arrayBasic_01 {
    public static void main(String[] args) {
        int[]arr = new int[10];
        for (int i = 0;i<arr.length;i++){
            arr[i]=i;
            System.out.println(arr[i]);
        }

        int[]scores = new int[]{100,80,60};
        for (int i = 0;i<scores.length;i++ ){
            System.out.println(scores[i]);
        }
        for (int score:scores){
            System.out.println(score);
        }
        scores[0]=99;

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
