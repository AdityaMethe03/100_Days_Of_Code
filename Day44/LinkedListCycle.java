/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;// slow pointer
        ListNode fast=head;//fast pointer
        if(slow==null){
            return false;//if head is null than return null
        }
        while (fast != null && fast.next != null)// run loop till fast is null
        {
             slow=slow.next;   //update slow by one step
             fast=fast.next.next;   //update fast by two step 
             if(fast==slow)//if there is cycle than then they will meet at some point than return true
          {
              return true;
          }
               
            
        }//else loop will end and false will return
        return false;
        
    }
}
