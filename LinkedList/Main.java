package LinkedList;


public class Main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(5);
        // list.insertFirst(6);

        // list.insertLast(99);

        // list.insert(45, 3);

        // list.display();
        // System.out.println(list.deleteFirst());

        // list.display();

        // System.out.println(list.deleteLast());
        // list.display();

        // System.out.println(list.delete(2));
        // list.display();

        // list.insertRec(88, 1);
        // list.display();

        // DoublyLL list = new DoublyLL();
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(5);
        // list.insertFirst(6);

        // list.insertLast(99);
        // list.insert(99, 65);

        // list.display();

        // CircularLL list = new CircularLL();
        // list.insert(1);
        // list.insert(2);
        // list.insert(3);
        // list.insert(4);

        // list.delete(3);

        // list.display();
        



        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
       
    }
}
