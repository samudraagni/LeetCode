class ImplementQueueUsingStacks {
    
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    int front;
    
    // Push element x to the back of queue.
    public void push(int x) {
        if(s1.empty()){
            front = x;
        }
        s1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        /* transfer all elements from non-empty stack to empty stack */
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        
        if(!s2.empty()){
            s2.pop();
            
            if(!s2.empty()){
                front = s2.peek();   
            }
            
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }
    }

    // Get the front element.
    public int peek() {
        return front;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(s1.empty()){
            return true;
        }
        
        return false;
        
    }
}