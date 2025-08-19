/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        
        // Store all nodes of listA
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        
        // Traverse listB and check
        while(headB != null){
            if(set.contains(headB)){
                return headB;  // Intersection found
            }
            headB = headB.next;
        }
        
        return null;  // No intersection
    }
}
