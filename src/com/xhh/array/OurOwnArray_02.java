package com.xhh.array;

/**
 * 我们自己封装的数组
 * luokai
 * 2018/11/28 0028 下午 6:31
 */
public class OurOwnArray_02 {
    private int[] data;
    private int size;

    /**
     * 构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public OurOwnArray_02(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参数的构造函数,默认数组的容量capacity =10
     */
    public OurOwnArray_02(){
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

    /**
     * 在所有元素前添加元素
     */
    public void addFirst(int e){
        this.add(0,e);
    }
    /**
     * 在所有元素后面添加元素
     */
    public void addLast(int e){
        this.add(size,e);
    }

    /**
     * 在第index个位置，插入1个新元素e
     */
    public void add(int index ,int e) {
        if (size == data.length){
            throw new IllegalArgumentException("add failed. array is full!");
        }
        if (index <0 || index > size ){
            throw new IllegalArgumentException("add failed. required index <0 或 > size ");
        }
        for (int i = size-1;i >= index ;i-- ){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    /**
     * 获取index索引位置的元素
     * @return
     */
    public int get(int index){
        if (index < 0 || index >=size){
            throw new IllegalArgumentException("Get Failed. Index is illegal.");
        }
        return data[index];
    }

    /**
     * 修改index索引位置的元素 e
     * @return
     */
    public void set(int index,int e){
        if (index < 0 || index >=size){
            throw new IllegalArgumentException("Get Failed. Index is illegal.");
        }
        data[index] = e;
    }

    /**
     * 查看数组中是否含有元素e
     * @return
     */
    public boolean contains(int e){
        for (int i = 0;i < size;i ++){
            if(data[i] == e){
                return true;
            }
        }
        return false;
    }

    /**
     * 查看数组中元素e所存在的索引，若不存在e，则返回 -1
     * @return
     */
    public int find(int e){
        for (int i = 0; i < size; i++) {
            if (data[i] == e){
                return i;
            }
        }
        return -1;
    }

    /**
     * 从数组中删除第1个元素，返回删除的元素
     * @return
     */
    public int removeFirst(){
        return remove(0);
    }

    /**
     * 从数组中删除最后1个元素，返回删除的元素
     * @return
     */
    public int removeLast(){
        return remove(size - 1);
    }

    /**
     * 从数组中删除index位置的元素，返回删除的元素
     * @return
     */
    public int remove(int index){
        if (index <0 || index > size ){
            throw new IllegalArgumentException("remove failed. required index <0 或 > size ");
        }
        for(int i = index+1;i < size; i++){
            data[i-1] = data[i];
        }
        size--;
        return data[index];
    }

    /**
     * 从数组中删除元素e
     * @return
     */
    public void removeElement(int e){
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("array: size = %d ,capacity = %d\n",size,data.length));
        res.append("[");
        for (int i = 0; i<size; i++){
            res.append(data[i]);
            if (i != size-1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
