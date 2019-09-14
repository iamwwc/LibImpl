package com.chaochaogege.LibImpl.leetcode;

import com.chaochaogege.LibImpl.common.ListNode;

public class Q2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode origin = new ListNode(0), tmp = origin;

        while(!(l1 == null && l2 == null && carry == 0)) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int num = v1 + v2 + carry;
            tmp.next = new ListNode(num % 10);
            carry = num / 10;
            tmp = tmp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return origin.next;
    }
}
