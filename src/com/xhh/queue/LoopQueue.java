package com.xhh.queue;

/**
 * 循环队列
 * luokai
 * 2018/11/30 0030 下午 4:08
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity) {
        data =(E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length-1;
    }

    @Override
    public boolean isEmpty() {
        return tail == front;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front){
            resize(getCapacity() * 2);
        }
            data[tail] = e ;
            tail = (tail + 1) % data.length;
            size ++ ;


    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0 ; i < size ; i ++){
            newData[i] = data[ (i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("LoopQueue is isEmpty !");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size -- ;

        if (size == data.length / 4 && data.length / 2 != 0 ){
            resize(getCapacity() / 2 );
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("LoopQueue is isEmpty !");
        }
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("LoopQueue: size = %d ,capacity = %d\n",size,getCapacity()));
        res.append("front [");
        for (int i = front; i != tail ;i= (i + 1) % data.length ){
            res.append(data[i]);
            if ((i + 1) % data.length  != tail ){
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }

}
