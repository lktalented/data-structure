package com.xhh.stack;

import java.util.Date;
import java.util.Queue;

/**
 * stcak的测试类
 * luokai
 * 2018/11/29 0029 下午 4:57
 */
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());

        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println("stack.peek():"+stack.peek());

    }
}
