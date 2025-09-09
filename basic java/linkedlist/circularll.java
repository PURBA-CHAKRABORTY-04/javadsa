public class circularll{
  private Node head;
  private Node tail;
  private class Node{
    
        private int val;
        private  Node  next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public void insertatend(int val){
        Node newnode=new Node(val);
      
        if ( head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        tail.next=head;

    }
    public void insertatbeg(int val){
        Node newnode=new Node(val);
        if ( head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
            return;
        }
        newnode.next=head;
        head=newnode;
        tail.next=newnode;  
    }
    public void insertatpos(int val,int pos){
        Node newnode=new Node(val);
        if (pos==0){
            insertatbeg(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp;
       temp.next=newnode;
       if (newnode.next==head){
           tail=newnode;
       }
    }
    
  } 
