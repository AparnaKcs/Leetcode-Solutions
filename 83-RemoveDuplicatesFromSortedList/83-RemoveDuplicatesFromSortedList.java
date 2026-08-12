// Last updated: 8/12/2026, 11:08:00 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode ptr1 = head;
        ListNode ptr2 = head;

        while(ptr2!=null && ptr2.next!=null){
            if(ptr2.val==ptr2.next.val){
                ptr2.next=ptr2.next.next;
            }else{
                // ptr1.val=ptr2.val;
                // ptr1 = ptr2;
                ptr2=ptr2.next;
            }
        }
        // ptr1.next=null;
        return head;
    }
}