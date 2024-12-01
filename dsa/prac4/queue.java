class Queuee {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queuee(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue khaaliii");
            return;
        }

        System.out.println("Removing " + arr[front]);
        
        //formula--thanks adi
        front = (front + 1) % capacity;
        count--;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;

        System.out.println("Inserting " + item);
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }

    int size() {
        return count;
    }

    boolean isEmpty() {
        if (size() == 0){return true;}
        else{return false;}
    }

    boolean isFull() {
        return (size() == capacity);
    }
}

class Main {
    public static void main(String[] args) {
        Queuee queue = new Queuee(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        
        queue.enqueue(5);

        System.out.println("Queue size is " + queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is not Empty");
        }
    }
}