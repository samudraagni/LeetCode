/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        /* reverse half the list, and compare the remaining half to the reversed half */
        ListNode fast = head;
        ListNode slow = head;
        
        ListNode rev;
        rev = null;
        boolean retval = true;
        boolean iseven = true;
        //int revcount = 0;
        
        while(fast != null && fast.next != null){
            //System.out.println("fast val: "+fast.val);
            fast = fast.next.next;
            
            /* reversal part */
            ListNode cur = new ListNode(slow.val);
            cur.next = rev;
            rev = cur;
            //revcount++;
            
            slow = slow.next;
        }
        
        if(fast == null) iseven = true;
        else if(fast.next == null) iseven = false;
        
        //System.out.println(iseven);
        
        // ListNode tempSlow = slow;
        // int slowcount = 0;
        // while(tempSlow != null){
        //     slowcount++;
        //     tempSlow = tempSlow.next;
        // }
        
        retval = (iseven)?compare(slow,rev):compare(slow.next, rev);
        
        return retval;
    }
    
    public boolean compare(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null) return false;
        
        while(l1 != null && l2 != null){
            if(l1.val != l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return true;
    }
}