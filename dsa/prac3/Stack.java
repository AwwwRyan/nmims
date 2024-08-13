import java.util.EmptyStackException;

public class Stack {
    private char[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new char[capacity];
        this.top = -1;
    }

    public void push(char element) {
        if (top == capacity - 1) {
           System.out.print("Stack is full");
        } else {
            stackArray[++top] = element;
        }
    }

    public char pop() {
        if (top == -1) {
           return ' ';
        } else {
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
