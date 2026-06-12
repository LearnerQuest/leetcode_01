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
    public ListNode reverseL(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = reverseL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverseL(slow.next);
        slow.next =null;
        while(rev != null){
            if(head.val != rev.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }

}