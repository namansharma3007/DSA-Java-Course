package LinkedList;

// here we need to check for null pointer exception
public class DoublyLL {

    private Node head;
    // private Node tail;

    private int size = 0;


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            size++;
            return;
        }
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

        size++;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
           System.out.print(node.val+" -> ");
           last = node;
           node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    
    
    public Node find(int val){
        Node node = head;
        
        while (node != null) {
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        
        return null;
        
    }
    
    public void insert(int after, int val){
        Node p = find(after); 

        if(p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int value){
            this.val = value;
        }

        public Node(int value, Node prev, Node next){
            this.val = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
