package com.udit.topQuestions.easy;

import com.udit.topQuestions.utils.ListNode;
/*
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
 */
public class DeleteNodeInALinkedList {
    //Head of the list is not given, only the node that needs to be deleted.
    public void deleteNode(ListNode node) {
        while(node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}
