package com.xhh.linkedListRecurision;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

/**
 * 使用递归完成(戴调试注释)
 */
class SolutionByRecurisionAnnotation {

    public ListNode removeElements(ListNode head, int val,int depth) {
        String depthString = generateDepthString(depth);
        System.out.print(depthString);
        System.out.println("Call: remove :" + val + ", in :" + head);
        if (head == null){
            System.out.print(depthString);
            System.out.println("Return: " + head);
            return null;
        }

       ListNode res =  removeElements(head.next,val,depth + 1);
        System.out.print(depthString);
        System.out.println("After remove: " + val + ":" + res);
        if(head.val == val){
            return res;
        }else {
            head.next = res;
        }

        System.out.print(depthString);
        System.out.println("Return: " + head );
        return head;

    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new SolutionByRecurisionAnnotation()).removeElements(head, 6,0);
        System.out.println(res);
    }
}