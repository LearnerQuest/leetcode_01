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

        // Step 1: Create a mapping from original node → cloned node
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));  // clone node (without next/random yet)
            curr = curr.next;
        }

        // Step 2: Assign next and random pointers
        curr = head;
        while (curr != null) {
            Node clone = map.get(curr);
            clone.next = (curr.next != null) ? map.get(curr.next) : null;
            clone.random = (curr.random != null) ? map.get(curr.random) : null;
            curr = curr.next;
        }

        // Step 3: Return head of copied list
        return map.get(head);
    }
}