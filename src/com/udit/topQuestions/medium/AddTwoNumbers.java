package com.udit.topQuestions.medium;
/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */

import com.udit.topQuestions.utils.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode l4 = l3;
        int unit = 0;
        int carry = 0;

        while (l1 != null && l2 != null) {

            l3.next = new ListNode();
            l3 = l3.next;
            int valL1 = l1.val;
            int valL2 = l2.val;
            int res = valL1+valL2;
            unit = (res+carry)%10;
            carry = (res+carry)/10;

            l3.val = unit;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            l3.next = new ListNode();
            l3 = l3.next;
            l3.val = (l1.val+carry)%10;
            carry = (l1.val+carry)/10;
            l1 = l1.next;
        }

        while (l2 != null) {
            l3.next = new ListNode();
            l3 = l3.next;
            l3.val = (l2.val+carry)%10;
            carry = (l2.val+carry)/10;
            l2 = l2.next;
        }


        if(carry != 0) {
            l3.next = new ListNode();
            l3 = l3.next;
            l3.val = carry;
        }
        return l4.next;
    }
}
