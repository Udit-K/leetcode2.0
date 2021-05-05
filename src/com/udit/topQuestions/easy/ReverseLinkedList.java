package com.udit.topQuestions.easy;

import com.udit.topQuestions.utils.ListNode;

import java.util.Stack;

public class ReverseLinkedList {
    //Must do it more efficiently. Let's come back to it later.
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode l1 = head;
        ListNode l2 = l1;
        Stack<Integer> stack = new Stack();

        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while(!stack.isEmpty()) {
            l1.val = stack.pop();
            l1 = l1.next;
        }
        return l2;
    }
}
