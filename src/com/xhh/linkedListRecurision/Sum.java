package com.xhh.linkedListRecurision;

/**
 * 数组求和
 * luokai
 * 2018/12/7 0007 下午 2:07
 */
public class Sum {
    public  int sumAll(int[] arr){
       return sum(arr,0);
    }

    private int sum(int[] arr, int l) {
        if (l == arr.length){
            return 0;
        }
       return arr[l] + sum(arr ,l+1);
    }

    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4};
        System.out.println(new Sum().sumAll(arr));
    }
}


