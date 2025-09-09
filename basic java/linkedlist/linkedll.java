
class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedll {

    // Method to create a linked list and print its elements
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);

    }
}
