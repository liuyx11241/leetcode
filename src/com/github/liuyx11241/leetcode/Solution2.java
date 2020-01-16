package com.github.liuyx11241.leetcode;

/**
 * 2. Add Two Numbers https://leetcode.com/problems/add-two-numbers/
 */

public class Solution2 {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode header = new ListNode(-1);
        ListNode cur = header;
        int carry = 0;
        int sum = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        while (l1 != null) {
            sum = l1.val + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;

            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null) {
            sum = l2.val + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;

            l2 = l2.next;
            cur = cur.next;
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }

        return header.next;
    }
}