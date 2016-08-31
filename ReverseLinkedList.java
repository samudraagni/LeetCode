/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode secondElement = head.next;
        head.next = null;
        
        ListNode reverseHead = reverseList(secondElement);
        secondElement.next = head;
        
        return reverseHead;
        
    }
}