package linkedlist;

import java.util.HashMap;

class Node{
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class Solution {

    // LRU Implementation: Using Doubly LinkedList and HashMap

    int capacity = 0;
    int size = 0;
    HashMap<Integer, Node> map = new HashMap<>();
    Node head = null;
    Node tail = null;

    public Solution(int capacity) {
        this.capacity = capacity;
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            removeNode(n);
            insertNode(n);
            return n.value;
        }
        return -1;
    }

    public void set(int key, int value) {

        if(map.containsKey(key)){
            // HIT
            // Remove the connections of the node
            // Connect its previous to node's next
            // Attach it to the tail of the List
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            insertNode(node);
        }else{
            // MISS
            if(size == capacity){
                // Remove Oldest Node
                // Remove oldest from HashMap
                // Create new Node and add it to HashMap
                // Attach it at tail
                Node temp = head.next;
                map.remove(temp.key);
                removeNode(temp);
                size--;
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertNode(newNode);
            size++;
        }
    }

    private void removeNode(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void insertNode(Node node){
        node.next = tail;
        node.prev = tail.prev;
        node.prev.next = node;
        node.next.prev = node;
    }

    private void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
        }

    }
}

public class LRUImplementation {
    public static void main(String[] args) {

    }
}
