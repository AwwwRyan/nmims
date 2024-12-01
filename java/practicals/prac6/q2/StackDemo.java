class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full. Cannot push " + value);
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stack[top];
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        try {
            //System.out.println("Top element is: " + stack.peek());
            stack.push(10);
            stack.push(20);
            System.out.println("Top element is: " + stack.peek());
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackOverflowError | IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
