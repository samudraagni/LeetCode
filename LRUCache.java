public class LRUCache {
    /* Key to keep code short is to reuse get(int) in set(): 
    /* after updating value or adding new node, call get() to push the node to head of linked-list. */
    final class Node {
        public Integer key, val;
        public Node next, prev;
        public Node(Integer k, Integer v) {
            key=k; val=v; next = prev = null;
        }
    }

    Node head, tail;
    int cap, size;
    Map<Integer, Node> k2node = new HashMap<Integer, Node>();

    public LRUCache(int capacity) {
        head = tail = null;
        cap = capacity;
        size = 0;
    }

    void insertToHead(Node n) {
        n.next = head; head.prev = n; head = n;
    }

    public int get(int key) {
        Node tar = k2node.get(key);
        if (tar==null) return -1;

        if (tar != head) {
            if (tar == tail) tail = tar.prev;
            tar.prev.next = tar.next;
            if (tar.next != null) tar.next.prev = tar.prev;
            insertToHead(tar);
        }
        return tar.val;
    }

    public void set(int key, int value) {
        if (cap <= 0) return;

        if (k2node.containsKey(key)) {
            k2node.get(key).val = value;
            get(key);
            return;
        }

        if (size < cap) {
            Node n = new Node(key, value);
            k2node.put(key, n);
            size++;
            if (head == null) head = tail = n;
            else insertToHead(n);
        }
        else {
            k2node.remove(tail.key);
            k2node.put(key, tail);
            tail.key = key;
            tail.val = value;
            get(key);
        }
    }
}