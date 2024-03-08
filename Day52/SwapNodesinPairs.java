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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = new ListNode();
        temp = head.next;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = head.next.next;

        while(next!=null && next.next!=null){
            curr.next = prev;
            prev.next = next.next;
            prev = next;
            curr = next.next;
            next = curr.next;
        }
        curr.next = prev;
        prev.next = next;

        return temp;
    }
}
