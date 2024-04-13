package DataStructures.LinkedList;

public class LinkedList {

    public class Node{
        private int value;
        private Node next;

        public int getValue(){
            return this.value;
        }
        public Node(int value){
            this.value = value;
            this.next = null;
        }


    }
    private Node head;
    private int length;

    public LinkedList(int value){
        this.head = new Node(value);
        this.length++;
    }
    public void prePend(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        }else{
            Node temp = this.head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = newNode;
        }
        this.length++;
    }
    public Node pop(){
        if(this.head == null){
            return null;
        }
        Node temp = this.head;
        Node pre = temp;
        while(temp.next!= null){
            pre = temp;
            temp = temp.next;
        }
        pre.next = null;
        if(pre.next == null& temp.next == null){
            this.head = null;
        }
        this.length--;
        return temp;
    }

    public Node popFirst(){
        if(this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length--;
        return temp;
    }

    public Node get(int index){
        if(index <0 || index>this.length){
            return null;
        }
        Node temp = this.head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp;

    }
    public boolean set(int index, int value){
        if(index <0 || index>this.length){
            return false;
        }
        Node temp = this.get(index);
        temp.value = value;
        return true;
    }

    public void addAtIndex(int index,int value){
        Node temp = this.head;
        Node pre = temp;

    }
    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int length(){
        int count = 0;
        Node temp = this.head;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}


