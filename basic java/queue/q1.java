import java.util.LinkedList;
import java.util.Queue;
class q1{
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);      
        queue.add(45);
        queue.add(30);
        System.out.println("Front element: " + queue.peek());
        queue.remove();
    }
}