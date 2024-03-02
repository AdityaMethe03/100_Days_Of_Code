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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null) return head;

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode leftPrev = temp;
        ListNode curr = head;
        //reah node at position "left"
        for(int i=0; i<left-1; i++){
            leftPrev = curr;
            curr = curr.next;
        }

        //Now curr="left", leftPrev="node before left"
        //reverse from left to right

        ListNode prev = null;
        ListNode tail = curr;
        for(int i = left; i <= right; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Update pointers
        leftPrev.next = prev;
        tail.next = curr;

        return temp.next;
    }
}

