/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
         if (head == null) return null;

        Node curr = head;

        // Step 1: Insert cloned nodes in between
        while (curr != null) {
            Node next = curr.next;
            Node copy = new Node(curr.val);
            curr.next = copy;
            copy.next = next;
            curr = next;
        }

        // Step 2: Set random pointers for cloned nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next; // clone.random = original.random.next
            }
            curr = curr.next.next; // skip to next original node
        }

        // Step 3: Separate the lists
        curr = head;
        Node dummyHead = new Node(0);
        Node copyCurr = dummyHead;

        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;       // restore original list
            copyCurr.next = copy;        // add clone to new list
            copyCurr = copy;
            curr = curr.next;
        }

        return dummyHead.next;
    }
}