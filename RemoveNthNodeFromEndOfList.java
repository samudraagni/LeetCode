/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        for(int i=0; i < n; i++){
            fast = fast.next;
        }
        
        if(fast == null){
            head = head.next;
            return head;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        
        ListNode cur = slow.next;
        slow.next = cur.next;
        
        
        return head;
        
    }
}