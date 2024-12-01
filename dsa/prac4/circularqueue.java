public class circularqueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public circularqueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = capacity - 1;
    }

    // Method to add an item to the queue
    public boolean enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        return true;
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Method to get the front of the queue
    public int front() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    // Method to get the rear of the queue
    public int rear() {
        if (isFull()) {
            return Integer.MIN_VALUE;
        }
        return queue[rear];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        circularqueue circularQueue = new circularqueue(5);

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);

        System.out.println("Front item is: " + circularQueue.front());
        System.out.println("Rear item is: " + circularQueue.rear());

        System.out.println("Removed: " + circularQueue.dequeue());
        System.out.println("Front item is: " + circularQueue.front());

        circularQueue.enqueue(60);
        System.out.println("Rear item is: " + circularQueue.rear());
    }
}

    
