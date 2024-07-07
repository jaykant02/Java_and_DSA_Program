package sigma.linkedlist;

public class LinkedListWithoutTail {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);

    }

    public void display() {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addMid() {
        if (head == null) {
            System.out.println("No mid found");
        }
        Node turtle = head;
        Node hare = head;
        while (hare.next != null && hare.next.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }
        System.out.println(turtle.data);
    }
}

class Main{
    public static void main(String[] args) {
        LinkedListWithoutTail list = new LinkedListWithoutTail();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.display();
        list.addMid();
        System.out.println(list.size);
    }
}

