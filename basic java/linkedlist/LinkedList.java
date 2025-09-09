public class LinkedList{
     Node head; 
public static class Node{
    public int data;
    public  Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static LinkedList insert(LinkedList list,int data){
    Node newNode=new Node(data);
    newNode.next=null;
    if (list.head==null){
        list.head=newNode;  
    }
    else {
        Node last= list.head;
        while(last.next !=null){//traversing till the last node
            last = last.next;
        }
        last.next=newNode;
    }
    return list;
}
public static void printList(LinkedList list){
    Node temp=list.head;
    while(temp !=null){
         System.out.println(temp.data+" ");
         temp=temp.next;
    }
}
public static void main(String[]args){
    LinkedList list = new LinkedList();
    list=insert(list,10);
    list=insert(list,20);
    list=insert(list,30);
    list=insert(list,40);
    System.out.println("Elements in the linked list:");
    printList(list);
}

}