package com.xhh.array;

/**
 * Array<E>举例测试
 * luokai
 * 2018/11/29 0029 上午 10:01
 */

public class Student {
    String name ;

    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("(name = %s , score = %d)",name,score);
    }

    public static void main(String[] args) {
        OurOwnArray_T<Student> studentArray = new OurOwnArray_T<>();
        studentArray.addFirst(new Student("luokai",99));
        studentArray.addFirst(new Student("李四",88));
        studentArray.addFirst(new Student("张三",77));
        System.out.println(studentArray);

    }
}
