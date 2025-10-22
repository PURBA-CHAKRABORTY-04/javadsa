
public class stackk {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public stackk() {
        this(DEFAULT_SIZE);
    }

    public stackk(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isfull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return data[ptr];
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("can't pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
}
