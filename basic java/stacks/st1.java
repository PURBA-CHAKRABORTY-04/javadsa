import java.util.Stack;
class st1{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(45);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
    }
}