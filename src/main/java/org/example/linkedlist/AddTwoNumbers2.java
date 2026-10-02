package org.example.linkedlist;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers2 {

    public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;

        int carry = 0;
        ListNode resultRoot = null;
        ListNode resultCurr = null;

        while (l1 != null || l2 != null) {

            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            System.out.printf("%s -- %s\n", val1, val2);

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int nodeValue = sum % 10;

            ListNode tempNode = new ListNode(nodeValue);
            if(resultRoot == null) resultRoot = tempNode;

            if(resultCurr == null) resultCurr = tempNode;
            else {
                resultCurr.next = tempNode;
                resultCurr = tempNode;
            }

            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(carry != 0) {
            resultCurr.next = new ListNode(carry);
        }

        return resultRoot;

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(9, null)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));

        ListNode added = addTwoNumbers(list1, list2);

        System.out.println(added.traverseAll());
    }
}
