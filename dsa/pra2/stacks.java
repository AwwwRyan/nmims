import java.util.*;

class stacks {
    int[] stackArray;
    int top;
    int capacity;

    stacks(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    int top() {
        if (top == -1) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {

        stacks stack = new stacks(5);
            
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Top element: " + stack.top());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println((stack.top()==-1)? "stack is empty": ("Top element is: "+stack.top()));

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println((stack.top()==-1)? "stack is empty": ("Top element is: "+stack.top()));
    }
}
