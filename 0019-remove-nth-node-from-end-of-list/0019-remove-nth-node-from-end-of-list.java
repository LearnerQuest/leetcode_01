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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0; 
        ListNode temp = head;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        if(count == n){
            head = head.next;
            return head;
        }
        int res = count-n; 
        temp = head;
        while(res>1){
            temp =temp.next;
            res--;

        }
        temp.next = temp.next.next;
        return head;
    }
}