package sigma.linkedlist;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
        this.data = data;
       // this.next = null;
    }
}

        Node Head;
        Node Tail;

       public void addFirst(int data){
            Node newNode = new Node(data);
            if(Head == null){
                Head = Tail= newNode;
                return;
            }
            newNode.next = Head;
            Head = newNode;
        }

        public void addLast(int data){
           Node newNode = new Node(data);
            if(Head == null){
                Head = Tail = newNode;
                return;
            }
            Tail.next = newNode;
            Tail = newNode;
        }

        public void print(){
           if(Head == null){
               System.out.println("List is empty");
           }
            Node temp = Head;
           while(temp != null){
               System.out.print(temp.data + " ");
               temp = temp.next;
           }
           System.out.println();
        }
}

class Main2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.print();


    }
}
