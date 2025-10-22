import java.util.ArrayDeque;
import java.util.Deque;
class q2{
    public static void main(String[] args) {
      Deque<Integer> deque = new ArrayDeque<>();
      deque.add(10);
      deque.addLast(45);
      deque.addLast(30);
      System.out.println("Front element: " + deque.peekFirst());
      deque.removeFirst();
      System.out.println("Front element after removal: " + deque.peekFirst());
    }
}