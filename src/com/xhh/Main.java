package com.xhh;

import com.xhh.array.OurOwnArray_02;

/**
 * luokai
 * 2018/11/28 0028 下午 7:45
 */
public class Main {
    public static void main(String[] args) {
        OurOwnArray_02 ourArray = new OurOwnArray_02(20);
        for (int i = 0; i < 10; i++) {
            ourArray.addLast(i);
        }
        System.out.println(ourArray);
        ourArray.add(1,100);
        System.out.println(ourArray);
        ourArray.addFirst(-1);
        System.out.println(ourArray);
    }
}
