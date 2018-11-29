package com.xhh.array;

/**
 * 泛型数组对象测试
 * luokai
 * 2018/11/28 0028 下午 7:45
 */
public class Main_T {
    public static void main(String[] args) {
        OurOwnArray_T<Integer> ourArray = new OurOwnArray_T();
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
