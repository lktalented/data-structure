package com.xhh.linkedListRecurision;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

/**
 * 使用递归完成
 */
class SolutionByRecurision {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        ListNode res =  removeElements(head.next,val);
        if(head.val == val){
            return res;
        }else {
            head.next = res;
        }
        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new SolutionByRecurision()).removeElements(head, 6);
        System.out.println(res);
    }
}