package com.xhh.queue;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.Random;

/**
 * 数组队列，循环队列性能测试
 * luokai
 * 2018/11/30 0030 下午 2:43
 */
public class Main {

    //测试使用queue运行opCount个enqueue和dequeue操作所需要的时间，单位： 秒
    public static double testQueue(Queue<Integer>queue,int opcount ){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opcount; i++) {
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opcount; i++) {
            queue.dequeue();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;

    }

    public static void main(String[] args) {
        int opCount =100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("ArrayQueue, time :" + time1 + "s" );
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("loopQueue, time :" + time2 + "s" );
        LinkedListQueue<Integer>linkedListQueue = new LinkedListQueue<>();
        double time3 = testQueue(linkedListQueue,opCount);
        System.out.println("linkedListQueue, time :" + time3 + "s" );


    }
}
