public class linkedlistco{
    private Node head;
    private Node tail;
    private class Node{
        private int val;
        private Node next;
        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
        public Node(int val){
        
            this.val=val;
            this.next=null; 
            
        }
        
    }
 
    
        public void inseratatbeg(int val){
             Node newnode= new Node(val);
                 if (head==null){
                head=newnode;
                tail=newnode;  // setting tail and head to new node
                return;
            }
             newnode.next=head;
             head=newnode;   
        }
        public void insertatend(int val){
            Node newnode=new Node(val);
            if (head==null){
                head=newnode;
                tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
       // public 
        public int deletefirst(){
           int value=head.val;
            if (head==null){
                return -1;
            }
            head=head.next;
            return value;
        }
        public int deleteatlast(){
            if (head==null){
                return -1;
            }
            if (head==tail){
                int value = head.val;
                head=null;
                tail=null;
                return value;
            }
            Node current=head;
            while(current.next!=tail){
                current=current.next;
            }
            tail=current;
            tail.next=null;
            return tail.val;
        }
        public int deleteatindex(int index){
            if (index==0){
                return deletefirst();

            }
            Node tempp=head;
           // Node current=head;
            for (int i=0;i<index-1;i++){
                if (tempp==null||tempp.next==null){
                    System.out.println("Invalid index");
                         return -1;
                }
                tempp=tempp.next;
                
            }
            if (tempp.next!=null){
                tempp.next=tempp.next.next;
            }
          int v=tempp.val;
          tempp=null;
          return v;



        }
        public int size(){
    Node temp=head;
    int count=0;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    return count;
}
        public void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }

        }
        public void reversal(){
       Node next=null;
       Node prev=null;
       Node current=head;
       while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
       }
       head=prev;

        }

   public static void main(String[] args) {
      linkedlistco list= new linkedlistco();
      list.inseratatbeg(10);
      list.inseratatbeg(20);
      list.inseratatbeg(30);
      list.display();
      System.out.println(" ");
      list.insertatend(40);
      list.insertatend(50);
      list.display();
      list.deletefirst();
      list.deleteatlast();
      list.deleteatindex(1);
      System.out.println(" ");
      list.display();

   }
   }
   
   

