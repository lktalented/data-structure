package com.xhh.array;

/**
 * luokai
 * 2018/11/28 0028 下午 7:45
 */
public class Main {
    public static void main(String[] args) {
        OurOwnArray ourArray = new OurOwnArray(20);
        for (int i = 0; i < 10; i++) {
            ourArray.addLast(i);
        }
        System.out.println(ourArray);
        ourArray.add(1,100);
        System.out.println(ourArray);
        ourArray.addFirst(-1);
        System.out.println(ourArray);

        ourArray.remove(2);
        System.out.println(ourArray);

        ourArray.removeElement(4);
        System.out.println(ourArray);

        ourArray.removeFirst();
        System.out.println(ourArray);

    }
}
