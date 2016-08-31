class MinStack {
    
    public class Node{
        int val;
        Node next;
        
        public Node(int value){
            val = value;
        }
    }
    
    private Node head;
    private Node minhead;
    
    public void push(int x) {
        Node node = new Node(x);
        if(head == null){
            head = node;
            minhead = new Node(x);
        }
        else{
            node.next = head;
            head = node;
            
            if(x <= minhead.val){
                Node newMin = new Node(x);
                newMin.next = minhead;
                minhead = newMin;
            }
        }
    }

    public void pop() {
        if(head == null) return;
        
        /* removing first element from linkedlist */
        Node temp = head;
        head = head.next;
        
        if(temp.val == minhead.val){
            minhead = minhead.next;
        }
       
    }

    public int top() {
        if(head == null) return -1;
        
        return head.val;
    }

    public int getMin() {
        if(minhead == null) return -1;
        
        return minhead.val;
    }
}
