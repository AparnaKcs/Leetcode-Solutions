// Last updated: 8/12/2026, 11:10:26 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode temp = res;
        int bal = 0;
        while (l1 != null && l2 != null) {
            int s = l1.val + l2.val + bal;
            bal = 0;
            if (s >= 10) {
                bal = 1;
                s %=10;
            }
            temp.next = new ListNode(s);
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        while (l1 != null) {
            int s = l1.val + bal;
            bal = 0;
            if (s >= 10) {
                bal = 1;
                s %=10;
            }
            temp.next = new ListNode(s);
            l1 = l1.next;
            temp = temp.next;
        }
        while (l2 != null) {
            int s = l2.val + bal;
            bal = 0;
            if (s >= 10) {
                bal = 1;
                s %=10;
            }
            temp.next = new ListNode(s);
            l2 = l2.next;
            temp = temp.next;
        } 
        if(bal == 1) {
            temp.next = new ListNode(1);
        }
        return res.next;
    }
}