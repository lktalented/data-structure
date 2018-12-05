package com.xhh.linkedList;

/**
 * 链表实现
 * luokai
 * 2018/12/5 0005 下午 2:09
 */
public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e,Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e,null);
        }

        public Node() {
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    /**
     * 定义 虚拟头结点
     */
    private Node dummyHead;

    private int size;

    public LinkedList() {
        this.dummyHead =  new Node();
        size = 0;
    }

    /**
     * 获取链表中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 返回链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 在 index 处添加链表元素
     */
    public void add(E e ,int index){
        if (index < 0 || index >size){
            throw new IllegalArgumentException("add Failed .Illegal index ！ ");
        }
            Node prev = dummyHead;
            for (int i = 0 ; i < index ;i++){
                prev = prev.next;
            }
//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
            prev.next = new Node(e,prev.next);
            size ++ ;

    }

    /**
     * 在链表头部添加链表元素
     */
    public void addFirst(E e){
        add(e,0);
    }

    /**
     * 在链表尾部添加链表元素
     */
    public void addLast(E e){
        add(e,size);
    }

    /**
     * 获得链表的第index个位置的元素
     */
    public E get(int index){
        if (index < 0 || index >size){
            throw new IllegalArgumentException("add Failed .Illegal index ！ ");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;

    }

    /**
     * 获取链表的第0个位置的元素
     */
    public E  getFirst(){
        return get(0);
    }

    /**
     * 获取链表最后最后一个位置的元素
     */
    public E getLast(){
        return get(size - 1);
    }

    /**
     * 查看元素e是否存在
     * @param e
     * @return
     */
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if (cur.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 设置链表第index位置的元素为e
     */
    public void set(E e , int index){
        if (index < 0 || index >size){
            throw new IllegalArgumentException("add Failed .Illegal index ！ ");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Node cur = dummyHead.next ; cur != null; cur = cur.next  ){
            res.append(cur + "->");
        }
        res.append("NULL");
        return res.toString();
    }
}
