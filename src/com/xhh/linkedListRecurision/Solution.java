package com.xhh.linkedListRecurision;

/**
 * 删除链表中等于给定值 val 的所有节点
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * luokai
 * 2018/12/7 0007 上午 9:33
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val ){
            ListNode delNode = head;
            head = delNode.next;
            delNode.next = null;
        }
        if (head == null){
            return head;
        }

        ListNode pre = head;
        while (pre.next != null){
            if (pre.next.val == val){
                ListNode delNode = pre.next;
                pre.next =delNode.next;
                delNode.next = null;
            }else {
                pre = pre.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        int[] nums = new int []{1,2,6,6,3,4,5,6,6,6};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);
        System.out.println(new Solution().removeElements(listNode, 6));

    }
}
