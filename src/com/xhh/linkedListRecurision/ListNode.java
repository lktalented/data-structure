package com.xhh.linkedListRecurision;

/**
 * 链表
 * luokai
 * 2018/12/7 0007 上午 9:32
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    ListNode(int[] nums){
        ListNode cur ;
        cur = this;
        cur.val = nums[0];

        for (int i = 1 ; i< nums.length;i ++){
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null){
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }
}

