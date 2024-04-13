package DataStructures.LinkedList;

public class DoublyLinkedList {
    class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;

    public DoublyLinkedList(int value){
        this.head = new Node(value);
    }

}

