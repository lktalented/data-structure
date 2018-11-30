package com.xhh.queue;

/**
 * 队列 接口
 * luokai
 * 2018/11/30 0030 下午 2:33
 */
public interface Queue<E> {
    int getSize();

    boolean isEmpty();

    void  enqueue(E e);

    E dequeue();

    E getFront();
}
