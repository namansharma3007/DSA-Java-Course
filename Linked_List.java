import java.util.*;

class Linked_List {
    // Node head;
    // private int size;

    // Linked_List(){
    //     this.size=0;
    // }
    // class Node {
    //     String data;
    //     Node next;

    //     Node(String data) {
    //         this.data = data;
    //         this.next = null;
    //         size++;
    //     }
    // }
    
    // public void addFirst(String data) {
    //     Node newNode = new Node(data);
    //     if(head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     newNode.next=head;
    //     head=newNode;
    // }

    // //add - first, last
    // public void addLast(String data){
    //     Node newNode = new Node(data);
    //     if(head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     Node currNode=head;
    //     while(currNode.next != null) {
    //         currNode = currNode.next;
    //     }

    //     currNode.next = newNode;
    // }

    // // print
    // public void printList() {
    //     if(head == null) {
    //         System.out.println("list is empty");
    //         return;
    //     }
    //     Node currNode=head;
    //     while(currNode != null) {
    //         System.out.print(currNode.data + " -> ");
    //         currNode = currNode.next;
    //     }
    //     System.out.println("null");
    // }
    // //delete first
    // public void deleteFirst(){
    //     if(head == null){
    //         System.out.println("The list is empty");
    //         return;
    //     }
    //     size--;
    //     head = head.next;

    // }

    // // delete last
    // public void deleteLast() {
    //     if(head == null){
    //         System.out.println("The list is empty");
    //         return;
    //     }
    //     size--;
    //     if(head.next == null) {
    //         head = null;
    //         return;
    //     }

    //     Node secondLast = head;
    //     Node lastNode = head.next;
    //     while(lastNode.next != null) {
    //         lastNode = lastNode.next;
    //         secondLast =secondLast.next;
    //     }

    //     secondLast.next = null;
    // }
    //  public int getSize(){
    //     return size;
    //  }
    public static void main(String[] args) {
        // Linked_List list=new Linked_List();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");

        // list.printList();

        // list.addFirst("This");
        // list.printList();
        

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // System.out.println(list.getSize());

        // list.addFirst("this");

        // System.out.println(list.getSize());

        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");

        System.out.println(list);

        System.out.println(list.size());

        for(String i: list){
            System.out.print(i+" -> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();

        // System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}