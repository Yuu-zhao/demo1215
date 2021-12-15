package com;

public class MergeTwoList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.val = 1;
        ListNode l11 = new ListNode(0);
        l11.val = 2;
        l1.next = l11;
        ListNode l12 = new ListNode(0);
        l12.val = 4;
        l11.next = l12;

        ListNode l2 = new ListNode(0);
        l2.val = 1;
        ListNode l21 = new ListNode(0);
        l21.val = 3;
        l2.next = l21;
        ListNode l22 = new ListNode(0);
        l22.val = 4;
        l21.next = l22;

        mergeTwoLists(l1, l2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
            if (l1 == null) {
                cur.next = l2;
            } else {
                cur.next = l1;
            }
        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

