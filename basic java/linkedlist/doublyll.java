

public class doublyll{
    private Node head;
    private Node tail;
    private class Node{
        int data;
        Node next;
        Node prev;
      public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
      }
      public Node(int data,Node prev,Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
      }
    }
      public void insertatbeg(int val){
        Node newnode=new Node(val); 
        if (head==null){
        head=newnode;
        tail=newnode;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        newnode.prev=null;
      }
 public void insertatend(int val){
      Node newnode=new Node(val);
      if (head==null){
        head=newnode;
        tail=newnode;
      }
      tail.next=newnode;
      newnode.prev=tail;
      tail=newnode;
 
 }
 public void delatfirst(){
    if(head==null){
        return;
    }
    head=head.next;
    head.prev=null;
 }
 public void delatend(){
    if(head==null){
        return;
    }
    else if(head==tail){
        head=null;
        tail=null;
    }
    else{
        tail.prev.next=null;
        tail=tail.prev;
    }
 }
 public void insertatpos(int val,int index){
    Node newnode=new Node(val);
    if (index==0){
        insertatbeg(val);
        return;
    }
    Node temp=head;
    for(int i=0;i<index-1;i++){
        temp=temp.next;
    }
    newnode.prev=temp;
    newnode.next=temp.next;
    temp.next=newnode;
    if(newnode.next!=null){
        newnode.next.prev=newnode;
    }
    else{
        tail=newnode;
    }
}
public void delatpos(int pos){
  Node nod=head;
  if(head==null){
    return;
  }
  if (head==tail){
     head=null;
     tail=null;
     return;
  }
for(int i=0;i<pos-1;i++){
  nod=nod.next;

}
if(nod==null){
  return;
}
if (nod==tail){
  tail=tail.prev;
  tail.next=null;
}
else{
  nod.next=nod.next.next;
  if(nod.next!=null){
      nod.next.prev=nod;
  }
}

}
  public void display(){
       Node tempp=head;
       while(tempp!=null){
           System.out.print(tempp.data+" ");
           tempp=tempp.next;
       }
  }
  public void reversal(){
    Node current=tail;
    while(current!=head.prev){
      System.out.print(current.data+" ");
      current=current.prev;
    }

  }
  public static void main(String[] args) {
      doublyll dll = new doublyll();
      dll.insertatbeg(10);
      dll.insertatbeg(20);
      dll.insertatend(30);
      dll.insertatpos(25, 2);
      dll.display();
      dll.delatpos(2);
      System.out.println("");
      dll.display();
      System.out.println("");
      dll.reversal();
  }
}