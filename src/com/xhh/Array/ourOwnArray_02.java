package com.xhh.Array;

/**
 * 我们自己封装的数组
 * luokai
 * 2018/11/28 0028 下午 6:31
 */
public class ourOwnArray_02 {
    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public ourOwnArray_02(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参数的构造函数,默认数组的容量capacity =10
     */
    public ourOwnArray_02(){
        this(10);
    }

    /**
     * 获得数组的容量
     */
    public int getCapacity(){
         return data.length;
    }

    /**
     * 获得数组中元素个数
     */
    public int getSize(){
        return size;
    }

    /**
     * 返回数组是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }
}
