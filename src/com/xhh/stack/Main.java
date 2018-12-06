package com.xhh.stack;

import com.xhh.queue.ArrayQueue;
import com.xhh.queue.LoopQueue;

import java.util.Random;

/**
 * stcak的测试类
 * luokai
 * 2018/11/29 0029 下午 4:57
 */
public class Main {
    //测试使用stack运行opCount个enqueue和dequeue操作所需要的时间，单位： 秒
    public static double testStack(Stack<Integer> stack, int opcount ){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opcount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opcount; i++) {
            stack.pop();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;

    }

    public static void main(String[] args) {
        int opCount =1000000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("arrayStack, time :" + time1 + "s" );
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("linkedListStack, time :" + time2 + "s" );
    }
}
