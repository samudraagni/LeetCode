/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /* Use a dummy node to hold the merged list.
        Merge in usual mergesort style.
        
        The problem does not specify how duplicates have to be handled.
        I will assume that the duplicates have to be removed and only one copy should be in the merged list.
        
        Time complexity:
        If there are m1 elements in l1 and m2 elements in l2, then at most there will be (m1+m2) elements in the merged list.
        
        The main operation in merging the lists is comparisons.
        If l1 < l2, then there will be l1 comparisons,
        similarly, if l2 < l1, there will be l2 comparisons.
        Therefore, the total number of comparisons L = Math.min(l1, l2), O(L)
        
        Once we exhaust one list, all that remains to be done is to append the other non-empty list to the dummy head node.
        This appending is a constant time operation O(1).
        
        Space complexity:
        The function returns a pointer to the merged lists. No new nodes are created in the process, but for one dummy node. Therefore O(1).
        
        */
        
        ListNode dummyhead = new ListNode(0);
        ListNode p = dummyhead;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                /* advance l1 pointer */
                l1 = l1.next;
            }
            else{
                p.next = l2;
                /* advance l2 pointer */
                l2 = l2.next;
            }
            
            /* advance p pointer */
            p = p.next;
        }
        
        /* when the while exits, we could still have elements in l1 or l2 */
        if(l1 != null) p.next = l1;
        if(l2 != null) p.next = l2;
        
        /* dummyhead.next points to the start of the merged lists */
        return dummyhead.next;
    }
}