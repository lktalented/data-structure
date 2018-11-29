package com.xhh.stack;

/**
 * 栈 接口
 * luokai
 * 2018/11/29 0029 下午 4:27
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
