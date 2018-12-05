package com.xhh.linkedList;

/**
 * 链表测试类
 * luokai
 * 2018/12/5 0005 下午 6:24
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(666,2);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
    }
   
    
}
