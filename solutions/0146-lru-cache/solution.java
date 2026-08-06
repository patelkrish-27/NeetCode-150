public class Node {
    int val, key;
    Node next = null, prev = null;

    public Node(int key, int val) {
        this.val = val;
        this.key = key;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer, Node> map;
    Node head = null;
    Node curr = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            if (map.size() > 1) {
                if (node == head) {
                    head = node.next;
                }
                if (curr != node) {
                    if (node.prev != null) {
                        node.prev.next = node.next;
                    }
                    if (node.next != null) {
                        node.next.prev = node.prev;
                    }
                    curr.next = node;
                    node.prev = curr;
                    node.next = null;
                    curr = node;

                }
            }
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            get(key);
            return;
        }
        if (map.size() == capacity) {
            Node node = head;
            if(capacity == 1){
                head = null;
                curr = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            map.remove(node.key);
        }
        Node node = new Node(key, value);
        if (head == null) {
            head = node;
            curr = node;
        } else {
            node.prev = curr;
            curr.next = node;
            curr = node;
        }
        map.put(key, node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
