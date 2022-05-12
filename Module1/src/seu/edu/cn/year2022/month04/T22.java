package seu.edu.cn.year2022.month04;

public class T22 {
    //LRU缓存机制
    public static class LRUCache {
        private class Node {
            int key;
            int value;
            Node pre;
            Node next;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private int capacity;
        private int size;
        private Node head;
        private Node tail;
        private Node[] nodes;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.head = new Node(0, 0);
            this.tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
            nodes = new Node[capacity];
        }

        public int get(int key) {
            if (nodes[key] == null) {
                return -1;
            }
            moveToHead(nodes[key]);
            return nodes[key].value;
        }

        public void put(int key, int value) {
            if (nodes[key] == null) {
                Node node = new Node(key, value);
                nodes[key] = node;
                addToHead(node);
                size++;
                if (size > capacity) {
                    removeTail();
                }
            } else {
                nodes[key].value = value;
                moveToHead(nodes[key]);
            }
        }

        private void addToHead(Node node) {
            node.next = head.next;
            head.next.pre = node;
            head.next = node;
            node.pre = head;
        }

        private void removeTail() {
            Node node = tail.pre;
            node.pre.next = tail;
            tail.pre = node.pre;
            nodes[node.key] = null;
            size--;
        }

        private void moveToHead(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
            addToHead(node);
        }
    }
}
