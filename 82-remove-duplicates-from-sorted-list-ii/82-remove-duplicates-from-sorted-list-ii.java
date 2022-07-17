/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
                  p         c
        d -> 1 -> 2 -> 3 -> 3 -> 5
        
        d -> 1 -> 1 -> 1 -> 2
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;
        
        while(current != null)
        {
            if(current.next != null && current.val == current.next.val)
            {
                while(current.next != null && current.val == current.next.val)
                {
                    current = current.next;
                }
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}

/**
        ListNode current = head;
        ListNode prev = dummy;
        
        while(current != null)
        {
            if(current.next != null && current.val == current.next.val)
            {
                while(current.next != null && current.val == current.next.val)
                {
                    current = current.next;
                }
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
*/