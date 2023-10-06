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
        Node temp = head; 
// Step 1
    while(temp != null) {
        Node newnode = new Node(temp.val);
        newnode.next = temp.next;
        temp.next = newnode;
        temp = temp.next.next;
    }
// Step 2
    Node itr = head;

    while(itr != null) {
        if(itr.random != null)
       itr.next.random = itr.random.next;
        
        itr = itr.next.next;
    }
        
// Step 3
        
     Node dummy = new Node(0);
     temp = dummy;
     itr = head;
     Node fast ;  
        while(itr != null){
           fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }
        
       return dummy.next; 
    }
}