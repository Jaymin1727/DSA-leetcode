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
        // Use a dummy head to easily build and return the new list
        ListNode dummyHead = new ListNode(0); 
        ListNode ptr = dummyHead;
        int carry = 0;
        
        // Loop continues if there are digits left in l1 OR l2, OR a remaining carry
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
        }
        
        return dummyHead.next;
    }
}