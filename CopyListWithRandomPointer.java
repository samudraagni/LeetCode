/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode p = head;
        
        /* Make copies of itself and store between each node in original list */
        while(p != null){
            RandomListNode next = p.next;
            RandomListNode copy = new RandomListNode(p.label);
            p.next = copy;
            copy.next = next;
            p = next;
        }
        
        /* Link the random pointer correctly to the in-between nodes */
        p = head;
        while(p != null){
            p.next.random = (p.random != null)? p.random.next : null;
            p = p.next.next;
        }
        
        /* now, just copy the in-between nodes */
        p = head;
        RandomListNode headcopy = (p != null)? p.next : null;
        while(p != null){
            RandomListNode copy = p.next;
            p.next = copy.next;
            p = p.next;
            copy.next = (p != null)? p.next : null;
        }
        
        return headcopy;
        
    }
}