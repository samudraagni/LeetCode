/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        
        /* use divide and conquer */
        int end = lists.length - 1;
        
        while(end > 0){
            int begin = 0;
            
            while(begin < end){
                lists[begin] = merge(lists[begin], lists[end]);
                begin++;
                end--;
            }
        }
        
        return lists[0];
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
        
        ListNode dummyhead = new ListNode(0);
        ListNode p = dummyhead;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }
            else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        
        if(l1 != null) p.next = l1;
        if(l2 != null) p.next = l2;
        
        return dummyhead.next;
    }
}